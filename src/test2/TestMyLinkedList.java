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
//        System.out.println (list.indexOf ("cccc") );
//        System.out.println (list.getFirst () );
//        System.out.println (list.getLast () );
//        System.out.println (list.removeFirst () );
//        System.out.println (list.removeLast () );
//        System.out.println (list.addFirst ("jjj") );
//        System.out.println (list.addLast ("kkk") );
//        System.out.println (list.contains ("jjj") );
        System.out.println (list.get (2) );
        System.out.println (list.indexOf ("dddd") );
        list.toString ();





    }

}
