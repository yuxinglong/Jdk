package test1;

import java.util.*;

/**
 * Created by yxl on 2018-02-26.
 */
public class MyArrayList {

    private  Object[] elementData;

    private int size;

    public MyArrayList(){
        this(2);

    }

    public MyArrayList(int size){
        if(size<0){
            throw new IllegalArgumentException("The Capacity is error: "+
                    size);
        }
        this.elementData=new Object[size];
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isContain(Object o){
        if(o==null){
            for(int i=0;i<size;i++){
                if(null==elementData[i]){
                    return true;
                }
            }
        }else{
            for(int i=0;i<size;i++){
                if(o.equals (elementData[i])){
                    return true;
                }
            }

        }
        return false;


    }

    public int lastIndexof(Object o){
        if(o==null){
            for(int i=size-1;i>0;i++){
                if(o==elementData[i]){
                    return i;
                }

            }
        }else{
            for(int i=size-1;i>0;i--){
                if(o==elementData[i]){
                    return i;
                }
            }
        }
        return -1;



    }

    public int size(){
        return size;
    }

    public boolean add(Object a){
        ensureCapacity(size+1);
        elementData[size++] = a;
        return true;
    }

    public int arr_size(){
        return elementData.length;
    }

    public void ensureCapacity(int minCapacity) {
        int oldElementCapacity = elementData.length;
        if (minCapacity > oldElementCapacity) {
            int newElementCapacity = oldElementCapacity * 2;
            elementData = Arrays.copyOf(elementData, newElementCapacity);
        }
    }

    public Object[] toArray(){
       return Arrays.copyOf (elementData,size );
    }

    public Object get(int index){
        checkBound (index);
        return elementData[index];

    }
    public Object set(int index,Object content){
        checkBound (index);
        if(content==null){
            if(elementData[index]!=null){
                Object oldValue=elementData[index];
                elementData[index]=null;
                return oldValue;
            }
            return null;
        }else{
            if(content.equals (elementData[index])){
                return content;
            }else{
                Object oldValue=elementData[index];
                elementData[index]=content;
                return oldValue;
            }


        }

    }
    public boolean checkBound(int index){
        if(index>size || index<0){
            throw new IndexOutOfBoundsException(
                    "Index: "+index+", Size: "+size);
        }
        return true;
    }

    public String toString(){
        StringBuffer sb=new StringBuffer ();
        if(size<1){
            return "";
        }
        for (int i = 0; i <size ; i++) {
            sb.append (elementData[i]).append (",");
        }
       return sb.substring (0,sb.length ()-1);
    }

    public Object remove(int index) {
        if(index>size || index<0){
            throw new IndexOutOfBoundsException ("aa");
        }
        Object oldValue=elementData[index];
        for (int i = index; i<size-1 ; i++) {
            elementData[i]=elementData[i+1];
        }
        size--;
        return oldValue;
    }

    public boolean remove(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                     remove (i);
                     return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals (elementData[i])) {
                     remove (i);
                     return true;
                }
            }
        }
        return false;
    }

    public void clear(){
        for (int i = 0; i <size; i++) {
            elementData[i]=null;
        }
        size=0;
    }

    public boolean addAll(MyArrayList c){
        Object[] o=c.toArray ();
        int newLength=o.length;
        ensureCapacity (size+newLength);
        System.arraycopy (o,0,elementData,size,newLength);
        size+=newLength;
        return true;
    }

}
