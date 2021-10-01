import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
public class Data_search {

	public static void searchall(Connection con) throws SQLException {
		System.out.println("\n***데이터 조회 ***");
		Statement stat1= con.createStatement();
		String sql="select *from g_artists";
		ResultSet rsl=stat1. executeQuery(sql);
		while(rsl.next()) {
			String id=rsl.getString("id");
			String name = rsl.getString("name");
			System.out.println(id+" "+ name);
		}
		stat1.close();// TODO Auto-generated method stub
		
	}

}
