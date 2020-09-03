import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	IntOnlyArrayList list = new IntOnlyArrayList();

        list.add(12);
        list.add(11);
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6, 15);

        System.out.println(list);
    }

    public static void testIntOnlyArraylist(IntOnlyArrayList list) {
        System.out.println("list index 0: " + " " + list.get(0));
        System.out.println("list index 1: " + " " + list.get(1));
        System.out.println("list index 2: " + " " + list.get(2));
        System.out.println("list index 3: " + " " + list.get(3));
        System.out.println("list index 4: " + " " + list.get(4));
        System.out.println("list index 5: " + " " + list.get(5));
        System.out.println("list index 6: " + " " + list.get(6));
        System.out.println("Size på liste: " + list.size());
        System.out.println("");
    }
}
