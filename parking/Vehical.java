public class Vehical {

    private String vehicalId;
    private VehicalType vehicalType;

    Vehical(String id,VehicalType type ){
        vehicalId=id;
        vehicalType=type;
    }
    
    public VehicalType getVehicalType() {
        return vehicalType;
    }
    public String getVehicalId() {
        return vehicalId;
    }
}
