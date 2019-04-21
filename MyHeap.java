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
   // push the element at index i up into the correct position. This will swap it with the parent node until the parent node is larger or the root is reached. [ should be O(logn) ]
    //recondition: index is between 0 and data.length-1 inclusive.
   private static void pushUp(int[] data, int index){
     if(index!=0&&(index-1)/2<index){
       swap(data,index,index-1)/2);
     }
   }
   public static void heapify(int[] data){
     for(int i=data.length-1,i>=0;i--){
       swap(data,i,0);
       pushDown(data, data.length, 0);
     }
   }
   public static void heapsort(int[] data){
     //need to finish fitrst
   }

 }
