public class Spot {

    private SpotType spotType;
    private String spotId;
    private Vehicle vehicle;
    private boolean isFree;

    Spot(SpotType spotType, String spotId){
        this.spotId=spotId;
        this.spotType=spotType;
        isFree=true;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public String getSpotId() {
        return spotId;
    }
    public SpotType getSpotType() {
        return spotType;
    }
    public boolean isFree() {
        return isFree;
    }
}
