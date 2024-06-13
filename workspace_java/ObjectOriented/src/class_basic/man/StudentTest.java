package class_basic.man;

//배열 + 클래스
public class StudentTest {
    public static void main(String[] args) {
        //학생(Student class)을 5명 저장할 수 있는 배열 생성
        Student[] students = new Student[5];

        Student s1 = new Student("김자바", 23, 90);
        Student s2 = new Student("박자바", 30, 79);
        Student s3 = new Student("이자바", 33, 89);
        Student s4 = new Student("강자바", 28, 75);
        Student s5 = new Student("파이썬", 31, 92);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

//        for (int i = 0; i < students.length; i++){
//            students[i].printStudentInfo();
//            System.out.println();
//        }
//
//        System.out.println("-----------------------");
//        //1. for -each 문으로 해결
//        for (Student student : students){
//            student.printStudentInfo();
//        }
//
//        System.out.println("-----------------------");
//
//        //2. 배열에 저장된 학생 중 점수가 80점 이상인 학생의 이름, 나이, 점수 출력
//        for (int i = 0; i < students.length; i++){
//            if (students[i].getScore() >= 80){
//                students[i].printStudentInfo();
//            }
//        }

        //3. 이름이 '박'인 학생을 찾아 해당 학생의 나이를 10으로 변경
        //for, for-each
        for (int i = 0; i < students.length; i++){
            if (students[i].getName().equals("박자바")){
            students[i].setAge(10);
            }
        }

        for (Student student : students){
            if(student.getName().equals("박자바")){
                student.setAge(10);
            }
        }





    }
}
