package reverse_element;

public class TestReverse {
    public static void main(String[] args) throws Exception {
        int[] arrNumber= new int[] {1,2,3,4,5,6,7,8};
        Stack stack = new Stack(8);
        for (int i = 0 ; i < arrNumber.length; i++) {
            stack.push(arrNumber[i]);
        }
        for (int i = 0; i < arrNumber.length; i++) {
            arrNumber[i] = stack.pop();
        }
        for (int i = 0; i <arrNumber.length; i++) {
            System.out.print(arrNumber[i] + "\t");
        }


    }
}
