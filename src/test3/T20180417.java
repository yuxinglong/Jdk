package test3;

/**
 * 简单排序
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

    /**
     * e二分法
     * @param args
     */
    public int binarySearch(long value){
        int middle=0;
        int low=0;
        int top=element;
        while(true){
            middle=(low+top)/2;
            if(arr[middle]==value){
                return middle;
            }else if(low>top) {
                return -1;
            }else{
                if(arr[middle]>value){
                    top=middle-1;

                }else{
                    low=middle+1;
                }
            }
        }
    }

    /**
     * 冒泡排序
     * @param args
     */
    public void bubbleSort(){
        for (int i = 0; i <element ; i++) {
            for (int j = element-1; j >i ; j--) {
                if(arr[j]>arr[j-1]){
                    long tmp=0;
                    tmp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tmp;
                }
            }

        }

    }

    /**
     * 选择排序，插入次数少，比冒泡效率高些，交换次数少
     */
    public void insertSelectSort(){
        int k=0;
        long tmp=0;
        for (int i = 0; i < element; i++) {
            k=i;
            for (int j = i; j < element; j++) {
                if(arr[j]>arr[k]){
                    k=j;
                }
            }
            tmp=arr[i];
            arr[i]=arr[k];
            arr[k]=tmp;
        }
    }

    /**
     * 插入排序
     * @param args
     */
     public void insertSort() {
         long tmp=0;

         for (int i = 1; i < element; i++) {
             tmp=arr[i];
             int j=i;
             while(j>0 &&arr[j]>=tmp){
                 arr[j]=arr[j-1];
                 j--;
             }
             arr[j]=tmp;
         }

     }



    public static void main(String[] args) {
        T20180417 a=new T20180417 (4*4);
//        a.insert (33);
//        a.insert (44);
//        a.insert (55);
//        a.insert (66);
//        a.delete (2);
        int k=16;
        for (int i = 16; i >0 ; i--) {
                a.insert (k--);

        }
//        a.addBySort (3);
        a.display ();
       // a.insertSort();
        a.insertSort();
        a.display ();


    }



}
