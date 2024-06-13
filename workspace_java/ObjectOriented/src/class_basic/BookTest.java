package class_basic;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("java", "kim", 1000);
        System.out.println(book1.title);

        Book book2 = new Book("python", "lee", 2000);
        System.out.println(book2.title);


        //자료형 변수명
        Book book3 = book1;
        System.out.println(book1.title);
        System.out.println(book3.title);
        book1.title = "c++";
        System.out.println(book1.title);
        System.out.println(book3.title);

    }
}
