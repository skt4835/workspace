package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_Test_1_4 {
    public static void main(String[] args) {
        //1. 문자열을 저장하는 리스트르 만들고 3개의 데이터를 넣어보자.
        //   그 후 리스트에 저장된 3개의 데이터를 출력해보라.

        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("c++");
        list.add("python");

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        //2. 정수를 저장할 수 있는 리스트를 만들고 5개의 정수를
        // scanner를 통해 입력받아 리스트에 저장한다.
        // 리스트에 저장된 모든 데이터의 합을 출력하여라.
        Scanner sc = new Scanner(System.in);

        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("정수 입력 : ");
            int x = sc.nextInt();
            list1.add(x);
        }
        //리스트에 저장된 데이터의 합
        int sum = 0;
        for (int e : list1){
            sum += e;
        }
        System.out.println(sum);

        //3. 이름을 저장하는 리스트를 만들고 리스트에 적당히 데이터를 저장한다.
        // 후 저장된 이름 중 ‘홍길동’이라는 이름이 있다면 ‘해당 이름이 존재합니다.
        // 라는 문구를 출력하는 프로그램을 만들어라.
        List<String> list2 = new ArrayList<>();
        list2.add("홍길동");
        list2.add("김길동");
        for (int i = 0; i < list2.size(); i++){
            if (list2.get(i).equals("홍길동")){
            System.out.println("해당 이름이 존재합니다.");
            }
        }

        //4. 리스트에 1~100까지의 랜덤한 정수를 10개 넣어보자.
        // 그 후  저장된 데이터 중 짝수의 개수와 모든 짝수를 출력하는 프로그램을 만드세요.
        // (Math.random()이라는 메소드는 0 <= x < 1의 실수를 리턴)

        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            int ran = (int)(Math.random() * 100 + 1);
            list3.add(ran);
        }
        //리스트에 저장된 짝수의 개수 및 모든 짝수 출력
        int cnt = 0;
        for (int e : list3){
            if (e % 2 == 0){
                cnt++;
                System.out.println(e);
            }
        }
        System.out.println("cnt : " + cnt);
    }
}
