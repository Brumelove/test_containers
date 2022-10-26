package com.test.app.repository;

import com.test.app.entity.RocApplicantsContact;
import com.test.app.entity.embeddedid.RocApplicantsContactId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Brume
 **/
public interface MnsRocApplicantContactRepository extends JpaRepository<RocApplicantsContact, RocApplicantsContactId> {
}
