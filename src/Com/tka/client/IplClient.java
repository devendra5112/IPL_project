package Com.tka.client;

import java.util.Set;

import Com.tka.controller.IplController;
import Com.tka.entity.Player;

public class IplClient {

public static void main(String[] args) {
		IplController controller = new IplController();
		 Set<Player> db = controller.getAllplayersController();
		 System.out.println(db);

		 IplController controller1 = new IplController();
		 Set<Player> db1 = controller1.getteamplayersteamService("CSK");
		 System.out.println(db1);

		IplController controller2 = new IplController();
		Set<Player> db2 = controller2.getteamplayernameService("MSD");
		System.out.println(db2);

		IplController controller3 = new IplController();
		Set<Player> db3 = controller3.getplayersrunService(5000);
		System.out.println(db3);

	}

}