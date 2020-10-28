package accommodation;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Company_table")
public class Company {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String companyName;
    private String ownerName;
    private Long companyPhone;
    private String location;
    private String businessType;

    public String getCompanyStatus() {
        return companyStatus;
    }

    public void setCompanyStatus(String companyStatus) {
        this.companyStatus = companyStatus;
    }

    private String companyStatus;

    @PostPersist
    public void onPostPersist(){
        CompanyRegistRequested companyRegistRequested = new CompanyRegistRequested();
        BeanUtils.copyProperties(this, companyRegistRequested);
        companyRegistRequested.publishAfterCommit();


    }


    @PostUpdate
    public void onPostUpdate(){
        System.out.println("...............Company Update Event ");
    }

    @PreRemove
    public void onPreRemove(){

        System.out.println("111");
        RegistCanceled registCanceled = new RegistCanceled();
        BeanUtils.copyProperties(this, registCanceled);
        registCanceled.publishAfterCommit();
        System.out.println("registCanceled.toJson()"+ registCanceled.toJson());
        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        accommodation.external.CompanyManagement companyManagement = new accommodation.external.CompanyManagement();
        // mappings goes here
        companyManagement.setCompanyId(this.getId());
        companyManagement.setCompanyManageStatus("registCancelled");
        CompanyApplication.applicationContext.getBean(accommodation.external.CompanyManagementService.class)
            .companyCancelConfirm(companyManagement);
        //처리 속도 느리게
        try {
            Thread.currentThread().sleep((long) (800 + Math.random() * 220));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public Long getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(Long companyPhone) {
        this.companyPhone = companyPhone;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }




}
