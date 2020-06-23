package kiemtra_giuaky;

import java.util.ArrayList;
import java.util.Scanner;

public class TestListPeople {
    private static ArrayList<ListPeople> listPeople = new ArrayList<>();
    public static void main(String[] args) {
        listPeople.add(new ListPeople("Long",33));
        listPeople.add(new ListPeople("Vinh",20));
        listPeople.add(new ListPeople("Tuyển",28));
        listPeople.add(new ListPeople("Thịnh",30));
        listPeople.add(new ListPeople("Thắng",25));

        System.out.println("Menu : ");
        System.out.println("Option 1 : Show ListPeople ");
        System.out.println("Option 2 : Add element in ListPeople");
        System.out.println("Option 3 : Remove element");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            switch (n) {
//                hiện danh sách
                case 1:
                    displays();
                    break;

//                    thêm vào danh sách
                case 2:
                    System.out.println("choose add method ");
                    System.out.println("Option 1 : Add last");
                    System.out.println("Option 2 : Add index");
                    int m = scanner.nextInt();
                    if (m == 1) {
                        System.out.println("Enter name : ");
                        String name1 = scanner.next();
                        System.out.println("Enter age : ");
                        int age1 = scanner.nextInt();
                        listPeople.add(new ListPeople(name1, age1));
                        displays();

                    }
                    if (m == 2) {
                        System.out.println("Enter name : ");
                        String name1 = scanner.next();
                        System.out.println("Enter age : ");
                        int age1 = scanner.nextInt();
                        System.out.println("Enter id : ");
                        int index = scanner.nextInt();
                        listPeople.add(index, new ListPeople(name1, age1));
                        displays();
                    }
                    break;
//                    xóa khỏi danh sách

                case 3:
                    System.out.println("Enter id");
                    int id = scanner.nextInt();
                    for (int j = 0; j < listPeople.size(); j++) {
                        if (id == listPeople.get(j).getId()) {

                            listPeople.remove(j);
                            break;
                        }
                    }
                    displays();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter mumber again:");
            }
        }
    }
    public static void displays(){
        System.out.println("ListPeople : ");
        for (int i=0; i< listPeople.size(); i++){
            System.out.println("id : " + listPeople.get(i).getId() + ", Name: "
                    +listPeople.get(i).getName()+" ,Age: "+ listPeople.get(i).getAge());
        }

    }
}
