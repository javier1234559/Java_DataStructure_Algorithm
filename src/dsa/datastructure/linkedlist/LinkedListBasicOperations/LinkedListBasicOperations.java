package dsa.datastructure.linkedlist.LinkedListBasicOperations;

import java.util.LinkedList;

public class LinkedListBasicOperations {
    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<Object>();
        linkedList.addFirst(3);
        linkedList.add(1); //at default add is addLast
        linkedList.addLast(2); // the same as add

        //looping through the list
        for (Object object : linkedList) {
            System.out.println(object);
        }

        //add method of LinkedList
        //addFirst
        linkedList.addFirst(99);
        //addLast
        linkedList.addFirst(100);
        //add(index, element)
        linkedList.add(2, 200);
        //add(element)
        //addAll(Collection)
        //addAll(index, Collection)
        //addFirst
        //addLast
        //offer
        //offerFirst
        //offerLast
        //push
        linkedList.push(30); //push is the same as addFirst
        //pop
        //remove
        //removeFirst
        linkedList.remove();
    }

}
