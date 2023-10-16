package CollectionFramework;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        List <String> l= new ArrayList<>();
        l.add("Promod");
        l.add("Dutta");
        l.add("autta");

        Collections.sort(l);

        Iterator i = l.iterator();
        while (i.hasNext())
        {
            //l.add("Lucky"); // .ConcurrentModificationException
          //  l.add("");
            System.out.println(i.next());
        }
        i.remove();
        System.out.println(l);

        /*for (String s:l)
        {
            System.out.println(s);
        }

        ListIterator listIterator = l.listIterator();

        while (listIterator.hasNext())
        {
            listIterator.add("Lucky");
            System.out.println(listIterator.next());
        }
        System.out.println("_______");

        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
*/    }


}
