package object;

import javax.naming.OperationNotSupportedException;

public class String_4 {
    public static void main(String[] args) {
        String a = "짜장면";
        String b = "짬뽕";

        //concat : 두 문자열을 나열, +와 동일
        System.out.println(a.concat(b));

        //substring : 문자열 일부 추출
        String str1 = "abcdefg";
        System.out.println(str1.substring(2)); //2번째 글자부터 추출
        //2번째 글자부터 4번째 글자 전까지 추출
        System.out.println(str1.substring(2, 4));

        //length : 문자열 길이
        String str2 = "집에가고싶다";
        System.out.println(str2.length());

        //split
        String str3 = "Pizza,chick,족발";
        String[] result = str3.split(",");
        System.out.println(result[1]);
    }
}
