package ArrayList;

import java.util.*;

public class ArrayList2 {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=20;i+=3){
            list.add(i);
        }

        for(int num:list){
            System.out.println(num);
        }

        boolean b= list.contains(11);
        System.out.println(b);

        List<Integer> list2=new ArrayList<>(list);
        Iterator<Integer> itr2=list2.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        for(int j=21;j<=40;j+=5){
            list2.add(j);
        }
        System.out.println(list2);

        List<Integer>list3=new ArrayList<>();
        list3.addAll(list);
        System.out.println("Elements of list3:"+list3);

        System.out.println("\n Is array list 3 empty:"+list3.isEmpty());
        System.out.println("\n First Element:"+list3.get(0));
        System.out.println("\n Last Element:"+list3.get(list3.size()-1));
        System.out.println("\n Hash code:"+list3.hashCode());
        System.out.println("\n 2nd element:"+list3.get(1));
        System.out.println("\n Index of 13:"+list3.indexOf(13));

        list3.remove(4);
        System.out.println(list3);

        list2.removeAll(list);
        System.out.println(list2);

        list3.clear();
        System.out.println(list3);

        List<String> courses=Arrays.asList("Python","Java","C++","C","Javascript","Go","Kotlin");
        for (String course : courses) {
            System.out.println(course);
        }

        List<Integer> unsorted_list=new ArrayList<Integer>();
        unsorted_list.add(4);
        unsorted_list.add(1);
        unsorted_list.add(11);
        unsorted_list.add(5);
        unsorted_list.add(10);

        Collections.sort(unsorted_list);
        System.out.println(unsorted_list);

        Collections.reverse(unsorted_list);
        System.out.println(unsorted_list);






    }
}
