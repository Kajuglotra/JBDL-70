package inheritance;

public interface OuterInterfaceExample {

    class InnerClass{
        int a =10;
    }

    interface InnerInterface{

    }

    public static void main(String[] args) {
        InnerClass innerClass = new OuterInterfaceExample.InnerClass();
        System.out.println(innerClass.a);
    }


}

// class interface

// class class// class interface // interface interface // interface class
