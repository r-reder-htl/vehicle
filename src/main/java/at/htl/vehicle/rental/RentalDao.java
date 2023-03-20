package at.htl.vehicle.rental;

import at.htl.vehicle.person.Person;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class RentalDao implements PanacheRepository<Rental> {
/*
    @Inject
    EntityManager em;

    public List<Rental> findAll(){
        return em.createQuery(
                "select r from Rental r",
                        Rental.class)
                .getResultList();
    }

 */
}
