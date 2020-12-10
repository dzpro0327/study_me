package chapter05.alnone;

public class ShoppingTest {
    public static void main(String[] args) {
        Shopping shopping = new Shopping();
        shopping.oderNum = 2018000000;
        shopping.id = "lee";
        shopping.date = "2020년";
        shopping.name = "이동주";
        shopping.goodsNum = "PDDFF2340";
        shopping.address = "달서구";

        shopping.shoppingList();
    }
}
