package com.loudountutor.sophist;

import com.loudountutor.sophist.dao.StudentDAO;
import com.loudountutor.sophist.dao.TutorDAO;
import com.loudountutor.sophist.resources.ProfileResource;
import com.loudountutor.sophist.resources.StudentResource;
import com.loudountutor.sophist.resources.TutorResource;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;
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

        //SQL DBI
        final DBIFactory factory = new DBIFactory();
        final DBI sophistDBI = factory.build(environment, sophistConfiguration.getDataSourceFactory(), "mysql");
        final StudentDAO studentDAO = sophistDBI.onDemand(StudentDAO.class);
        final TutorDAO tutorDAO = sophistDBI.onDemand(TutorDAO.class);

        environment.jersey().register(new ProfileResource());
        environment.jersey().register(new StudentResource(studentDAO));
        environment.jersey().register(new TutorResource(tutorDAO));
    }

    public static void main(String[] args) throws Exception {
        new SophistApplication().run(args);
    }
}
