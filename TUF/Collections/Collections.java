import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Collections {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(10);
        aList.add(16);
        aList.add(12);
        System.out.println(aList);
        aList.add(1, 17);
        System.out.println(aList);

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        System.out.println(ll);
        ll.addFirst(3);
        System.out.println(ll);
        ll.addLast(4);
        System.out.println(ll);

        // LIFO - Last In First Out
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(4);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        System.out.println(vector);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        System.out.println(hashSet);
    }
}
