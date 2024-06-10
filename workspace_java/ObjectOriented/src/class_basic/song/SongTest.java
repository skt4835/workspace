package class_basic.song;

public class SongTest {
    public static void main(String[] args) {
        Song s1 = new Song();

        String[] a = {"김작곡", "이작곡", "박작곡"};
        s1.setSongInfo("김제목", "김가수", "김앨범", 2024, a);

        s1.printSongInfo();
    }
}
