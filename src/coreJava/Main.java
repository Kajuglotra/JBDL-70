package coreJava;

public class Main extends Lecture3 {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        Lecture3 lecture3 = new Lecture3();
        System.out.println("child hashcode" + lecture3.hashCode());

        System.out.println(lecture3.a);
        System.out.println(lecture3.getParentA());

        Lecture2 lecture2  = new Lecture2();
        System.out.println(lecture2.hashCode());

//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }
//        Lecture lecture = new Lecture("oops class");
//        Lecture lecture1 = new Lecture();
//        Lecture2 lecture2 = new Lecture2();
//
//
//        System.out.println(lecture.status);
//        System.out.println(lecture.getLectureTitle());
//        Lecture.test();
//        System.out.println(lecture.noOfStudents); // static we always need classname
//        System.out.println(Lecture.noOfStudents);
//        Main main = new Main();
//        int s  = main.sum(10, 30);
//
//        System.out.println(s);
//    }
//    public int sum(int a, int b){
//        int c = multiply(a, b);
//        return c;
//    }
//    public int multiply(int a, int b){
//        int c = Lecture2.divide(a, b);
//
//        return  c;
    }

}