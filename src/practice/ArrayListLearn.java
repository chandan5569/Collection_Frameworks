package practice;

import java.util.*;

public class ArrayListLearn {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
//
//        //Iterating over list.
//
//        for (int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }
//
//        for (Integer element:list
//             ) {
//            System.out.println("forEach element"+element);
//        }

        list.remove(1);
        System.out.println(list);

//        list.set(1,10);
//        System.out.println(list.contains(10));
//        System.out.println(list);
//
//        list.add(0,0);   //add at any specific position.

//        List<Integer> newList = new ArrayList<>();
//
//        newList.add(1);
//        newList.add(2);
//        newList.add(3);

       // list.addAll(newList);

        //System.out.println(list);



//        List<String> l1 = new ArrayList<>();
//        l1.add("chandan");
//        l1.add("kumar");
//        l1.add("singh");
//        l1.add("delhi");
//
//        l1.add(1,"pinki");
//
//        System.out.println(l1);

//        Stack<String> a = new Stack<>();
//
//        a.push("cat");
//        a.push("dog");
//        a.push("monkey");
//        a.push("delhi");
//
//        System.out.println(a);
//
//        System.out.println(a.peek());
//
//        System.out.println(a.pop());
//
//        System.out.println(a.peek());

//        Queue<Integer> q = new LinkedList<>();
//
//        //Offer is used to add the data in the queue.
//
//        q.offer(1);
//        q.offer(2);
//        q.offer(3);
//        q.offer(4);
//        q.offer(5);
//        q.offer(6);
//        q.offer(7);
//        q.offer(8);
//        q.offer(9);
//
//        System.out.println(q);
//
//        //Poll is to remove the element which is first in.
//
//        q.poll();
//
//        System.out.println(q);
//
//        System.out.println(q.peek());

    }
}
