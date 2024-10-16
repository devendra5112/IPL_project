package Com.tka.controller;

import java.util.HashSet;
import java.util.Set;

import javax.xml.crypto.Data;

import Com.tka.Dao.IplplayerDao;
import Com.tka.entity.Player;
import Com.tka.service.IplplayerService;

public class IplController {

	IplplayerService service = null;

	public Set<Player> getAllplayersController() {

		service = new IplplayerService();
		Set<Player> db = service.getallplayersService();
		return db;
	}

	public Set<Player> getteamplayersteamService(String ch) {
		service = new IplplayerService();
		Set<Player> db = service.getallplayersService();
		// Set<Player> db = .getallplayers();
		Set<Player> db1 = new HashSet<Player>();
		for (Player p1 : db) {
			if (p1.getName().contains(ch)) {
				db1.add(p1);
			}
		}
		return db1;
	}

	public Set<Player> getteamplayernameService(String ch) {
		service = new IplplayerService();
		Set<Player> db = service.getallplayersService();
		Set<Player> db2 = new HashSet<Player>();
		for (Player p1 : db) {
			if (p1.getName().contains(ch)) {
				db2.add(p1);
			}
		}
		return db2;

	}

	public Set<Player> getplayersrunService(int run) {
		service = new IplplayerService();
		Set<Player> db = service.getallplayersService();
		Set<Player> db3 = new HashSet<Player>();
		for (Player p1 : db) {
			if (p1.getRun() == run) {
				db3.add(p1);
			}

		}
		return db3;
	}
}
