package Com.tka.Dao;
import java.util.HashSet;
import java.util.Set;
import Com.tka.entity.Player;
public class IplplayerDao {
public  Set<Player> getallplayers1( ){
	
  Set<Player> db = new HashSet<Player>();

  db.add(new Player("MSD" , 3000,"CSK" ,12));

         return db;  
    }
	
	public Set<Player> getallplayers() {
		Set<Player> db = new HashSet<Player>();
		db.add(new Player("MSD" ,  3000 , "CSK"  ,11));
		db.add(new Player("Rishabh pant" , 5000,"mi" ,12));
		db.add(new Player("Ruturaj Gaikwad " , 5000,"Delhi Capitals" ,14));
		db.add(new Player("Sanuja Samson" , 6000,"Gujarat Titans" ,18));
		db.add(new Player("Abhisheck sharma" , 7000,"Mumbai indians" ,19));
		db.add(new Player("Shubham gil" , 8000,"Rcb" ,3));
		return db;
	
		
		
	}
}
