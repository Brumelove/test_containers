package com.test.app.entity;

import com.test.app.entity.embeddedid.RocApplicantsContactId;

import javax.persistence.*;

@Entity
@Table(name = "ROC_APPLICANTS_CONTACT")
public class RocApplicantsContact {
    @EmbeddedId
    private RocApplicantsContactId id;

    @MapsId("racApplicationNo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RAC_APPLICATION_NO", nullable = false)
    private RocApplicant racApplicationNo;

    @Column(name = "RAC_FNAME", length = 40)
    private String racFname;

    @Column(name = "RAC_LNAME", length = 80)
    private String racLname;

    @Column(name = "RAC_JOBTITLE", length = 100)
    private String racJobTitle;

    @Column(name = "RAC_NID", length = 20)
    private String racNid;

    @Column(name = "RAC_TEL", length = 25)
    private String racTel;

    @Column(name = "RAC_FAX", length = 25)
    private String racFax;

    @Column(name = "RAC_EMAIL", length = 60)
    private String racEmail;

    @Column(name = "RAC_MAIN", length = 1)
    private String racMain;

    public RocApplicantsContactId getId() {
        return id;
    }

    public void setId(RocApplicantsContactId id) {
        this.id = id;
    }

    public RocApplicant getRacApplicationNo() {
        return racApplicationNo;
    }

    public void setRacApplicationNo(RocApplicant racApplicationNo) {
        this.racApplicationNo = racApplicationNo;
    }

    public String getRacFname() {
        return racFname;
    }

    public void setRacFname(String racFname) {
        this.racFname = racFname;
    }

    public String getRacLname() {
        return racLname;
    }

    public void setRacLname(String racLname) {
        this.racLname = racLname;
    }

    public String getRacJobTitle() {
        return racJobTitle;
    }

    public void setRacJobTitle(String racJobTitle) {
        this.racJobTitle = racJobTitle;
    }

    public String getRacNid() {
        return racNid;
    }

    public void setRacNid(String racNid) {
        this.racNid = racNid;
    }

    public String getRacTel() {
        return racTel;
    }

    public void setRacTel(String racTel) {
        this.racTel = racTel;
    }

    public String getRacFax() {
        return racFax;
    }

    public void setRacFax(String racFax) {
        this.racFax = racFax;
    }

    public String getRacEmail() {
        return racEmail;
    }

    public void setRacEmail(String racEmail) {
        this.racEmail = racEmail;
    }

    public String getRacMain() {
        return racMain;
    }

    public void setRacMain(String racMain) {
        this.racMain = racMain;
    }
}