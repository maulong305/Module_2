package Week1.Vonglap.Mang;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

public class MaxValueInArray {
    public static void main(String[] args) {
        int size = 10;
        int array[];
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) Math.floor(Math.random()*100);
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        int index = 1;
        int count = 0;
        for (int j : array) {
            if (j> max) {
                max = j;
                count = index;

            }
            index++;
        }
        System.out.println("max value in the list :" + max + " position is " + count);

    }
}
