package ListInterface;

import java.util.Collection;

public class ArrayList {
    public static void main(String[] args) {
        Collection<String> coll = new java.util.ArrayList<>();
        coll.add("java");
        coll.add("python");
        coll.add("javascript");
        coll.add("kotlin");
        System.out.println(coll);
        System.out.print(coll.size());
        coll.remove("javascript");
        for (String s : coll) {
            System.out.println("\n" + s);
        }
        //Check whether an element is present

        Boolean cont=coll.contains("python");
        System.out.println(cont);


        coll.forEach((element)->{
            System.out.println(element);
        });

        coll.clear();

        System.out.println(coll);

    }
}
