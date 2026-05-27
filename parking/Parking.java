import java.util.ArrayList;
import java.util.List;

public class Parking {

    private List<Spot>smallSpots=new ArrayList<>();
    private List<Spot>midSpots=new ArrayList<>();
    private List<Spot>largSpots=new ArrayList<>();
    private int sSize;
    private int mSize;
    private int lSize;

    Parking(int small, int medium, int large){
        this.lSize=large;
        this.mSize=medium;
        this.sSize=small;
    }

    // public List<Spot> getLargSpots() {
    //     return largSpots;
    // }
    // public void setLargSpots(List<Spot> largSpots) {
    //     this.largSpots = largSpots;
    // }
    // public List<Spot> getMidSpots() {
    //     return midSpots;
    // }
    // public void setMidSpots(List<Spot> midSpots) {
    //     this.midSpots = midSpots;
    // }
    // public List<Spot> getSmallSpots() {
    //     return smallSpots;
    // }
    // public void setSmallSpots(List<Spot> smallSpots) {
    //     this.smallSpots = smallSpots;
    // }
    public void park(Vehicle vehicle){
        
        VehicleType vehicleType=vehicle.getVehicleType();
        switch (vehicleType) {
            case Bike:
                if(smallSpots.size()>sSize){
                    System.out.println("there is no spot free for bike");
                    return ;
                }
                Spot bikeSpot=new Spot(SpotType.Small, vehicle.getVehicleId());
                bikeSpot.setVehicle(vehicle);
                smallSpots.add(bikeSpot);
                System.out.println("bike parked");
                break;
            case Car:
                if(midSpots.size()>mSize){
                    System.out.println("there is no spot free for car");
                    return ;
                }
                Spot carSpot=new Spot(SpotType.Medium, vehicle.getVehicleId());
                carSpot.setVehicle(vehicle);
                smallSpots.add(carSpot);
                System.out.println("car parked");
                break;
            default:
                if(largSpots.size()>lSize){
                    System.out.println("there is no spot free for truck or bus");
                    return ;
                }
                Spot truckSpot=new Spot(SpotType.Medium, vehicle.getVehicleId());
                truckSpot.setVehicle(vehicle);
                smallSpots.add(truckSpot);
                System.out.println("truck parked");
                break;
        }
    }
    public void unpark(Vehicle vehicle){}
}
