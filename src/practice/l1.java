package practice;

import java.util.ArrayList;
import java.util.Collections;

public class l1 {

    public static void main(String[] args) {

        ArrayList<Integer> li = new ArrayList<>();

        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(5);
        li.add(3);

        System.out.println("Last Index Of: "+li.lastIndexOf(3));  //Last occurrence of the element

        System.out.println("Index Of: "+li.indexOf(3));       //First Occurrence of the element

        System.out.println(li.get(4));

        for (Integer integer : li) {

            System.out.println(integer);
        }

        System.out.println(li.contains(3));

        System.out.println(li.isEmpty());


        System.out.println(li.remove(6));     //remove will remove the element at that index.

        li.forEach((n)-> System.out.println(n));   //Using ForEach Loop in list or ArrayList.

        //Here we can also use the functions in order to print refer Geeks For Geeks. ( Very Cool Feature ).

      Collections.sort(li);
      System.out.println(li);   //for sorting the list.


        //RetainAll in list. It is similar like intersection Operation.

                // Creating an empty array list
                ArrayList<String> bags = new ArrayList<String>();

                // Add values in the bags list.
                bags.add("pen");
                bags.add("pencil");
                bags.add("paper");

                // Creating another array list
                ArrayList<String> boxes = new ArrayList<String>();

                // Add values in the boxes list.
                boxes.add("pen");
                boxes.add("paper");
                boxes.add("books");
                boxes.add("rubber");

                // Before Applying method print both lists
                System.out.println("Bags Contains :" + bags);
                System.out.println("Boxes Contains :" + boxes);

                // Apply retainAll() method to boxes passing bags as parameter
                boxes.retainAll(bags);

                System.out.println("Bags Contains :" + bags);
                System.out.println("Boxes Contains :" + boxes);

            }
        }


