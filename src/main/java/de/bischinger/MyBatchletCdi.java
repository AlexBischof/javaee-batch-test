package de.bischinger;

import javax.batch.api.AbstractBatchlet;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import static javax.batch.runtime.BatchStatus.COMPLETED;

/**
 * Created by bischofa on 29/11/16.
 */
@Named
public class MyBatchletCdi extends AbstractBatchlet {

    @Inject
    private EntityManager em;

    @Override
    public String process() throws Exception {
        System.out.println("MyBatchletCdi: " + em);

        return COMPLETED.toString();
    }
}
