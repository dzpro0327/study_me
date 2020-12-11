package chapter07.array.prac01;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};

        for(String lang : strArray) {
            System.out.println(lang);
        }

        System.out.println("==============================================");

        String[] games = {"위쳐3", "어쌔신크리드 발할라", "싸이버 펑크 2077", "궨트", "하스스톤"};

        for(String game : games) {
            System.out.println(game);
        }
    }
}
