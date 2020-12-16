package chapter12.generics;

public class GenericPrinterTest2 {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();
        powderGenericPrinter.setMaterial(new Powder());
        powderGenericPrinter.printing();

        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<>();
        plasticGenericPrinter.setMaterial(new Plastic());
        plasticGenericPrinter.printing();
    }
}
