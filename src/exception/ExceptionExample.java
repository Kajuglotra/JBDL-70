package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample {

    public void exceptionExample(int a, int b){

        try{
            int c = a/b;
            System.out.println("I am in if block");
//            System.exit(0);
        } catch (ArithmeticException e){
           System.out.println(e);
            System.out.println("printing is done");
            try{
                String str = null;
                System.out.println(str.length());
            }catch (Exception ex){
               System.out.println(ex);
            }

        }
        finally {
            System.out.println("i am in finally ");
        }

    }

    public void readFile() throws IOException {
        FileInputStream stream = null;
        try {
          stream = new FileInputStream("/Users/kajalglotra/Downloads/kajal/JBDL-70-COREJAVA/abc");

        } catch (FileNotFoundException e) {
            System.out.println(e);

        }finally {
            stream.close();
        }

        try( FileInputStream stream1  = new FileInputStream("/Users/kajalglotra/Downloads/kajal/JBDL-70-COREJAVA/abc") ){

        }catch (Exception e){

        }finally{

        }
    }

    public void readFile1() throws IOException {
        ExceptionExample example = new ExceptionExample();
        example.readFile();
    }

    public static void main(String[] args) throws IOException {
        ExceptionExample example = new ExceptionExample();
        example.exceptionExample(1,0);
        example.readFile1();
        System.out.println("I a out of exception");
    }
}
