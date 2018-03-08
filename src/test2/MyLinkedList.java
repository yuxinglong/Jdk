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

    public LinkedListObj addBefore(LinkedListObj obj,Object element ){
        LinkedListObj newElement=new LinkedListObj (element,obj,obj.previous);
        newElement.previous.next=newElement;
        newElement.next.previous=newElement;
        size++;
        return newElement;
    }

//    private LinkedListObj addAfter(LinkedListObj list,Object obj){
//        LinkedListObj element=new LinkedListObj (obj,list,elementt);
//
//    }

    public boolean add(Object obj){
        addBefore (header,obj);
        return true;
    }

    public boolean addLast(Object obj){
        addBefore (header,obj);
        return true;
    }
    public boolean addFirst(Object obj){
        addBefore (header.next,obj);
        return true;
    }

    public boolean contains(Object o){
        return indexOf(o)!=-1;
    }

    public int indexOf(Object o){
        int index=0;
        if(o==null){
            for(LinkedListObj obj= header.next;obj!=header;obj=obj.next){
                if(obj.element==null){
                    return index;
                }
                index++;
            }
        }else{
            for(LinkedListObj obj=header.next;obj!=header;obj=obj.next){
                if(o.equals (obj.element)){
                    return index;
                }
                index++;
            }
        }
        return -1;

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

    public Object removeLast(){
        return remove(header.previous);

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

    public String toString(){
        StringBuffer sb=new StringBuffer ();
       for (LinkedListObj obj=header.next;obj!=header;obj=obj.next){
           sb.append ((String)obj.element);
       }
        System.out.println (sb.toString () );
        return sb.toString ();
    }











}

