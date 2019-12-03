import com.narek.Meeting;
import com.narek.Room;

public class Main {

    public static void main(String[] args) {
        Meeting standUp = new Meeting();
        standUp.setRoom(new Room(22, 3, "ConfRoom"));
        System.out.println(standUp);
    }
}
