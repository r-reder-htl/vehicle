package at.htl.vehicle.rental;

import at.htl.vehicle.person.PersonDto;
import at.htl.vehicle.vehicle.Vehicle;
import at.htl.vehicle.vehicle.VehicleDto;

import java.math.BigDecimal;

public class RentalDto {
    public Long id;
    public VehicleDto vehicle;
    public long personId;
    public long startDateTime;
    public long endDateTime;
    public double discount;


    public RentalDto(Long id, VehicleDto vehicle, long personId, long startDateTime, long endDateTime, double discount) {
        this.id = id;
        this.vehicle = vehicle;
        this.personId = personId;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.discount = discount;
    }
}
