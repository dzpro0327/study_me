package chapter06.prac04;

public class CardTest {
    public static void main(String[] args) {

        // 1. 싱글톤으로 인스턴스 생성
        CardCompany cardCompany = CardCompany.getInstance();
        Card card1 = cardCompany.createCard();
        Card card2 = cardCompany.createCard();
        Card card3 = cardCompany.createCard();
        Card card4 = cardCompany.createCard();

        // 2. 카드번호 출력
        System.out.println(card1.getNum());
        System.out.println(card2.getNum());
        System.out.println(card3.getNum());
        System.out.println(card4.getNum());

    }
}
