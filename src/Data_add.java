import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
public class Data_add {

	public static void new_data(Connection con,String values)throws SQLException {
		System.out.println("\n 새 데이터 추가***");
		Statement stat2=con.createStatement();
		String sql2="insert into g_artists (name, a_type,a_year,debut, regdate)"+values;
		int cnt = stat2.executeUpdate(sql2);
		if(cnt>0) 
			System.out.println("새로운 데이터가 추가되었습니다!");
		else
			System.out.println("[Error] 데이터 추가 오류!");
		stat2.close();
	}
	
}