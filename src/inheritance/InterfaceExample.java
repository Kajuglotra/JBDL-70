package inheritance;

public interface InterfaceExample {

    int a =10;

    int getA();

    default int getB(){
        return 2;
    }

    static String  getC(){
        return "i am from interface example interface";
    }

    default int getD(){
        return 2;
    }


}
// static, default