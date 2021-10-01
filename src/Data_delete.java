import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
public class Data_delete {

	public static void delete(Connection con,String sql) throws SQLException {
		System.out.println("\n*** 데이터 삭제 ***");
		Statement stat4=con.createStatement();

		int cnt4=stat4.executeUpdate(sql);
		if(cnt4 > 0)
			System.out.println("데이터가 삭제되었습니다!");
		else
			System.out.println("[Error] 데이터 삭제 오류!");
		stat4.close();
	}

}
