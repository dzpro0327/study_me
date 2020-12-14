package chapter10.bookself;

public class BookShelf extends Shelf implements Queue {
    @Override
    public void enQueue(String title) {
        arrayList.add(title);
    }

    @Override
    public String deQueue() {
        return arrayList.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }


}
