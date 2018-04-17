package test3;

/**
 * Created by yxl on 2018-04-17.
 */
public class T20180417 {
   private long[] arr;
   private int element;
   public T20180417(){
       arr=new long[30];
   }
   public T20180417(int maxsize){
       arr=new long[maxsize];
   }

   public void insert(long value){
       arr[element]=value;
       element++;

   }

   public void addBySort(long newValue){

       int j;
       for ( j = 0; j < element; j++) {
           if(arr[j]>newValue){
               break;
           }
       }
       for(int i=element;i>j;i--){
           arr[i]=arr[i-1];
       }
       arr[j]=newValue;
       element++;


   }
   public void display(){
       System.out.println ("[" );
       for (int i = 0; i <element ; i++) {
           System.out.println (arr[i]+" " );
       }
       System.out.println ("]" );
   }
   public int search(long value){
       int i;
       for ( i = 0; i <element ; i++) {
           if(value==arr[i]){
               break;
           }
       }
       if(i==element){
            return  -1;
       }else{
           return i;
       }
   }

   public long get(int index){
       if(index>=element || index<0){
           throw new ArrayIndexOutOfBoundsException ();
       }else{
          return arr[index];
       }

   }

   public void delete(int index){
       if(index>=element|| index<0){
           throw new IndexOutOfBoundsException ();
       }else{
           for (int i = index; i <element ; i++) {
               arr[index]=arr[index+1];
           }
           element--;
       }
   }

   public void change(int index,long newValue){
       if(index>=element || index<0){
           throw new IndexOutOfBoundsException ();
       }else{
           arr[element]=newValue;
       }



   }

    public static void main(String[] args) {
        T20180417 a=new T20180417 ();
        a.insert (33);
        a.insert (44);
        a.insert (55);
        a.insert (66);
        a.delete (2);
        a.addBySort (3);
        a.display ();


    }



}
