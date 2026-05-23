import java.util.ArrayList;
import java.util.List;

public class Manager {
    List<Spot>spots=new ArrayList<>();
    public List<Spot> getSpots() {
        return spots;
    }
    public boolean isFree(SpotType spotType){
        for(Spot spot:spots){
            if(spot.isFree())return true;
        }
        return false;
    }
}
