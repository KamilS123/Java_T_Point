package Collections.ArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Iterator {
    int numberOfPages;
    String namee;

    LinkedList_Iterator(int numberOfPages, String namee) {
        this.namee = namee;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "LinkedList_Iterator{" +
                "numberOfPages=" + numberOfPages +
                ", namee='" + namee + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<String>list = new LinkedList<>(Arrays.asList("Jeden","Dwa","Trzy"));

        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());



        List<LinkedList_Iterator>listaIterator = new LinkedList<>();
        LinkedList_Iterator l1 = new LinkedList_Iterator(300,"Zmierzch");
        LinkedList_Iterator l2 = new LinkedList_Iterator(150,"Zaćmeinie");
        LinkedList_Iterator l3 = new LinkedList_Iterator(190,"Wschód");

        listaIterator.add(l1);
        listaIterator.add(l2);
        listaIterator.add(l3);

//        Iterator iterator = listaIterator.iterator();
//        while(iterator.hasNext())
//            System.out.println(iterator.next());
        for(LinkedList_Iterator lin : listaIterator) {
            System.out.println(lin.namee + " --> " + lin.numberOfPages);
        }
    }
}
