package de.bischinger;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by bischofa on 29/11/16.
 */
public class Resources {
    @Produces
    @PersistenceContext
    EntityManager em;
}
