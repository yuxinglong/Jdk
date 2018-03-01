package test1;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * Created by yxl on 2018-02-27.
 */
public class Receive implements Runnable {
    private PipedInputStream input=null;
    public Receive(){
        input=new PipedInputStream ();
    }
    public PipedInputStream getInput(){
        return  input;
    }

    public void run(){
        byte[] b=new byte[1000];
        int len=0;
        try {
            len=this.input.read (b);
        } catch (IOException e) {
            e.printStackTrace ( );
        }
        try {
            this.input.close ();
        } catch (IOException e) {
            e.printStackTrace ( );
        }
        System.out.println (new java.lang.String (b));

    }
}
