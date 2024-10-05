package com.gauravkri.algos.likedlist;

public class DoublyLinkedList {

    Node head;
    Node tail;
    
    static class Node {
        int data;

        Node prev;
        Node next;
    
        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
        
    }

    public static DoublyLinkedList insertList(DoublyLinkedList list, int data){
        Node newNode = new Node(data);
        if (list.head==null) {
            list.head=newNode;
        }else{
            Node last = list.head;
            while (last.next != null) {
                
            }
        }

        return list;
    }
    
}
