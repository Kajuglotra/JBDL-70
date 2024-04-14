package inheritance;

import javax.xml.crypto.Data;

public enum Days {

    SUNDAY(7, "sunday"),
    MONDAY(6,  "monday"),
    TUESDAY(5, "tuesday");
    int id;
    String val;
    Days(int id, String val){
        this.id =id;
        this.val = val;
    }

    public String day(){
      return Days.MONDAY.val;
    }

    public static void main(String[] args) {
        for( Days d: Days.values()){
            System.out.println(d);
        }

        System.out.println(Days.valueOf("SUNDAY"));

        System.out.println(Days.SUNDAY.ordinal());

        System.out.println(Days.SUNDAY.id);
        System.out.println(Days.SUNDAY.val);
        System.out.println(Days.SUNDAY.name());
    }
}


// class Days extends Enum
// class emum Days
