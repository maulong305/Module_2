package bt_timkiem2cm;

public class TestSearch2cm {
    public static void main(String[] args) {
        int[] list = {43, 56, 78, 90, 132, 134, 567};
        int a= Search2cm.search2cm(list, 134);
        int b = Search2cm.search2cm(list, 132);
        int c = Search2cm.search2cm(list, 43);
        int d = Search2cm.search2cm(list, 12);
        int e = Search2cm.search2cm(list, 13);
        System.out.println(a + "\n" + b + "\n"+ c + "\n" + d + "\n" +e);

    }

}
