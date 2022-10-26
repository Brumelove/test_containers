package com.test.app.entity.embeddedid;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter @Setter
public class RocApplicantsUserId implements Serializable {
    private static final long serialVersionUID = 9150051140740202154L;
    @Column(name = "RAU_APPLICATION_NO", nullable = false, length = 20)
    private String rauApplicationNo;

    @Column(name = "RAU_SERIAL_NO", nullable = false, length = 3)
    private String rauSerialNo;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RocApplicantsUserId entity = (RocApplicantsUserId) o;
        return Objects.equals(this.rauApplicationNo, entity.rauApplicationNo) &&
                Objects.equals(this.rauSerialNo, entity.rauSerialNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rauApplicationNo, rauSerialNo);
    }

}