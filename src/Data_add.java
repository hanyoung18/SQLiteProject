import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
public class Data_add {

	public static void new_data(Connection con,String values)throws SQLException {
		System.out.println("\n �� ������ �߰�***");
		Statement stat2=con.createStatement();
		String sql2="insert into g_artists (name, a_type,a_year,debut, regdate)"+values;
		int cnt = stat2.executeUpdate(sql2);
		if(cnt>0) 
			System.out.println("���ο� �����Ͱ� �߰��Ǿ����ϴ�!");
		else
			System.out.println("[Error] ������ �߰� ����!");
		stat2.close();
	}
	
}