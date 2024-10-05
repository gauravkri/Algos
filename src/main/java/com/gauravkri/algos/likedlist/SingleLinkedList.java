package com.gauravkri.algos.likedlist;

public class SingleLinkedList {

    Node head;


    static class Node{
        int data;
        Node next;
    

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    


    public static SingleLinkedList insert(SingleLinkedList list, int data){
        Node newNode = new Node(data);

        if (list.head == null) {
            list.head=newNode;
        }else{
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next=newNode;
        }

        return list;
    }

    public static void printList(SingleLinkedList list){
        Node  curNode = list.head;

        System.out.println("Single Linked List: ");
        while (curNode != null) {

            System.out.println(curNode.data + " ");
            curNode = curNode.next;    
        }

    }


    public static SingleLinkedList deleteByKey(SingleLinkedList list, int key){
        Node curNode = list.head, preNode = null;

        if (curNode != null && curNode.data == key) {
            list.head = curNode.next;
            System.out.println(key +" found and deleted");
            return list;
        }
        
        while (curNode != null && curNode.data != key) {
            preNode = curNode;
            curNode = curNode.next;
        }

        if (curNode != null) {
            preNode.next = curNode.next;
            System.out.println(key +" found and deleted");
        }

        if (curNode==null) {
            System.out.println(key +" not found");
        }

        return list;
    }


    public static SingleLinkedList deleteByposition(SingleLinkedList list, int index ){
        
        Node curNode=list.head, prNode=null;

        if (curNode != null && index==0) {
            list.head = curNode.next;
            System.out.println(index +" found and deleted");
            return list;
        }

        int counter =0;

        while (curNode != null) {
            if (counter == index) {
                prNode.next=curNode.next;
                System.out.println(index +" found and deleted");
                break;
            }else{
                prNode=curNode;
                curNode = curNode.next;
                counter++;
            }  
        }

        if (curNode==null) {
            System.out.println(index +" not found");
        }
        return list;
    }


    public static void main(String args[]){

        SingleLinkedList list = new SingleLinkedList();
        list = insert(list, 1);
        list =insert(list, 2);

        list = insert(list, 3);

        list = insert(list, 4);

        printList(list);


        deleteByKey(list, 2);
        printList(list);
        deleteByposition(list, 2);
        printList(list);
    }
}
