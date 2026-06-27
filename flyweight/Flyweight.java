import java.util.HashMap;
import java.util.Map;

public class Flyweight {

    static Map<String,Pawn> pawns=new HashMap<>();

    public static Pawn getPawn(String name, String color){
        String key=name+color;
        if(pawns.containsKey(key)){
            return pawns.get(key);
        }
        return new Pawn(name, color);
    }
}
