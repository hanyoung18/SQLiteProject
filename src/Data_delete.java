import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
public class Data_delete {

	public static void delete(Connection con,String sql) throws SQLException {
		System.out.println("\n*** ������ ���� ***");
		Statement stat4=con.createStatement();

		int cnt4=stat4.executeUpdate(sql);
		if(cnt4 > 0)
			System.out.println("�����Ͱ� �����Ǿ����ϴ�!");
		else
			System.out.println("[Error] ������ ���� ����!");
		stat4.close();
	}

}
