import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
public class Data_update {

	public static void update(Connection con,String sql) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("\n***������ ����***");
		Statement stat3=con.createStatement();
		int cnt3=stat3.executeUpdate(sql);
		if(cnt3>0)
			System.out.println("�����Ͱ� �����Ǿ����ϴ�!");
		else 
			System.out.println("[Error] ������ ���� ����!");
		stat3.close();
	}

}