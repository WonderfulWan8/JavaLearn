package collection.set;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.Set;

public class TreeSetDemo {
    class IntegerComparetor implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }

    public void sort() {
        Set<Integer> ts = new TreeSet<Integer>(new IntegerComparetor());
        ts.add(100);
        ts.add(100);
        ts.add(150);
        ts.add(180);
        System.out.println(ts);
    }

    public static void main(String[] args) {
        new TreeSetDemo().sort();
    }
}
