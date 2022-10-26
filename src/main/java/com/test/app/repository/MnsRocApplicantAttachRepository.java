package com.test.app.repository;

import com.test.app.entity.RocApplicantsAttach;
import com.test.app.entity.embeddedid.RocApplicantsAttachId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Brume
 **/
public interface MnsRocApplicantAttachRepository extends JpaRepository<RocApplicantsAttach, RocApplicantsAttachId> {
}
