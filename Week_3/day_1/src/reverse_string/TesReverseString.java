package reverse_string;

public class TesReverseString {
    public static void main(String[] args) throws Exception {
        String arrString[] = new String[]{"long", "Vinh", "Hiếu", "Thành" };

        for (String i: arrString){
            System.out.print(i + "\t");
        }
        System.out.println("\n");

        StackString stackString = new StackString(4);
        for (String i : arrString){
            stackString.push(i);
        }


        for (int i = 0; i < arrString.length; i++){
            arrString[i] = stackString.pop();
        }

//        for (String i : arrString) {
//            i = stackString.pop();
//        }

        for (String i : arrString) {
            System.out.print(i + "\t");
        }
    }
}
