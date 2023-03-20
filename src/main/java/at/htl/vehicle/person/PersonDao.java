package at.htl.vehicle.person;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class PersonDao implements PanacheRepository<Person> { // Transport zur Datenbank; Data ...
/*
    @Inject
    EntityManager em;

    public Person findById(long id) {
        return em.find(Person.class, id);
    }

 */
}
