package HashAndEquals;

import exception.AgeChecker;

public class Student {

    private String name;

    private Integer id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode(){
        return this.name.hashCode()+this.id.hashCode();
    }


    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o.getClass() != this.getClass()){
            return  false;
        }
        Student s = (Student) o;
        if(s.id == this.id && s.name == this.name){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", 1);
        Student student2 = new Student("John", 1);

        System.out.println("student reference " + student1);
        System.out.println("student2 reference " + student2);

        AgeChecker ageChecker = new AgeChecker(1);

        System.out.println(student1.equals(ageChecker));

        String str = new String("abc");
        String str1 = new String("abc");

        System.out.println("str " + str);
        System.out.println("str1 " + str1);
//        System.out.println(str.equals(str)); // false
//
//        Integer i =2;
//        Integer i1 =2;
//
//        System.out.println(i.equals(i1)); // true


    }
}

// equals
// == {refrence variable }

// every wrapper class has their own equals and hashcode methods

// contract between hashcode and equals method,
// whenever equals method is returning u true that time hashcode should always be equal

