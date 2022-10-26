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
public class RocApplicantsContactId implements Serializable {
    private static final long serialVersionUID = -5245423390181129429L;
    @Column(name = "RAC_APPLICATION_NO", nullable = false, length = 20)
    private String racApplicationNo;

    @Column(name = "RAC_SERIAL_NO", nullable = false, length = 3)
    private String racSerialNo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RocApplicantsContactId entity = (RocApplicantsContactId) o;
        return Objects.equals(this.racApplicationNo, entity.racApplicationNo) &&
                Objects.equals(this.racSerialNo, entity.racSerialNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(racApplicationNo, racSerialNo);
    }

}