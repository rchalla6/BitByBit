import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class JavaCollections {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(10);
        aList.add(16);
        aList.add(12);
        System.out.println(aList);
        aList.add(1, 17);
        System.out.println(aList);

        Iterator<Integer> iterator = aList.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            System.out.println(num);
        }

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        System.out.println(ll);
        ll.addFirst(3);
        System.out.println(ll);
        ll.addLast(4);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
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

        // DS that stores unique elements in any random order
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(0);
        hashSet.add(-1);
        System.out.println(hashSet);
        for (var num : hashSet) {
            System.out.println(num);
        }

        // DS that stores unique elements in sorted order
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(0);
        treeSet.add(-1);
        System.out.println(treeSet);
        System.out.println(treeSet.floor(1)); // <=
        System.out.println(treeSet.ceiling(8)); // >=

        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(2);
        ad.offer(6);
        ad.offer(9);
        ad.offer(10);
        System.out.println(ad);
        ad.poll();
        System.out.println(ad.peek());

        // stores elements
        // and whenever you ask for peek, it gives you the smallest element
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        pq.offer(0);
        pq.offer(5);
        pq.offer(4);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq.peek());

        // key, value
        // Eg: rollNumber is the key, name is the value
        // does not guarantee storing keys in the sorted order
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(1, "Challa");
        mp.put(2, "Raja");
        mp.put(3, "Mohan");
        mp.put(4, "Reddy");
        mp.put(4, "Reddy");
        System.out.println(mp);
        System.out.println(mp.get(3));
        System.out.println(mp.size());
        System.out.println(mp.remove(5));

        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(12, "Challa");
        tm.put(1, "Raja");
        tm.put(8, "Mohan");
        System.out.println(tm.ceilingKey(2));
        System.out.println(tm.floorKey(7));

        Integer pow = (int) Math.pow(2, 5);
        System.out.println(pow);

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(4);
        Collections.sort(al, new Comparator<Integer>() {
            // [num1, num2]
            @Override
            public int compare(Integer num1, Integer num2) {
                // num1 < num2
                if (num1 < num2) {
                    return 1;
                } else if (num1 > num2) {
                    return -1;
                }
                return 0;
            }
        });
        System.out.println(al);
    }
}
