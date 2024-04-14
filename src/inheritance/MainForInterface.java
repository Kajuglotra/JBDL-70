package inheritance;

public class MainForInterface {

    public static void main(String[] args) {
        InterfaceExample example = new InterfaceExample() {    // i am creating an instance of anonymous class
            @Override
            public int getA() {
                return 10;
            }
        };

        InterfaceClass interfaceClass = new InterfaceClass();

        System.out.println(interfaceClass.getD());

        System.out.println(interfaceClass.getA());
        System.out.println(InterfaceExample.getC());
        System.out.println(InterfaceExample.getC());

        System.out.println(example.getB());
        System.out.println(interfaceClass.getB());
    }
}
