
package accommodation;

public class CompayRegisted extends AbstractEvent {

    private Long id;
    private String companyName;
    private String ownerName;
    private Integer companyPhone;
    private String location;
    private String businesssType;
    private String compasyStatus;
    public String getCompasyLastStatus() {
        return compasyStatus;
    }

    public void setCompasyLastStatus(String compasyLastStatus) {
        this.compasyStatus = compasyLastStatus;
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
    public Integer getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(Integer companyPhone) {
        this.companyPhone = companyPhone;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getBusinesssType() {
        return businesssType;
    }

    public void setBusinesssType(String businesssType) {
        this.businesssType = businesssType;
    }
}
