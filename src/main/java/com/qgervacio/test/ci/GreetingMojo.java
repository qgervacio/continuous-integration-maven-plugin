package com.qgervacio.test.ci;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "sayHi")
public class GreetingMojo extends AbstractMojo {

    @Parameter(property = "sayHi.greeting", defaultValue = "Hello World!")
    private String greeting;

    public void execute() throws MojoExecutionException, MojoFailureException {
        this.getLog().info(this.greeting);
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
