package accommodation.external;

public class CompanyManagement {

    private Long id;
    private Long companyId;
    private String companyName;
    private String ownerName;
    private Integer companyPhone;
    private String location;
    private String businesssType;
    private String companyManageStatus;

    public String getCompanyManageStatus() {
        return companyManageStatus;
    }

    public void setCompanyManageStatus(String companyManageStatus) {
        this.companyManageStatus = companyManageStatus;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
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
