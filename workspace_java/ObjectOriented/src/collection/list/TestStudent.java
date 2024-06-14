package collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();

        Student s1 = new Student("java", 92, 98);
        Student s2 = new Student("c++", 76, 70);
        Student s3 = new Student("python", 88, 92);

        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);

        for (Student e : studentsList){
            System.out.println(e.toString());
        }

        System.out.println("--------------------");

        for (int i = 0; i < studentsList.size(); i++){
            if (studentsList.get(i).getTotal() >= 150){

            }

        }



    }
}
