package coreJava;

public class Lecture3 extends Lecture2{

    int a = 10;

    public Lecture3(){
        System.out.println("parent hashcode" + super.hashCode());
        System.out.println("I am in constructor of lecture3");
    }

    public int getParentA(){
        return super.getParentA();
    }
}


// child , intetrnally creates the object of parent
// child hashcode ==  parent hashcode

// child
// parent


//hashcode of child
//hashcode of parent from constructor of  child when parent constructor is getting called

