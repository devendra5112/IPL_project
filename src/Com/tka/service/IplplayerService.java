package Com.tka.service;

import java.util.HashSet;
import java.util.Set;
import Com.tka.Dao.IplplayerDao;
import Com.tka.entity.Player;

public class IplplayerService {
	IplplayerDao dao = null;

	public Set<Player> getallplayersService() {

		dao = new IplplayerDao();
		Set<Player> db = dao.getallplayers();
		return db;
	}

	public Set<Player> getteamplayersteamService(String ch) {
		dao = new IplplayerDao();
		Set<Player> db = dao.getallplayers();
		Set<Player> db1 = new HashSet<Player>();
		for (Player p1 : db) {
			if (p1.getName().contains(ch)) {
				db1.add(p1);
			}
		}
		return db1;
	}

	public Set<Player> getteamplayernameService(String ch) {
		dao = new IplplayerDao();
		Set<Player> db = dao.getallplayers();
		Set<Player> db2 = new HashSet<Player>();
		for (Player p1 : db) {
			if (p1.getName().contains(ch)) {
				db2.add(p1);
			}
		}
		return db2;
	}

	public Set<Player> getplayersrunService(int run) {
		dao = new IplplayerDao();
		Set<Player> db = dao.getallplayers();
		Set<Player> db3 = new HashSet<Player>();
		for (Player p1 : db) {
			if (p1.getRun() == run) {
				db3.add(p1);
			}

		}
		return db3;

	}
}