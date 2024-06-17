package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService {
    private List<Emp> empList;
    private Scanner sc;

    public EmpService(){
        sc = new Scanner(System.in);
        empList = new ArrayList<>();

        Emp e1 = new Emp(1001, "김", "개발부", "1111-1111", 200);
        Emp e2 = new Emp(1002, "이", "개발부", "1111-1112", 300);
        Emp e3 = new Emp(1003, "박", "영업부", "1111-1113", 400);
        Emp e4 = new Emp(1004, "최", "영업부", "1111-1114", 250);
        Emp e5 = new Emp(1005, "정", "인사부", "1111-1115", 350);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
    }

        //1번 문제
    public void login(){
        boolean isRunning = true; // while 문 반복 변수
        boolean isFind = false;

        while (isRunning){
            System.out.print("사번 : ");
            int en = sc.nextInt();
            System.out.print("비밀번호(연락처의 마지막 4자리) : ");
            String phone = sc.next();

            //입력한 사번과 비밀번호 일치 여부 확인
            for (Emp e : empList){
                if (e.getEn() == en && e.getPhone().equals(phone)){
                    isRunning = false; // while 문 벗아남
                    System.out.println("로그인 하였습니다.");
                    System.out.println(e.getName() + "님 반갑습니다.");
                    isFind = true;
                }
            }
            if (!isFind) { // '!' : 부정연산자 (참 거짓 반대)
                System.out.println("사번 혹은 비밀번호가 일치하지 않습니다.");
            }
        }
    }

        //2번 문제
    public void printDepartSalary(){
        System.out.print("부서명 : ");
        String depart = sc.next();

        int sum = 0;
        int cnt = 0;
        System.out.println("=="+ depart +"월급 현황==");
        for (int i = 0; i < empList.size(); i++){
            if (empList.get(i).getDepart().equals(depart)){
                System.out.println(empList.get(i));
                sum += empList.get(i).getSalary();
                cnt++;
                System.out.println(empList.get(i).getDepart() + "서의 월급 총액은 " + sum + "원이며, 평균 급여는 " + (sum / (double)cnt) + "원입니다.");
            }
        }

    }

        //3번 문제
    public void increaseSalary(){
        System.out.print("부서명 : ");
        String depart = sc.next();
        System.out.print("인상급여 : ");
        int salary = sc.nextInt();

        System.out.println(depart + "각 사원의 급여가 각각 " + salary + "원씩 인상됩니다.");
        System.out.println("==월급 인상 후 " + depart + " 월급 현황==");

        //급여 인상 코드
        for (Emp e : empList){
            if (e.getDepart().equals(depart)) {
                //int result = e.getSalary() + salary;
                e.setSalary(salary+e.getSalary());
            }
        }

        //인상된 사원 정보 출력
        for (Emp e : empList){
            if (e.getDepart().equals(depart)) {
                System.out.println(e);
            }
        }
    }
}
