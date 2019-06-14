package com.qgervacio.test.ci;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;

import java.io.File;

public class GreetingMojoTest extends AbstractMojoTestCase {

    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testMojoGoal() throws Exception {
        final File pom = getTestFile("src/test/resources/plugin-test.xml");
        assertNotNull(pom);
        assertTrue(pom.exists());

        final GreetingMojo myMojo = (GreetingMojo) lookupMojo("sayHi", pom);
        assertNotNull(myMojo);
        myMojo.execute();
    }
}