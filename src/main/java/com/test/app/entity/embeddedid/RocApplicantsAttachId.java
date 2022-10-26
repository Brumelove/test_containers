package com.test.app.entity.embeddedid;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class RocApplicantsAttachId implements Serializable {
    private static final long serialVersionUID = 4166544845696212755L;
    @Column(name = "RAA_APPLICATION_NO", nullable = false, length = 23)
    private String raaApplicationNo;

    @Column(name = "RAA_SERIAL_NO", nullable = false, length = 3)
    private String raaSerialNo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RocApplicantsAttachId entity = (RocApplicantsAttachId) o;
        return Objects.equals(this.raaApplicationNo, entity.raaApplicationNo) &&
                Objects.equals(this.raaSerialNo, entity.raaSerialNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raaApplicationNo, raaSerialNo);
    }

}