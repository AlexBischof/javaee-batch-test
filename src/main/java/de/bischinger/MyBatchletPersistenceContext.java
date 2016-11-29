package de.bischinger;

import javax.batch.api.AbstractBatchlet;
import javax.batch.runtime.context.JobContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static java.lang.String.format;
import static javax.batch.runtime.BatchStatus.COMPLETED;

/**
 * Created by bischofa on 29/11/16.
 */
@Named
public class MyBatchletPersistenceContext extends AbstractBatchlet {

    @PersistenceContext
    private EntityManager em;

    @Inject
    JobContext jobContext;

    @Override
    public String process() throws Exception {
        System.out.println(format("MyBatchletPersistenceContext: %s %s", em, jobContext));

        return COMPLETED.toString();
    }
}
