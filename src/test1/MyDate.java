package test1;

import java.util.*;

/**
 * Created by yxl on 2018-03-19.
 */
public class MyDate extends  Date {
    public MyDate() {
    }
    protected  void finalize() throws  Throwable{
        super.finalize ();
        System.out.println ("obj Date"+this.getTime ()+"is gc" );
    }
    public String toString(){
        return "Date"+this.getTime ();

    }


}
