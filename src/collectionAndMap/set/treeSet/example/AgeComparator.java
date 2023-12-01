package collectionAndMap.set.treeSet.example;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
//        if (o1.getAge() > o2.getAge())
//            return 1;
//        if (o1.getAge() < o2.getAge())
//            return -1;
//        return 0;
        return o1.getAge() - o2.getAge();
    }
}
