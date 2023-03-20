package at.htl.vehicle.person;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "X_PERSON")
public class Person {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "P_ID")
    private Long id;

    @Column(name = "P_NAME")
    private String name;

    @Column(name = "P_DOB")
    private LocalDate dob;

    //region constructors
    public Person(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public Person() {
    }
    //endregion

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
