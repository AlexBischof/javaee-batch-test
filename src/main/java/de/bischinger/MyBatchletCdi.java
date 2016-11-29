package de.bischinger;

import javax.batch.api.AbstractBatchlet;
import javax.batch.runtime.context.JobContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import static java.lang.String.format;
import static javax.batch.runtime.BatchStatus.COMPLETED;

/**
 * Created by bischofa on 29/11/16.
 */
@Named
public class MyBatchletCdi extends AbstractBatchlet {

    @Inject
    private EntityManager em;

    @Inject
    JobContext jobContext;

    @Override
    public String process() throws Exception {
        System.out.println(format("MyBatchletCdi: %s %s", em, jobContext));

        return COMPLETED.toString();
    }
}
