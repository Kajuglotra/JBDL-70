package inheritance;

public interface InterfaceExample2 {

    int a =10;

    int getA();

    default int getB(){
        return 2;
    }

    static String  getC(){
        return "i am from interface example interface";
    }
}
