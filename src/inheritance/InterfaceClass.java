package inheritance;

public class InterfaceClass implements InterfaceExample, InterfaceExample2{

    @Override
    public int getA() {
        return 10;
    }

    @Override
    public int getB() {
        return 100;
    }


    static String getC(){
        return "i am from interface class";
    }
}
