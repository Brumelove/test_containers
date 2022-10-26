package com.test.app.entity;

import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@RequiredArgsConstructor
@Table(name = "APPLICANTS")
public class RocApplicant {
    @Id
    @Column(name = "APPLICATION_NO", nullable = false, length = 20)
    private String id;

    @Column(name = "PERSON")
    private Boolean person;

    @Column(name = "TITLE", length = 35)
    private String title;

    @Column(name = "TITLE_DESCRIPTION", length = 50)
    private String titleDescription;

    @Column(name = "NAME", length = 80)
    private String name;

    @Column(name = "OTHER_NAMES", length = 30)
    private String otherNames;

    @Column(name = "CONTACT_NAME", length = 80)
    private String contactName;

    @Column(name = "CONTACT_JOB_TITLE", length = 80)
    private String contactJobTitle;

    @Column(name = "CITIZEN")
    private char citizen;

    @Column(name = "ID_TYPE", length = 5)
    private String idType;

    @Column(name = "ID_DESCRIPTION", length = 50)
    private String idDescription;

    @Column(name = "CTY_CODE", length = 5)
    private String ctyCode;

    @Column(name = "ID_NO", length = 30)
    private String idNo;

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
    private String telephone;

    @Column(name = "FAX", length = 25)
    private String fax;

    @Column(name = "EMAIL", nullable = false, length = 60)
    private String email;

    @Column(name = "SCENTRE_FLAG", nullable = false)
    private char scentreFlag;

    @Column(name = "SCENTRE_TYPE", length = 50)
    private String scentreType;

    @Column(name = "STATUS", nullable = false, length = 2)
    private String status;

    @Column(name = "REMARKS", length = 500)
    private String remarks;

    @Column(name = "IP_ADDRESS", nullable = false, length = 20)
    private String ipAddress;

    @Column(name = "CREATE_DATE", nullable = false)
    private LocalDate createDate;

    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 20)
    private String lastUpdatedBy;

    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private LocalDate lastUpdateDate;

    @Column(name = "FIRSTNAME", length = 80)
    private String firstname;

    @Column(name = "NATURE_OF_BUSINESS", length = 3)
    private String natureOfBusiness;

    @Column(name = "TYPE", length = 4)
    private String type;

    @Column(name = "OTHERS", length = 80)
    private String others;

    @Column(name = "COMPANY_FILE", length = 20)
    private String companyFile;

    @Column(name = "ID", length = 2)
    private String id1;

    @Column(name = "NID_PASSPORT", length = 25)
    private String nidPassport;

    @OneToMany(mappedBy = "rauApplicationNo")
    private Set<RocApplicantsUser> mnsRocApplicantsUsers;

    @OneToMany(mappedBy = "raaApplicationNo")
    private Set<RocApplicantsAdm> mnsRocApplicantsAdms;

    @OneToMany(mappedBy = "racApplicationNo")
    private Set<RocApplicantsContact> rocApplicantsContacts;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getPerson() {
        return person;
    }

    public void setPerson(Boolean person) {
        this.person = person;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleDescription() {
        return titleDescription;
    }

    public void setTitleDescription(String titleDescription) {
        this.titleDescription = titleDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactJobTitle() {
        return contactJobTitle;
    }

    public void setContactJobTitle(String contactJobTitle) {
        this.contactJobTitle = contactJobTitle;
    }

    public char getCitizen() {
        return citizen;
    }

    public void setCitizen(char citizen) {
        this.citizen = citizen;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdDescription() {
        return idDescription;
    }

    public void setIdDescription(String idDescription) {
        this.idDescription = idDescription;
    }

    public String getCtyCode() {
        return ctyCode;
    }

    public void setCtyCode(String ctyCode) {
        this.ctyCode = ctyCode;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
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

    public char getScentreFlag() {
        return scentreFlag;
    }

    public void setScentreFlag(char scentreFlag) {
        this.scentreFlag = scentreFlag;
    }

    public String getScentreType() {
        return scentreType;
    }

    public void setScentreType(String scentreType) {
        this.scentreType = scentreType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public LocalDate getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(LocalDate lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getNatureOfBusiness() {
        return natureOfBusiness;
    }

    public void setNatureOfBusiness(String natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getCompanyFile() {
        return companyFile;
    }

    public void setCompanyFile(String companyFile) {
        this.companyFile = companyFile;
    }

    public String getId1() {
        return id1;
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public String getNidPassport() {
        return nidPassport;
    }

    public void setNidPassport(String nidPassport) {
        this.nidPassport = nidPassport;
    }

    public Set<RocApplicantsUser> getMnsRocApplicantsUsers() {
        return mnsRocApplicantsUsers;
    }

    public void setMnsRocApplicantsUsers(Set<RocApplicantsUser> mnsRocApplicantsUsers) {
        this.mnsRocApplicantsUsers = mnsRocApplicantsUsers;
    }

    public Set<RocApplicantsAdm> getMnsRocApplicantsAdms() {
        return mnsRocApplicantsAdms;
    }

    public void setMnsRocApplicantsAdms(Set<RocApplicantsAdm> mnsRocApplicantsAdms) {
        this.mnsRocApplicantsAdms = mnsRocApplicantsAdms;
    }

    public Set<RocApplicantsContact> getMnsRocApplicantsContacts() {
        return rocApplicantsContacts;
    }

    public void setMnsRocApplicantsContacts(Set<RocApplicantsContact> rocApplicantsContacts) {
        this.rocApplicantsContacts = rocApplicantsContacts;
    }
}