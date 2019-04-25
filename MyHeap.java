import java.util.Arrays;
 public class MyHeap{
    // - size  is the number of elements in the data array.
    // - push the element at index i downward into the correct position. This will swap with the larger of the child nodes provided thatchild is larger. This stops when a leaf is reached, or neither child is larger. [ should be O(logn) ]
    //- precondition: index is between 0 and size-1 inclusive
    // - precondition: size is between 0 and data.length-1 inclusive.
   private static void swap(int[] data, int index1, int index2){
     //System.out.println(Arrays.toString(data));
     //System.out.println("swapping "+data[index1]+" and "+ data[index2]);

     int temp=data[index1];
     data[index1]=data[index2];
     data[index2]=temp;
   }
   private static void pushDown(int[] data, int size, int index){
     //System.out.println("currently on"+data[index]);
     if(2*index+1<size&&2*index+2<size){
       if(data[2*index+1]>data[index]&&data[2*index+1]>=data[2*index+2]){
         swap(data, index, 2*index+1);
         pushDown(data,size,2*index+1);
       }
       else if(data[2*index+2]>data[index]&&data[2*index+2]>data[2*index+1]){
         swap(data, index, 2*index+2);
         pushDown(data,size,2*index+2);
       }
     }
     else if(2*index+1<size&&data[2*index+1]>data[index]){
      //System.out.println("swapped"+data[index]+"with"+data[2*index+1] );
       //System.out.println(Arrays.toString(data));
       swap(data, index, 2*index+1);
       pushDown(data,size,2*index+1);
     }
     else if(2*index+2<size&&data[2*index+2]>data[index]){
       swap(data, index, 2*index+2);
       //System.out.println("swapped"+data[index]+"with"+data[2*index+2] );
       //System.out.println(Arrays.toString(data));
       pushDown(data,size,2*index+2);
     }
   }
   // push the element at index i up into the correct position. This will swap it with the parent node until the parent node is larger or the root is reached. [ should be O(logn) ]
    //recondition: index is between 0 and data.length-1 inclusive.
   private static void pushUp(int[] data, int index){
     if(data[(index-1)/2]<data[index]){
       swap(data,index,(index-1)/2);
       //System.out.println("swapped"+data[index]+"with"+data[(index-1)/2] );
       //System.out.println(Arrays.toString(data));
       pushUp(data,(index-1)/2);
     }
   }
   public static void heapify(int[] data){
     for(int i=1;i<data.length;i++){
       //System.out.println(Arrays.toString(data));
       pushUp(data,i);
   }
 }
   public static void heapsort(int[] data){
     heapify(data);
     int size=data.length;
     while(size>0){
       //System.out.println("---");
       //System.out.println(Arrays.toString(data));
       //System.out.println(size);
       pushDown(data,size,0);
       //System.out.println(Arrays.toString(data));
       //System.out.println("----");
       swap(data,0,size-1);

       size--;
     }
   }
   public static void main(String[] args) {
    //int[] x={51, 55, 56, 64, 64, 64, 64, 64, 68, 132, 132, 132, 132, 132, 132, 155, 526, 533, 536};
    //pushDown(x,2,0);
    //swap(data,0,2);
    int[] x={155,132,533,132,55,132,64,132,526,132,68,64,64,536,132,56,64,51,64};
     heapsort(x);
     System.out.println(Arrays.toString(x));
   }
 }
