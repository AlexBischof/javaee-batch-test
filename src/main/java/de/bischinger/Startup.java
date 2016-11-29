package de.bischinger;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import java.util.Properties;

import static javax.batch.runtime.BatchRuntime.getJobOperator;

/**
 * Created by bischofa on 29/11/16.
 */
@Singleton
@javax.ejb.Startup
public class Startup {

    @PostConstruct
    public void init() {
        System.out.println("Hello batchtest");

        getJobOperator().start("mybatchletpersistencecontext", new Properties());
        getJobOperator().start("mybatchletcdi", new Properties());
    }
}
