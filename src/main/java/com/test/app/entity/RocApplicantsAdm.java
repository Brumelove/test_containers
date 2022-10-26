package com.test.app.entity;

import com.test.app.entity.embeddedid.RocApplicantsAdmId;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ROC_APPLICANTS_ADM")
@RequiredArgsConstructor
public class RocApplicantsAdm {
    @EmbeddedId
    private RocApplicantsAdmId id;

    @MapsId("raaApplicationNo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RAA_APPLICATION_NO", nullable = false)
    private RocApplicant raaApplicationNo;

    @Column(name = "RAA_FNAME", length = 40)
    private String raaFname;

    @Column(name = "RAA_LNAME", length = 80)
    private String raaLname;

    @Column(name = "RAA_JOBTITLE", length = 100)
    private String raaJobTitle;

    @Column(name = "RAA_DEPT", length = 100)
    private String raaDept;

    @Column(name = "RAA_TEL", length = 25)
    private String raaTel;

    @Column(name = "RAA_FAX", length = 25)
    private String raaFax;

    @Column(name = "RAA_EMAIL", length = 60)
    private String raaEmail;

    @Column(name = "RAA_MAIN", length = 1)
    private String raaMain;

    public RocApplicantsAdmId getId() {
        return id;
    }

    public void setId(RocApplicantsAdmId id) {
        this.id = id;
    }

    public RocApplicant getRaaApplicationNo() {
        return raaApplicationNo;
    }

    public void setRaaApplicationNo(RocApplicant raaApplicationNo) {
        this.raaApplicationNo = raaApplicationNo;
    }

    public String getRaaFname() {
        return raaFname;
    }

    public void setRaaFname(String raaFname) {
        this.raaFname = raaFname;
    }

    public String getRaaLname() {
        return raaLname;
    }

    public void setRaaLname(String raaLname) {
        this.raaLname = raaLname;
    }

    public String getRaaJobTitle() {
        return raaJobTitle;
    }

    public void setRaaJobTitle(String raaJobTitle) {
        this.raaJobTitle = raaJobTitle;
    }

    public String getRaaDept() {
        return raaDept;
    }

    public void setRaaDept(String raaDept) {
        this.raaDept = raaDept;
    }

    public String getRaaTel() {
        return raaTel;
    }

    public void setRaaTel(String raaTel) {
        this.raaTel = raaTel;
    }

    public String getRaaFax() {
        return raaFax;
    }

    public void setRaaFax(String raaFax) {
        this.raaFax = raaFax;
    }

    public String getRaaEmail() {
        return raaEmail;
    }

    public void setRaaEmail(String raaEmail) {
        this.raaEmail = raaEmail;
    }

    public String getRaaMain() {
        return raaMain;
    }

    public void setRaaMain(String raaMain) {
        this.raaMain = raaMain;
    }
}