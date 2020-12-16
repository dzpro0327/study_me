package chapter12.generics;

public class GenericPrinterTest {
    public static void main(String[] args) {
        // Powder
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();
        powderGenericPrinter.setMaterial(new Powder());
        Powder powder = powderGenericPrinter.getMaterial();
        System.out.println(powder);

        // Plastic
        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<>();
        plasticGenericPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticGenericPrinter.getMaterial();
        System.out.println(plastic);


    }
}
