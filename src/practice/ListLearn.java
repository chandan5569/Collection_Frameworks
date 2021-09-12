package practice;

import java.util.ArrayList;
import java.util.List;

public class ListLearn {
    public static void main(String[] args) {

        List<String> li = new ArrayList<>();

        //Adding in the List.  ( Normal Adding )

        //While adding the indexing starts from 0,1,2,3,4,5,-------n.

        li.add("chandan");
        li.add("pranjan");
        li.add("pihu");
        li.add("chiku");
        li.add("piku");
        li.add("minku");
        li.add("chinku");

        //Finding the size of List.

        System.out.println(li.size());

        //Adding in the List at a specific position, it will push the other element at left by one place.

        li.add(0,"rajoo");

        for(String i: li) {
            System.out.println(i);
        }

        System.out.println("After setting rekha the list is: ");

        //Set basically add the item at they specified location without moving forward in the left.

        li.set(7,"rekha");

        li.remove(0);

        System.out.println(li.contains("chandan"));   //Contains method contains the boolean value.

        System.out.println(li.get(0));

        for(String i: li) {
            System.out.println(i);
        }

        //-------------------------------------------------------------------------------------------------------------------------------------

        // Adding two list.

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);

        //Concatinating two list.

        l1.addAll(l2);

        System.out.println(l1.indexOf(10));

        System.out.println(l1.containsAll(l2));

        System.out.println(l1);
    }
}
