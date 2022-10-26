package com.test.app.config;

import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.testcontainers.containers.OracleContainer;

/**
 * Abstract class that contains all configurations required to
 * use embedded containers
 *
 * @author Brume
 */
@ActiveProfiles("test")
@DataJpaTest
@ContextConfiguration(classes = {ApplicantTestConfig.class})
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
@EnableAutoConfiguration
public abstract class AbstractTest {

    public static final String INIT_SCRIPT = "sql/test-container-init.sql";

    public static OracleContainer oracle = OracleTestContainer.getInstance(INIT_SCRIPT);

    @BeforeAll
    static void setUp() {
        if (!oracle.isCreated()) {
            oracle.start();
        }
    }

}
