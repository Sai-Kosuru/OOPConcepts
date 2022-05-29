package LinkedList;

import java.util.NoSuchElementException;

public class SingleLinkedList {
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public boolean isEmpty(){
        return head == null;
    }
   //----------------------------------------------
    public void addLast(int item){
        Node node = new Node(item);
        if(isEmpty())
            head = tail = node;
        else{
            tail.next = node;
            tail = node;
        }
        size++;
    }
   //--------------------------------------------------------
   public void addFirst(int item){
        var node = new Node(item);
        if(isEmpty())
            head = tail = node;
        else{
            node.next = head;
            head = node;
        }
        size++;
   }
   //---------------------------------------------------------------
    public void removeLast() throws NoSuchElementException{
        if(isEmpty())
            throw new NoSuchElementException("No Elements in list");
        if(head == tail){
            head = tail = null;
            size = 0;
        }
        else {
            Node previous = getPrevious(tail);
            tail = previous;
            tail.next = null;
            size--;
        }
    }
    private Node getPrevious(Node node){
        Node current = head;
        while(current != null){
            if(current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }
    //------------------------------------------------------
    public void removeFirst(){
        if(isEmpty())
            throw new NoSuchElementException("No Elements in list");
        if(head == tail){
            head = tail = null;
            size = 0;
        }
        else {
            Node second =head.next;
            head.next = null;
            head = second;
            size--;
        }
    }
    //-------------------------------------------------------------------
    public void remove(int item) {
        if (isEmpty())
            throw new NoSuchElementException("No such Element in the list");
        Node current = head;
        while (current != null) {
            if (current.value == item) {
                Node prev = getPrevious(current);
                prev.next = current.next;
                current.next = null;
                return;
            }
            current = current.next;
        }
    }

    //----------------------------------------------------------------
    public int indexOf(int item){
        int index =0;
        Node current = head;
        while(current != null){
            if(current.value == item)
                return index;
            index++;
            current = current.next;
        }
        return -1;
    }
    //------------------------------------------------------------------
    public boolean contains(int item){
        return indexOf(item) != -1;
    }
    //---------------------------------------------------------------------
    public void reverse(){
        if(isEmpty())
            return;
        Node previous = head;
        Node current = head.next;
        Node nextNode = current.next;
        while (current != null){
            current.next = previous;
            previous = current;
            current = nextNode;
            nextNode = current.next;
        }
        tail = head;
        tail.next = null;
        head = previous;
    }
    //-----------------------------------------------------------------
    public int[] toArray(){
        int[] array = new int[size];
        int index = 0;
        var current = head;
        while(current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }
}
