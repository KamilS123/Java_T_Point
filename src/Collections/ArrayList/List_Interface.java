package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_Interface {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("jeden","dwa","Trzy"));

        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
