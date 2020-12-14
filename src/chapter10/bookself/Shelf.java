package chapter10.bookself;

import java.util.ArrayList;

public class Shelf {
    protected ArrayList<String> arrayList;

    public Shelf() {
        arrayList = new ArrayList<String>();
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public int getCount() {
        return arrayList.size();
    }

}
