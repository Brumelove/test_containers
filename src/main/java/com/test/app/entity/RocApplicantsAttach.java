package com.test.app.entity;

import com.test.app.entity.embeddedid.RocApplicantsAttachId;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "ROC_APPLICANTS_ATTACH")
public class RocApplicantsAttach {
    @EmbeddedId
    private RocApplicantsAttachId id;

    @Column(name = "RAA_LOCAL_FNAME", length = 1024)
    private String raaLocalFname;

    @Column(name = "RAA_ORG_FNAME", length = 1024)
    private String raaOrgFname;

    @Column(name = "RAA_FILE_PATH", length = 2048)
    private String raaFilePath;

    @Column(name = "RAA_DT_UPLOADED")
    private LocalDate raaDtUploaded;

    public RocApplicantsAttachId getId() {
        return id;
    }

    public void setId(RocApplicantsAttachId id) {
        this.id = id;
    }

    public String getRaaLocalFname() {
        return raaLocalFname;
    }

    public void setRaaLocalFname(String raaLocalFname) {
        this.raaLocalFname = raaLocalFname;
    }

    public String getRaaOrgFname() {
        return raaOrgFname;
    }

    public void setRaaOrgFname(String raaOrgFname) {
        this.raaOrgFname = raaOrgFname;
    }

    public String getRaaFilePath() {
        return raaFilePath;
    }

    public void setRaaFilePath(String raaFilePath) {
        this.raaFilePath = raaFilePath;
    }

    public LocalDate getRaaDtUploaded() {
        return raaDtUploaded;
    }

    public void setRaaDtUploaded(LocalDate raaDtUploaded) {
        this.raaDtUploaded = raaDtUploaded;
    }
}