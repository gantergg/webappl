package model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AptkEJB {

    @PersistenceContext(unitName = "meds")
    private EntityManager entityManager;
}
