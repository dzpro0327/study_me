package chapter10.prac01;

public interface Sort {
    // 오름차순
    public void ascending(int[] arr);

    // 내림차순
    public void descending(int[] arr);

    // 설명
    default void description() {
        System.out.println("숫자를 정렬하는 알고리즘 입니다.");
    }
}
