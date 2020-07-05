package noibot2;

public class BubbleSort2 {
   static void bubbleSort2(int[] list) {
       for (int i : list) {
           for (int j = 0; j < list.length - i; j++){
               if (list[j] > list[j+1]){
                   int temp = list[j];
                   list[j] = list[j+1];
                   list[j +1] = temp;
               }
           }
       }
   }

}
