package imooc.Map;
import java.util.Comparator;
import imooc.collection.map.Student;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-07 18:31
 **/
public  class StudentComparator implements Comparable<Student>, Comparator<Student> {


    @Override
    public int compareTo(Student o) {
        return 0;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
