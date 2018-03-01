package test1;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * Created by yxl on 2018-02-27.
 */
public class Send implements Runnable{
    private PipedOutputStream out=null;
    public Send(){
        out=new PipedOutputStream ();
    }

    public PipedOutputStream getOut(){
        return out;
    }

    public void run(){
        String message="Hello,message";
        try {
            out.write (message.getBytes ());
        } catch (IOException e) {
            e.printStackTrace ( );
        }
        try {
            out.close ();
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}
