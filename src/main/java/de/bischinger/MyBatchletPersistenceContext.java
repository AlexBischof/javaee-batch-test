package de.bischinger;

import javax.batch.api.AbstractBatchlet;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static javax.batch.runtime.BatchStatus.COMPLETED;

/**
 * Created by bischofa on 29/11/16.
 */
public class MyBatchletPersistenceContext extends AbstractBatchlet {

    @PersistenceContext
    private EntityManager em;

    @Override
    public String process() throws Exception {
        System.out.println("MyBatchletPersistenceContext: " + em);

        return COMPLETED.toString();
    }
}
