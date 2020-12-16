package chapter12.generics;

// 제네릭 클래스 선언
public class GenericPrinter<T extends Material> {
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString() {
        return material.toString();
    }

    public void printing() {
        material.doPrinting();
    }
}
