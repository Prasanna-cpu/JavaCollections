package LinkedList;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> fruits=new LinkedList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("cherry");
        fruits.add("mango");
        fruits.add("papaya");

        System.out.println("\n Initial Linked List:"+fruits);
        fruits.add(2,"guava");
        System.out.println("\n After modification:"+fruits);

        fruits.addFirst("rasberry");
        System.out.println("After adding first"+fruits);

        fruits.addLast("strawberry");
        System.out.println("After adding last:"+fruits);


        System.out.println("First element:"+fruits.getFirst());
        System.out.println("Last element:"+fruits.getLast());
        System.out.println("Third element:"+fruits.get(3));

        for(String str:fruits){
            System.out.println(str);
        }

        String first=fruits.removeFirst();
        System.out.println("Removing First Element:"+first);
        System.out.println("List:"+fruits);

        String last=fruits.removeLast();
        System.out.println("Removing First Element:"+last);
        System.out.println("List:"+fruits);

        System.out.println(fruits.contains("apple"));

        System.out.println(fruits.indexOf("cherry"));

    }
}
