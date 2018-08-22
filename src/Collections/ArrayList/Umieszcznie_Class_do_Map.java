package Collections.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Umieszcznie_Class_do_Map {
    String name;
    String surname;
    int id;
    Umieszcznie_Class_do_Map(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }
    public static void main(String[] args) {
        Map<Integer,Umieszcznie_Class_do_Map>map = new HashMap<>();
        map.put(1,new Umieszcznie_Class_do_Map("Jan","Kowalski",32));
        map.put(2,new Umieszcznie_Class_do_Map("Marek","Magierowski",14));
        map.put(3,new Umieszcznie_Class_do_Map("Franek","Kiszka",48));

        for(Map.Entry<Integer,Umieszcznie_Class_do_Map> m : map.entrySet()) {
            int key = m.getKey();
            Umieszcznie_Class_do_Map u = m.getValue();
            System.out.println(key + " Details");
            System.out.println(u.id + " " + u.surname + " " + u.name);
        }
    }
}
