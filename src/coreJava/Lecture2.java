package coreJava;

import java.util.Date;

public class Lecture2 extends Lecture {

    int a = 20;

    public Lecture2(){
        System.out.println("I am in constructor of lecture2");
    }
    public static  int divide(int a, int b){
        return a/b;
    }
    public int getParentA(){
//        return super.a;
        return 0;
    }

    static int noOfStudents =50;

    String lectureTitle;

    int status;

    String mentor;

    Date dateOfClass;
}
