package singleton;

import java.util.HashMap;

public class Logger {

    private static Logger instance;

    private Logger(){

    }

    public static Logger getInstance(){
        if(instance == null) {
            instance =new Logger();
        }
        return instance;
    }
    public void printMsg(String msg){
        System.out.println(msg);
    }



    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Logger logger1 = Logger.getInstance();

        logger1.printMsg("my message is done");

        HashMap<Logger,Logger> hashMap = new HashMap<>();

    }


}

//lazy initialization
// early
