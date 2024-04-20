package exception;


public class AutoClosableDemo implements AutoCloseable {


    public void run(){
        System.out.println("I am in run method");
    }

    public static void main(String[] args) throws Exception {

        try(AutoClosableDemo demo = new AutoClosableDemo()){
            // try with resources

            demo.run();
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("I am in finally block");
        }

        AutoClosableDemo demo1 = new AutoClosableDemo();
        try{
            demo1.run();
        }catch (Exception e){

        }finally {
            demo1.close();
        }
    }


    @Override
    public void close() throws Exception {
        System.out.println("closing");
    }
}
