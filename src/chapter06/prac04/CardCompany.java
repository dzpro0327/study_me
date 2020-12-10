package chapter06.prac04;

public class CardCompany {
    // 1. 생성자를 private
    private CardCompany() { }

    // 2. 유일한 전역 인스턴스 만들기
    private static CardCompany instance = new CardCompany();

    // 3. 외부에서 참조가능한 메서드 만들기
    public static CardCompany getInstance() {
        if(instance == null) {
            instance = new CardCompany();
        }
        return instance;
    }

    public Card createCard() {
        Card card = new Card();
        return card;
    }
}
