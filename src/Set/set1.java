package Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class set1 {
    public static void main(String[] args) {
        Set<String>prog=new HashSet<>();
        prog.add("Python");
        prog.add("Java");
        prog.add("Javascript");
        prog.add("C++");
        prog.add("Ruby");
        prog.add("Go");
        prog.add("Kotlin");
        System.out.println(prog);
        prog.add("Java");
        System.out.println(prog);

        Set<Integer> firstFiveEvenNumbers=new HashSet<>();
        for(int i=2;i<=10;i+=2){
            firstFiveEvenNumbers.add(i);
        }
        System.out.println(firstFiveEvenNumbers);


        Set<Integer> firstTenEvenNumbers=new HashSet<>(firstFiveEvenNumbers);
        System.out.println(firstTenEvenNumbers);
        for(int i=12;i<=20;i+=2){
            firstTenEvenNumbers.add(i);
        }
        System.out.println(firstTenEvenNumbers);

        Set<Integer>ts=new TreeSet<>(firstTenEvenNumbers);


        firstFiveEvenNumbers.remove(8);
        System.out.println(firstFiveEvenNumbers);

        firstFiveEvenNumbers.clear();
        System.out.println(firstFiveEvenNumbers);









    }
}
