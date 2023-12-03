package ClassWork;

import java.util.Arrays;
import java.util.List;

public enum GeoPoliticalZones {
    NORTHCENTRAL("Benue","FCT","Kogi","Kwara","Nasarawa","Niger","Platue"),
    NORTHEAST("Adamawa","Bauchi","Bornu","Gombe","Taraba","Yobe"),
    NORTHWEST("Kaduna","Katsina","Kano","Kebbi","Sokoto","Jigawa","Zamfarawa"),
    SOUTHEAST("Abia","Anambra","Ebonyi","Enugu","Imo"),
    SOUTHSOUTH("Akwa-ibom","Bayelsa","Cross-River","Delta","Edo","Rivers"),
    SOUTHWEST("Ekiti","Lagos","Osun","Ondo","Ogun","oyo");

    private String[] states;

    GeoPoliticalZones(String... zone) {
        this.states = zone;
    }
    public String[] getStates(){
        return states;
    }
    public static GeoPoliticalZones politicalZones(String states){
        GeoPoliticalZones zone = null;
        for (GeoPoliticalZones politicalZones:values()) {
            for (String state:politicalZones.getStates()) {
                if (state.equalsIgnoreCase(states)) {
                    zone = politicalZones;
                    break;
                }
            }
        }
        return zone;
    }

    public static void setStates(String[] states) {
        List<String> listOfState = Arrays.stream(states).toList();
        listOfState.forEach(System.out::println);
    }

    public static void main(String[] args) {
        setStates(new String[]{"Lagos", "Ebonyi", "Osun"});
    }
}