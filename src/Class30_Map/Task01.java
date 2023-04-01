package Class30_Map;

import java.util.HashMap;

public class Task01 {
    public static void main(String[] args) {

        /*Create a map of a building. Store floor number and it is associated company name.
        (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
        Check how many entries you have?
        Update company on a 4th floor
        Remove company on the 7th floor
P       rint your map*/

        HashMap<Integer,String> building=new HashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Selab");
        building.put(4,"IBM");
        building.put(5,"Amazon");
        building.put(6,"Dynamic");
        building.put(7,"Selab");

        System.out.println(building.size());
        System.out.println(building);
        System.out.println(building.replace(4,"Dell"));
        System.out.println(building.remove(7));
        System.out.println(building);





    }
}
