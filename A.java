

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Com.jdbc.PojoEmployee;

public class A {
 

	public static void main(String[] args) {
		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3307/player_task";
		String pwd = "root";
		String uname = "root";
		
		PojoClassPlayer obj = null;
		Statement st = null;
		ResultSet rs = null;
		
		 String Queary  = "SELECT * FROM Player_task.player";
		 

		try {
			Class.forName(path);
		System.out.println(1);
			System.out.println("Driver class loaded Sucessfully in memory");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("not foud path");
		}
		
		 try {
		Connection conn =	DriverManager.getConnection(url, pwd, uname);
			System.out.println(2);
			
			st = conn.createStatement();
			System.out.println(3);
			
			rs = st.executeQuery(Queary);
			System.out.println(4);
			
			while(rs.next()) {
				
				String STeam = rs.getNString("Team");
				String SPlayerName = rs.getNString("PlayerName");
				int  SPlayerID = rs.getInt("PlayerID");
				int STotalRuns = rs.getInt("TotalRuns");
				
				obj = new PojoClassPlayer(STeam , SPlayerName ,SPlayerID ,STotalRuns);
				System.out.println(obj);
				//System.out.println("*************************************************************");
			//	System.out.println("PojoClassPlayer  Team name is %s ,  PojoClassPlayer PlayerName name is %15   ");
			}

			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Connection not found");
		}
		
	}
}
