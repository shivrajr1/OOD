public class Vehicle {

    private String vehicleId;
    private VehicleType vehicleType;

    Vehicle(String id,VehicleType type ){
        vehicleId=id;
        vehicleType=type;
    }
    
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public String getVehicleId() {
        return vehicleId;
    }
}
