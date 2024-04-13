package coreJava;

import java.util.Date;

public class Lecture {
    public static void test(){
        System.out.println("static method");
    }

    public Lecture(){

    }
    public Lecture(String lectureTitle){
        this.lectureTitle =lectureTitle;
    }
    public Lecture(String lectureTitle, int status){
        this.lectureTitle =lectureTitle;
        this.status =status;
    }
    static String noOfStudents = "fifty";
    static String noOfStudents1 = new String("thirty");

    private String lectureTitle;

    private String mentorPassword;

    int status;

    String mentor;

    Date dateOfClass;

    public String getLectureTitle() {
//        log
        // system.out.println("classname")l
        return lectureTitle;
    }
}

// instance level variable