package at.htl.vehicle.vehicle;

// könnte record sein
/*
public record VehicleDto (...
 */
public class VehicleDto { // Transport über das Netz; Data Transfer Objects
    public Long id;
    public String model;
    public String brand;

    public VehicleDto(Long id, String model, String brand) {
        this.id = id;
        this.model = model;
        this.brand = brand;
    }
}
