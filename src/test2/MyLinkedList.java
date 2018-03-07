package test2;


import java.util.NoSuchElementException;

/**
 * Created by yxl on 2018-03-07.
 */
public class MyLinkedList {

    private LinkedListObj header=new LinkedListObj (null,null,null);
    private int size=0;

   public int size(){
       return size;
   }
    public MyLinkedList(){
        header.next=header.previous=header;
    }

    private LinkedListObj addBefore(LinkedListObj list,Object obj){
        LinkedListObj element=new LinkedListObj (obj,list,list.previous);
        element.previous.next=element;
        element.next.previous=element;
        size++;
        return element;
    }

//    private LinkedListObj addAfter(LinkedListObj list,Object obj){
//        LinkedListObj element=new LinkedListObj (obj,list,elementt);
//
//    }

    public boolean add(Object obj){
        addBefore (header,obj);
        return true;
    }
    public Object getFirst(){
        if(size==0){
            throw new NoSuchElementException ();
        }
        return header.next.element;

    }
    public Object getLast(){
        if(size==0){
            throw new NoSuchElementException ();
        }
        return header.previous.element;
    }

    public Object removeFirst(){
        return remove(header.next);


    }

    private Object remove(LinkedListObj obj){
        if(obj==header){
            throw new NoSuchElementException ();
        }
        Object res=obj.element;
        obj.previous.next=obj.next;
        obj.next.previous=obj.previous;
        obj.next=null;
        obj.previous=null;
        obj.element=null;
        size--;
        return res;
    }

    public Object[] toArray(){
        int i=0;
        Object[] result=new Object[size];
        for (LinkedListObj obj= header.next;obj!=header;obj=obj.next){
            result[i++]=obj.element;
        }
        return  result;
    }











}

