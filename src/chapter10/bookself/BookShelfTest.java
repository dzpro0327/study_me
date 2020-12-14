package chapter10.bookself;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue shelfQueue = new BookShelf();
        // 큐에 집어 넣기
        shelfQueue.enQueue("태백산맥 1");
        shelfQueue.enQueue("태백산맥 2");
        shelfQueue.enQueue("태백산맥 3");

        // 얼마나 들어가있는지 확인하기
        System.out.println(shelfQueue.getSize());  // 3

        // 큐에서 빼오기
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());

        // 얼마나 들어가있는지 확인하기
        System.out.println(shelfQueue.getSize());  // 0
    }
}
