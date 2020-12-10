package chapter06.prac04;

public class Card {
    private static int cardSerialNum = 1000;
    private int num;

    public Card() {
        cardSerialNum++;
        num = cardSerialNum;
    }

    public static int getCardSerialNum() {
        return cardSerialNum;
    }

    public int getNum() {
        return num;
    }

}
