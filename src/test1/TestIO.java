package test1;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by yxl on 2018-02-27.
 */
public class TestIO {
    public static void main(String[] args) throws IOException {
        String fileName = "F:" + File.separator + "a.txt";
        String outputName="F:" + File.separator + "b.txt";
        String floderName = "F:" + File.separator + "text";
        File f = new File (fileName);
//        System.out.println (f);
//        print (f);
//        if(f.isDirectory ()){
//            System.out.println ("YES" );
//        }else{
//            System.out.println ("No" );
//        }

//        File[] s=f.listFiles ();
//        for (int i = 0; i <s.length ; i++) {
//            System.out.println (s[i] );
//        }
//        try {
//            f.createNewFile ();
//        } catch (IOException e) {
//            e.printStackTrace ( );
//        }
//        if(f.exists ()){
//            f.delete ();
//        }else{
//            System.out.println ("文件不存在" );

//        RandomAccessFile demo=new RandomAccessFile (f,"rw");
//        demo.writeBytes ("asdfgf");
//        demo.writeInt (000);
//        demo.writeFloat (999.0f);

//        OutputStream out =new FileOutputStream(f);
//        String str="你好345fgdg/*-45638576$#%#@%@%$ewrtwertewrt";
//        StringBuffer sb=new StringBuffer ();
//        byte[] b=str.getBytes ();
//
//        for (int i = 0; i < 99999999; i++) {
//            out.write(b);
//            out.flush ();
//        }
//
//        out.close();
//        System.out.println ("end" );


//        InputStream in=new FileInputStream (f);
//        OutputStream out=new FileOutputStream (outputName);
//        byte[] b=new byte[102000];
//        int inb=0;
//        while((inb=in.read (b))!=(-1)){
//            out.write (b);
//        }

//        Writer out=new OutputStreamWriter(new FileOutputStream(f));
//        out.write("hello");
//        out.close();

//        PipedOutputStream and PipedInputStream

//        Send s=new Send ();
//        Receive r=new Receive ();
//        s.getOut ().connect (r.getInput ());
//
//        new Thread (s).start ();
//        new Thread (r).start ();


//        Scanner sca = new Scanner(System.in);
//        // 读一个整数
//        int temp = sca.nextInt();
//        System.out.println(temp);
//        //读取浮点数
//        float flo=sca.nextFloat();
//        System.out.println(flo);



    }

    //递归调用输出文件
//    public static void print(File f) {
//        if (f != null) {
//            if (f.isDirectory ( )) {
//                File[] k = f.listFiles ( );
//                if (k != null) {
//                    for (int i = 0; i < k.length; i++) {
//                        print (k[i]);
//                    }
//                }
//
//            } else {
//                System.out.println (f);
//            }
//        }
//
//
//    }

}

