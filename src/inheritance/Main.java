package inheritance;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(); //reference variable
        // RV of parent and object is of parent
        // compile time polymorphism
        System.out.println(calculator.add(1,2));
//
        AdvancedCalculator calculator1 = new AdvancedCalculator();
        System.out.println(calculator1.add(1,2));
        // RV of child and object is of child
        // compile time polymorphism

        Calculator calculator2 = new AdvancedCalculator(); // default happening, when RV of parent
        System.out.println(calculator2.add(1,2)); // run time, child method will get called, not at compile
        // compile it checking the method in parent
        // RV of parent and object is of child
        // run time polymorphism

//        AdvancedCalculator  advancedCalculator = new Calculator(); // its not possible
        // upcating -->
        // child to parent

//        float a =  (float) 2;


        Calculator calculator3 = (Calculator) new AdvancedCalculator(); // default happening, when RV of parent
        AdvancedCalculator a = (AdvancedCalculator) calculator3;  //downcasting
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        System.out.println(a.add(1,2));

        calculator3.add(1,2,3);

        calculator3.add("ac" , "ab");
        calculator3.add(1 , 2);
    }
}
