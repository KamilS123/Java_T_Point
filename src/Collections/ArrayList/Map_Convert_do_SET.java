package Collections.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

public class Map_Convert_do_SET {
    public static void main(String[] args) {
        Map<Integer,String>map = new HashMap<>();
        map.put(1,"jeden");
        map.put(2,"dwa");
        map.put(3,"trzy");
        map.put(4,"cztery");
        map.put(5,"pięć");

        for(Map.Entry m : map.entrySet())
            System.out.println(m.getKey() + " --> " + m.getValue());


        Set set = map.entrySet();               //konwersja mapy do set

        Iterator it = set.iterator();               //iteruje po mapie i wyswietla
        while(it.hasNext()){
            Map.Entry para = (Map.Entry) it.next();
            System.out.println(para.getKey() + " " + para.getValue());
        }

        System.out.println(map);   //wyswietla mape
        map.remove(1);
        System.out.println("usunieto pierwszy element: " + map);
    }
}
