package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Iterator {
    int rollno;
    String name;
    int age;

    ArrayList_Iterator(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }




    public static void main(String[] args) {
        List<ArrayList_Iterator>lista = new ArrayList<>();
        lista.add(new ArrayList_Iterator(20,"Ken",28));
        lista.add(new ArrayList_Iterator(15,"Jack",29));
        lista.add(new ArrayList_Iterator(12,"Bully",15));




        List<String>l = new ArrayList<>(Arrays.asList("POco2","nigdzie2","poniekad2"));
        List<String> list = new ArrayList<>(Arrays.asList("Jak","Co","Kiedy"));
        list.addAll(l);

        Iterator it = list.iterator();

        while(it.hasNext())                 //iteruje i wyswietla
            System.out.println(it.next());
        System.out.println("----------------");

        for(String s : list)                //for each i wyswietla
            System.out.println(s);
        System.out.println("+++++++++++++++++");

        list.remove("POco2");
        for(String s:list)
            System.out.println(s);                  //usuwa String POco2
        System.out.println("////////////////////");

        list.removeAll(l);
        for(String s:list)                  //usuwa całą liste l
            System.out.println(s);
            System.out.println("////////////////////");

            list.retainAll(l);
        for(String s:list)                  //usuwa całą liste l
            System.out.println(s);
        System.out.println("////////////////////");
    }


}
