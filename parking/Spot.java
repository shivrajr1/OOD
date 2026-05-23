public class Spot {

    private SpotType spotType;
    private String spotId;
    private boolean isFree;

    Spot(SpotType spotType, String spotId){
        this.spotId=spotId;
        this.spotType=spotType;
        isFree=true;
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
