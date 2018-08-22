package Collections.ArrayList;

import java.util.HashMap;
import java.util.Map;

public class ClassToMap {
    private String name;
    private String surname;

    ClassToMap(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public static void main(String[] args) {
        Map<Integer,ClassToMap>map = new HashMap<>();
        map.put(1,new ClassToMap("Janek","Sosnowy"));
        map.put(2,new ClassToMap("Dawid","Kownaski"));


        for(Map.Entry<Integer,ClassToMap>m : map.entrySet()) {
        int key = m.getKey();
        ClassToMap v = m.getValue();

            System.out.println(v.name + " " + v.surname);
        }
    }
}
