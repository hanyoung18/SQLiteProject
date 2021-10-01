import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
public class Main {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("org.sqlite.JDBC");
			String dbFile="myfirst.db";
			con = DriverManager.getConnection("jdbc:sqlite:"+dbFile);
			Data_search.searchall(con);
			
			String values1="values('��ź�ҳ��','����','2010���','2013��',datetime('now','localtime'));";
			String values2="values('Ʈ���̽�','����','2020���','2015��',datetime('now','localtime'));";
			String values3="values('���','����','2000���','2006��',datetime('now','localtime'));";
			String values4="values('�����̰�','����','2020���','2015��',datetime('now','localtime'));";
			String values5="values('�ҳ�ô�','����','2000���','2007��',datetime('now','localtime'));";
			Data_add.new_data(con,values1);
			Data_add.new_data(con,values2);
			Data_add.new_data(con,values3);
			Data_add.new_data(con,values4);
			Data_add.new_data(con,values5);
			
			String sql2="update g_artists set a_year = '2000���, 2010���,2020���'"+"where id=1;";
			Data_update.update(con,sql2);
			
			String 	sql3="delete from g_artists where id =6";
			Data_delete.delete(con,sql3);
			
			Data_search.searchall(con);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					System.out.print("db quit");
					con.close();
				}
				catch(Exception e) {}
			}
		}
	}
}
