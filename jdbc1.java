import java.sql.*;
public class jdbc1 {
	public static void main(String args[]) throws SQLException
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gaya3","root","root");
			System.out.println("connected");
			PreparedStatement st=con.prepareStatement("insert into emp1 values(?,?,?,?)");
			st.setInt(1, 100);
			st.setString(2, "Tilaka");
			st.setInt(3,30000);
			st.setInt(4, 13);
			st.executeUpdate();
			st.close();
		    st=con.prepareStatement("select * from emp1");
		    ResultSet rs=st.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt("eno"));
				System.out.println(rs.getString("ename"));
				System.out.println(rs.getFloat("esal"));
			}
			
		}
		catch(ClassNotFoundException se)
		{
			System.out.println(se);
		}
		finally
		{
			con.setAutoCommit(false);
			con.commit();
		}
	}

}
