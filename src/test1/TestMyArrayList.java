package test1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by yxl on 2018-02-26.
 */
public class TestMyArrayList {

    public static void main(String[] args) {
//        MyArrayList list=new MyArrayList(-1);
        MyArrayList list=new MyArrayList ();
//        System.out.println ("list_arr_size:"+list.arr_size () );
        list.add ("aaa");
        list.add ("bbb");
//        System.out.println ("list_arr_size:"+list.arr_size () );
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

//        System.out.println ("list_arr_size:"+list.arr_size () );
//        System.out.println (list.lastIndexof ("eee") );
//        System.out.println (list.isContain (null) );
//        System.out.println (list.toArray () );
//        for (int i = 0; i <list.toArray ().length ; i++) {
//            System.out.println (list.toArray ()[i] );
//
//        }
//        System.out.println (list.set (4,90) );
//        System.out.println (list.toString () );

        System.out.println (list.remove ("") );
//        System.out.println (list.toString () );
        System.out.println (list.toString () );
        MyArrayList list1=new MyArrayList ();

        list1.add ("yyy");
        list1.add ("zzz");
        list.addAll ( list1);
        System.out.println (list.toString () );



    }
}
