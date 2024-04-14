package inheritance;

public class Calculator {

    int a =10;

    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public int add(int a, int b, int c, int d){
        return a+b+c+d;
    }

    public String add(String a, String  b){
        return "";
    }
    // by either no of params change
    // or by changing the datatypes of variable
}
