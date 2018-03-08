package test2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by yxl on 2018-03-07.
 */
public class TestMyLinkedList {

    public static void main(String[] args) {
        MyLinkedList list=  new MyLinkedList ();
        list.add ("aaa");
        list.add ("bbbb");
        list.add ("cccc");
//        System.out.println (list.size () );
        System.out.println (list.indexOf ("cccc") );
        list.toString ();




    }

}
