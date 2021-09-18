package practice;

import java.util.LinkedList;

public class linklist {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        //add

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        System.out.println(ll);

        //push

        ll.push(10);
        ll.push(11);

        System.out.println(ll);

        //pop

        System.out.println(ll.pop());
        System.out.println(ll.pop());
        System.out.println(ll.pop());
        System.out.println(ll.pop());
        System.out.println(ll.pop());

        //traversing in the list.

        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }

        //addFirst

        ll.addFirst(55);
        ll.addFirst(65);

        //addLast.

        ll.addLast(69);
        ll.addLast(79);

        //getFirst

       System.out.println(ll.getFirst());

        //getLast

        System.out.println(ll.getLast());

        //head (first element) of this list.

       System.out.println(ll.peek());

        //head (first element) of this list.

        System.out.println(ll.element());

        //offer will add at the tail.

        ll.offer(10);
        ll.offer(11);
        ll.offer(12);
        ll.offer(13);
        ll.offer(14);
        ll.offer(15);

       System.out.println(ll);

        //Insert at the first of the list.
        ll.offerFirst(55);

        //Insert at the last of the list.
        ll.offerLast(65);

        System.out.println(ll);

        //Retrieve and Not remove the head of the List.

        System.out.println(ll.peek());

        //First

       System.out.println(ll.peekFirst());

        //Last

        System.out.println(ll.peekLast());

        //Poll is used for the retrieve and Remove for the head of the list.

        System.out.println(ll.poll());

        System.out.println(ll.pollFirst());

        System.out.println(ll.pollLast());


    }
}
