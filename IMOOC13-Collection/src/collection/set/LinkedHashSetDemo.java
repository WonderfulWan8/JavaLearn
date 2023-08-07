package collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> mobileSet = new LinkedHashSet<String>();
        mobileSet.add("17798254965");
        mobileSet.add("18371000833");
        mobileSet.add("183710008888");
        System.out.println(mobileSet);
    }
}
