package service;

import model.Med;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class MedService {

    private EntityManager em;

    public MedService(EntityManager em){
        this.em = em;
    }

    public Med createMed(Integer medId, String name, Integer price){
        Med med = new Med(medId, name, price);
        em.persist(med);
        return med;
    }
    public void removeMed(Integer medId){
        Med med = em.find(Med.class, medId);

        if (med != null){
            em.remove(med);
        }
    }

    public Med changeMedPrice(Integer medId, Integer price){
        Med med = em.find(Med.class, medId);

        if (med != null){
            med.setPrice(price);
        }
        return med;
    }

    public Med findMed(Integer medId){
        return em.find(Med.class, medId);
    }

    public List<Med> findAllMed() {
        TypedQuery<Med> query = em.createQuery("SELECT m from Med m", Med.class);
        return query.getResultList();
    }
}
