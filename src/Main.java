import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Red");
        ll.add("Green");
        ll.add("Black");
        ll.addLast("Pink");
        ll.addFirst("White");
        System.out.println(ll);
    }
}