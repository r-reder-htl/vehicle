package at.htl.vehicle.person;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class PersonTest {

    @Test
    void itShouldHaveNameSusi_givenNameSusi() {
        final String name = "Susi";
        var person = new Person(
                name,
                LocalDate.of(2000,
                        Month.APRIL,
                        12));
        assertThat(person.getName()).isEqualTo(name);
    }


}