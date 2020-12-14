package chapter10.bookself;

public interface Queue {
    void enQueue(String title);

    String deQueue();

    int getSize();
}
