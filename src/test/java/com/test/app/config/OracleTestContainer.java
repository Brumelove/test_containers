package com.test.app.config;

import org.testcontainers.containers.OracleContainer;

/**
 * Class to customize oracle container
 *
 * @author Brume
 */
public class OracleTestContainer extends OracleContainer {

    /**
     * Test database connection url
     */
    public static final String DB_CONNECTION_URL = "DB_URL";
    /**
     * Database system user
     */
    public static final String DB_USERNAME = "DB_USERNAME";
    /**
     * Database system user password
     */
    public static final String DB_PASSWORD = "DB_PASSWORD";
    private static final String IMAGE_VERSION = "oracleinanutshell/oracle-xe-11g:1.0.0";
    private static OracleTestContainer container;

    private OracleTestContainer() {
        super(IMAGE_VERSION);
    }

    public static OracleTestContainer getInstance(String initScriptPath) {
        if (container == null) {
            container = new OracleTestContainer();
            container.withInitScript(initScriptPath);
            container.start();
        }
        return container;
    }

    @Override
    public void start() {
        super.start();
        System.setProperty(DB_CONNECTION_URL, container.getJdbcUrl());
        System.setProperty(DB_USERNAME, container.getUsername());
        System.setProperty(DB_PASSWORD, container.getPassword());
    }

}
