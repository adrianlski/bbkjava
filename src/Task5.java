import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names);

        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");

        System.out.println("a: " + names);
        System.out.println("b: " + names.get(0) + " and " + names.get(1));
        System.out.println("c: " + names.size());
        System.out.println("d: " + names.get(names.size() - 1));
        names.set(0, "Alice B Toklas");
        System.out.println("e: " + names);
        names.add(4, "Doug");
        System.out.println("f: " + names);

        for(String name : names) {
            System.out.println("g: " + name);
        }

        ArrayList<String> names2 = new ArrayList<>(names);
        System.out.println("h: " + names2);

        names.remove(0);
        System.out.println("i: " + names);
        System.out.println("i: " + names2);
    }
}
