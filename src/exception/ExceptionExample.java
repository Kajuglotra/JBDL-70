package exception;

public class ExceptionExample {

    public void exceptionExample(int a, int b){

        try{
            int c = a/b;
            System.out.println("I am in if block");
//            System.exit(0);
        } catch (ArithmeticException e){
          e.printStackTrace();
        }
        finally {
            System.out.println("i am in finally ");
        }

    }

    public static void main(String[] args) {
        ExceptionExample example = new ExceptionExample();
        example.exceptionExample(1,1);
        System.out.println("I a out of exception");
    }
}
