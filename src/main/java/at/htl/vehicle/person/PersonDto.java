package at.htl.vehicle.person;

import java.time.LocalDate;

public class PersonDto { // Transport über das Netz; Data Transfer Objects
    public Long id;
    public String name;
    public String dob;

    public PersonDto(Long id, String name, String toString) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
}
