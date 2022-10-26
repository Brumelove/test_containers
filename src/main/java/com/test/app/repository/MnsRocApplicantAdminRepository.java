package com.test.app.repository;

import com.test.app.entity.RocApplicantsAdm;
import com.test.app.entity.embeddedid.RocApplicantsAdmId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Brume
 **/
public interface MnsRocApplicantAdminRepository extends JpaRepository<RocApplicantsAdm, RocApplicantsAdmId> {
}
