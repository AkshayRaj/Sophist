/**
 * Created by Akshayraj
 */
package com.loudountutor.sophist;

import com.loudountutor.sophist.dao.StudentDAOImpl;
import com.loudountutor.sophist.resources.StudentResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SophistApplication extends Application<SophistConfiguration> {
    private static final Logger LOGGER = LoggerFactory.getLogger(SophistApplication.class);

    @Override
    public void initialize(Bootstrap<SophistConfiguration> bootstrap) {

    }

    @Override
    public void run(SophistConfiguration sophistConfiguration, Environment environment) throws Exception {
        LOGGER.info("Running SophistApplication");

        environment.jersey().register(new StudentResource(new StudentDAOImpl()));
    }

    public static void main(String[] args) throws Exception {
        new SophistApplication().run(args);
    }
}