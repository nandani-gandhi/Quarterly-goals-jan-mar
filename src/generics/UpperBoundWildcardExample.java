package generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcardExample
{
    public static void main(String[] args)
    {
        List<GrandFather> grandFather = new ArrayList<>();
        GrandFather grandFather1 = new GrandFather();
        Father father = new Father();
        Son son = new Son();
        grandFather1.name="Girishbhai";
        father.name ="Bhavinbhai";
        son.name="Yatish";
        grandFather.add(grandFather1);
        grandFather.add(father);
        grandFather.add(son);
        familyTree(grandFather);
    }
    public static void familyTree(List<? extends GrandFather> list){
        for(GrandFather grandFather : list) {
            System.out.println("Class is ." + grandFather.getClass().getName());
            System.out.println(grandFather);
        }
    }
}
class Family{}
class GrandFather extends Family{
    String name;
    @Override
    public String toString() {
        return "GrandFather{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Father extends GrandFather{
    String name;
    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                '}';
    }

}
class Son extends Father{
    String name;
    @Override
    public String toString() {
        return "Son{" +
                "name='" + name + '\'' +
                '}';
    }
}
class GrandSon extends Son{
    String name;
}

