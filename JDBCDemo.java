import java.sql.*;
import java.util.*;

public class JDBC_Demo1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/JSSATE","root","Neha02@hegde");
			System.out.println("Connection Eshtablished");
			PreparedStatement stat=con.prepareStatement("Insert into student"+"values(?,?,?,?,?)");
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter the Regno,Name,Mark1,Mark2,Total:");
			int ro=sc.nextInt();
			String name=sc.next();
			int mark1=sc.nextInt();
			int mark2=sc.nextInt();
			int total=sc.nextInt();
			stat.setInt(1,ro);
			stat.setString(2, name);
			stat.setInt(3, mark1);
			stat.setInt(4, mark2);
			stat.setInt(5, total);
			stat.execute();
			ResultSet rs=stat.executeQuery("select*from student");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(5));
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}


import java.sql.*;
public class JDBC_Demo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/JSSATE","root","Neha02@hegde");
			System.out.println("Connection Eshtablished");
			Statement st=con.createStatement();
			String sql="insert into student"+"(Regno,Name,Mark1,Mark2,Total)"+"values(6,'karan',30,30,160)";
			st.executeUpdate(sql);
			System.out.println("Insert completed");
			ResultSet rs=st.executeQuery("select*from student");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(5));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
}
