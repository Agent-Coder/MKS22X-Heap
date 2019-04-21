 public class MyHeap{
    // - size  is the number of elements in the data array.
    // - push the element at index i downward into the correct position. This will swap with the larger of the child nodes provided thatchild is larger. This stops when a leaf is reached, or neither child is larger. [ should be O(logn) ]
    //- precondition: index is between 0 and size-1 inclusive
    // - precondition: size is between 0 and data.length-1 inclusive.
   private static void swap(int[] data, int index1, int index2){
     int temp=index1;
     data[index1]=index2;
     data[index2]=temp;
   }
   private static void pushDown(int[] data, int size, int index){
     if(2*index+1<size&&data[2*index+1]>data[index]){
       swap(data, index, 2*index+1);
       pushDown(data,size,2*index+1);
     }
     else if(2*index+2<size&&data[2*index+2]>data[index]){
       swap(data, index, 2*index+2);
       pushDown(data,size,2*index+2);
     }
   }
   private static void pushUp(int[] data, int index){

   }
   public static void heapify(int[]){

   }
   public static void heapsort(int[]){
     //need to finish fitrst
   }

 }
