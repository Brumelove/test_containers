package com.test.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "ROC_COMPANIES")
public class RocCompany {
    @Id
    @Column(name = "ROCP_ID", nullable = false)
    private Long id;

    @Column(name = "SUBSCRIBER_ID", nullable = false, length = 10)
    private String subscriberId;

    @Column(name = "COMP_ID", length = 10)
    private String compId;

    @Column(name = "NAME", length = 80)
    private String name;

    @Column(name = "ADDRESS1", length = 50)
    private String address1;

    @Column(name = "ADDRESS2", length = 50)
    private String address2;

    @Column(name = "ADDRESS3", length = 50)
    private String address3;

    @Column(name = "ADDRESS4", length = 50)
    private String address4;

    @Column(name = "ADDRESS5", length = 8)
    private String address5;

    @Column(name = "TEL", length = 25)
    private String tel;

    @Column(name = "FAX", length = 25)
    private String fax;

    @Column(name = "EMAIL", length = 35)
    private String email;

    @Column(name = "COMPANY_CATEGORY", length = 5)
    private String companyCategory;

    @Column(name = "BUSINESS_CATEGORY", length = 5)
    private String businessCategory;

    @Column(name = "INCORPORATION_DATE")
    private LocalDate incorporationDate;

    @Column(name = "BRN_FLAG")
    private Boolean brnFlag;

    @Column(name = "ROC_FLAG")
    private Boolean rocFlag;

    @Column(name = "BUSINESS_NUMBER", length = 20)
    private String businessNumber;

    @Column(name = "COMPANY_NUMBER", length = 20)
    private String companyNumber;

    @Column(name = "CREATE_DT")
    private LocalDate createDt;

    @Column(name = "MODIFIED_DT")
    private LocalDate modifiedDt;

    @Column(name = "COMPANY_TYPE", length = 10)
    private String companyType;

    @Column(name = "ID_TYPE", length = 3)
    private String idType;

    @Column(name = "NID_PASSPORT", length = 20)
    private String nidPassport;

    @Column(name = "PERSON_NAME", length = 40)
    private String personName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    public String getAddress5() {
        return address5;
    }

    public void setAddress5(String address5) {
        this.address5 = address5;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyCategory() {
        return companyCategory;
    }

    public void setCompanyCategory(String companyCategory) {
        this.companyCategory = companyCategory;
    }

    public String getBusinessCategory() {
        return businessCategory;
    }

    public void setBusinessCategory(String businessCategory) {
        this.businessCategory = businessCategory;
    }

    public LocalDate getIncorporationDate() {
        return incorporationDate;
    }

    public void setIncorporationDate(LocalDate incorporationDate) {
        this.incorporationDate = incorporationDate;
    }

    public Boolean getBrnFlag() {
        return brnFlag;
    }

    public void setBrnFlag(Boolean brnFlag) {
        this.brnFlag = brnFlag;
    }

    public Boolean getRocFlag() {
        return rocFlag;
    }

    public void setRocFlag(Boolean rocFlag) {
        this.rocFlag = rocFlag;
    }

    public String getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public LocalDate getCreateDt() {
        return createDt;
    }

    public void setCreateDt(LocalDate createDt) {
        this.createDt = createDt;
    }

    public LocalDate getModifiedDt() {
        return modifiedDt;
    }

    public void setModifiedDt(LocalDate modifiedDt) {
        this.modifiedDt = modifiedDt;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getNidPassport() {
        return nidPassport;
    }

    public void setNidPassport(String nidPassport) {
        this.nidPassport = nidPassport;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

}