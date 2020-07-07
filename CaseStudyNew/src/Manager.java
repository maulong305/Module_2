import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Manager {
    private static List<MotelRoom> list = new ArrayList<>();

    public static boolean addNewRoom(String name, Double area, int rates) throws IOException {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMotelRoomName().equals(name)) {
                return false;
            }
        }

        return list.add(new MotelRoom(name, area, rates));
    }

    public static ArrayList<MotelRoom> getRoomList() {
        return (ArrayList<MotelRoom>) list;
    }
    public static void deleteRoom(int idRoom){
        for (MotelRoom m: list){
            if (m.getIdMotelRoom() == idRoom){
                list.remove(m);
            }
        }
    }
    public static List<MotelRoom> search(String roomName){
        List<MotelRoom> result = new ArrayList<>();
        for (MotelRoom m: list){
            if (m.getMotelRoomName().toLowerCase().contains(roomName.toLowerCase())){
                result.add(m);
            }
        }
        return result;
    }

}
