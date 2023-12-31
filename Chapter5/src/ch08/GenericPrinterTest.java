package ch08;

public class GenericPrinterTest {

    public static void main(String[] args) {

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial(); // 형변환 하지 않음
        System.out.println(powderPrinter);
        System.out.println(powder.toString());

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial(); // 형변환 하지 않음
        System.out.println(plasticPrinter);
        System.out.println(plastic.toString());

        /*
         * GenericPrinter powderPrinter2 = new GenericPrinter();
         * powderPrinter2.setMaterial(new Powder());
         * Powder powder = (Powder)powderPrinter.getMaterial();
         * System.out.println(powderPrinter);
         */
        // GenericPrinter<Water> printer = new GenericPrinter<Water>();
    }
}