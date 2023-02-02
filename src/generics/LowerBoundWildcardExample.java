package generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcardExample {
    public static void main(String[] args) {

        List<Family> family = new ArrayList<>();
        GrandFather grandFather1 = new GrandFather();
        Father father = new Father();
        Son son = new Son();
        grandFather1.name="Girishbhai";
        father.name ="Bhavinbhai";
        son.name="Yatish";
        family.add(grandFather1);
        family.add(father);
        family.add(son);
        addMember(family);
    }
    public static void addMember(List<? super Father> list){
        System.out.println("List before Modify"+list);
        Son son = new Son();
        son.name="Nandani";
        list.add(son);
        System.out.println("List After Modify"+list);
    }

}
