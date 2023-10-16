package CollectionFramework.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_01 {

    public static void main(String[] args) {

        Set s = new HashSet();
        s.add("Promod");
        s.add("bhushan");
        s.add("praveen");

        System.out.println(s);
        // List of Students who wants to take part in Event
        // It contains duplicate, some students have done
        // Registeration twice or thrice, How we will remove the
        // Duplicate
        //  Set or List
    }

    Student s1 = new Student("Pramod",26,2);
    Student s4= new Student("Pramod",26,2);

    // s1 == s4 but How set will know?
    // id s1 == id s4 - then it is duplicate set will remove

    Student s2 = new Student("Lucky",43,2);
    Student s3 =s1;
    
    List<Student> studentList = new ArrayList<>();



    Set<Student> studentSet = new HashSet<>();














}
