import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
public class Data_update {

	public static void update(Connection con,String sql) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("\n***데이터 수정***");
		Statement stat3=con.createStatement();
		int cnt3=stat3.executeUpdate(sql);
		if(cnt3>0)
			System.out.println("데이터가 수정되었습니다!");
		else 
			System.out.println("[Error] 데이터 수정 오류!");
		stat3.close();
	}

}