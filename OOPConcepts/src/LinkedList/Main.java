package LinkedList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        SingleLinkedList list = new SingleLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addFirst(5);
        int[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(list.indexOf(5));
        System.out.println(list.indexOf(40));
        System.out.println(list.contains(20));
        list.removeFirst();
        int[] arr1 = list.toArray();
        System.out.println(Arrays.toString(arr1));
        list.remove(20);
        int[] arr2 = list.toArray();
        System.out.println(Arrays.toString(arr2));
    }
}
