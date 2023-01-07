package GitBranchApp1st;

public class MainApp {

	public static void main(String[] args) {
		// By Leader
		System.out.println("1st version --By Leader");
		// Update By Leader
		Room room = new Room();
		System.out.println();
		System.out.println(room.add(10, 20));
	}

}

class Room {
	int add(int roomid, int orderid) {
		return roomid + orderid;
	}
}