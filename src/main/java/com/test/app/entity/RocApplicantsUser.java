package com.test.app.entity;

import com.test.app.entity.embeddedid.RocApplicantsUserId;

import javax.persistence.*;

@Entity
@Table(name = "APPLICANTS_USER")
public class RocApplicantsUser {
    @EmbeddedId
    private RocApplicantsUserId id;

    @MapsId("rauApplicationNo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RAU_APPLICATION_NO", nullable = false)
    private RocApplicant rauApplicationNo;

    @Column(name = "RAU_FNAME", length = 40)
    private String rauFname;

    @Column(name = "RAU_LNAME", length = 80)
    private String rauLname;

    @Column(name = "RAU_JOBTITLE", length = 100)
    private String rauJobTitle;

    @Column(name = "RAU_DEPT", length = 100)
    private String rauDept;

    @Column(name = "RAU_TEL", length = 25)
    private String rauTel;

    @Column(name = "RAU_FAX", length = 25)
    private String rauFax;

    @Column(name = "RAU_EMAIL", length = 60)
    private String rauEmail;

    @Column(name = "RAU_MAIN", length = 1)
    private String rauMain;

    public RocApplicantsUserId getId() {
        return id;
    }

    public void setId(RocApplicantsUserId id) {
        this.id = id;
    }

    public RocApplicant getRauApplicationNo() {
        return rauApplicationNo;
    }

    public void setRauApplicationNo(RocApplicant rauApplicationNo) {
        this.rauApplicationNo = rauApplicationNo;
    }

    public String getRauFname() {
        return rauFname;
    }

    public void setRauFname(String rauFname) {
        this.rauFname = rauFname;
    }

    public String getRauLname() {
        return rauLname;
    }

    public void setRauLname(String rauLname) {
        this.rauLname = rauLname;
    }

    public String getRauJobTitle() {
        return rauJobTitle;
    }

    public void setRauJobTitle(String rauJobTitle) {
        this.rauJobTitle = rauJobTitle;
    }

    public String getRauDept() {
        return rauDept;
    }

    public void setRauDept(String rauDept) {
        this.rauDept = rauDept;
    }

    public String getRauTel() {
        return rauTel;
    }

    public void setRauTel(String rauTel) {
        this.rauTel = rauTel;
    }

    public String getRauFax() {
        return rauFax;
    }

    public void setRauFax(String rauFax) {
        this.rauFax = rauFax;
    }

    public String getRauEmail() {
        return rauEmail;
    }

    public void setRauEmail(String rauEmail) {
        this.rauEmail = rauEmail;
    }

    public String getRauMain() {
        return rauMain;
    }

    public void setRauMain(String rauMain) {
        this.rauMain = rauMain;
    }
}