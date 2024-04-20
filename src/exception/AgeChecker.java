package exception;

public class AgeChecker {

    private int age;

    public AgeChecker(int age){
        this.age =age;
    }

    public void checkAge() {
        if(this.age > 18){
            System.out.println("Valid Age");
        }else {
            throw new CustomException("Age is not valid");
        }

    }

    public static void main(String[] args) {

        System.out.println(args.length);
        for(String arg: args){
            System.out.println(arg);
        }
        AgeChecker ageChecker  = new AgeChecker(21);
        ageChecker.checkAge();
    }

}

// how to pass these arg from intellij

// u can try to passs these arg from comd prompt .class --> java Main a b c d
// u have to try to write hashcode and equals method for a class with some more elements
// read out the contract


