package inheritance;

public class OuterClass {
    private int a =10;

    public int getA() {
        return a;
    }

    // static
//    static class InnerClass{
//        private  int b =20;
//
//        public int getB() {
//            return b;
//        }
//    }
// intance level
     class InnerClass{
                private  int b =20;

        public int getB() {
            return b;
        }
    }
    private interface InnerInterface{
        int d =10;
        default int getA(){
            return 100;
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass =  new OuterClass().new InnerClass();
        System.out.println(innerClass.getB());
        OuterClass outerClass = new OuterClass();
        System.out.println(outerClass.getA());
        InnerInterface innerInterface = new InnerInterface() {
        };
        innerInterface.getA();
        System.out.println(InnerInterface.d);



    }
}

// class inside class

