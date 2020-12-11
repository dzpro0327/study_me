package chapter07.array.prac01;

public class TwoDimension {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        char[][] arr2 = {{'a', 'b'}, {'c', 'd'}, {'e', 'f'}, {'g', 'h'}, {'i', 'j'}, {'k', 'l'}, {'m', 'n'},
                {'o', 'p'}, {'q', 'r'}, {'s', 't'}, {'u', 'w'}, {'x', 'y'}, {'z', 'ㄱ'}};


        for (int i = 0; i < arr.length; i++) {   // 행을 기준으로 반복을 돌림
            for (int j = 0; j < arr[i].length; j++) {   // 열을 기준으로 반복을 돌림
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("============================================");
        System.out.println("============================================");
        System.out.println("============================================");

        for (int k = 0; k < arr2.length; k++) {
            for (int m = 0; m < arr2[k].length; m++) {
                System.out.println(arr2[k][m]);
            }
            System.out.println();
        }


    }
}
