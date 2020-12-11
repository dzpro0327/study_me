package chapter07.array.prac01;

public class BookArrayTest {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("안녕", "하세요");
        books[1] = new Book("검정 고무신", "몰라요");
        books[2] = new Book("위쳐", "게롤트");
        books[3] = new Book("발할라", "에이보르");
        books[4] = new Book("오디세이", "알렉시오스");

        // 인스턴스 메모리 주소
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

        System.out.println("============================================");

        // 인스턴스 정보
        for (int j = 0; j < books.length; j++) {
            books[j].showInfo();
        }

    }
}
