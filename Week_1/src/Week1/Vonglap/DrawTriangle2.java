package Week1.Vonglap;

public class DrawTriangle2 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            System.out.print("\n");
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
        }
    }
}
