import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Lib {

	public static void write(String input)
	{
		System.out.println(input);
	}
	
	public static String getSQLDate(int id)
	{
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String[] Answers = new String[40];
		
		String url = "jdbc:mysql://server.snekabel.se/spel";
	    String user = "spelbasic";
	    String password = "lol123";
	    
	    try {
	    	con = DriverManager.getConnection(url, user, password);
	    	pst = con.prepareStatement("SELECT datetime FROM Animals WHERE  =" + id);
	        rs = pst.executeQuery();
	        
	        java.sql.ResultSetMetaData rsMetaData = rs.getMetaData();

	        int numberOfColumns = rsMetaData.getColumnCount();
	        System.out.println("Number of columns:" + numberOfColumns);
	        while (rs.next())
	        {
	        	for(int i =1; i <= numberOfColumns; i++)
	        	{
	        		Answers[i] = rs.getString(i);
	        		//System.out.println(i);
	        		//System.out.println(rs.getString(i));
	        		//System.out.println(rsMetaData.getColumnType(i));
	        	}
	        }
	        	
	        } catch (SQLException ex) {
	                Logger lgr = Logger.getLogger(Lib.class.getName());
	                lgr.log(Level.SEVERE, ex.getMessage(), ex);

	        } finally {

	            try {
	                if (rs != null) {
	                    rs.close();
	                }
	                if (pst != null) {
	                    pst.close();
	                }
	                if (con != null) {
	                    con.close();
	                }

	            } catch (SQLException ex) {
	                Logger lgr = Logger.getLogger(Lib.class.getName());
	                lgr.log(Level.WARNING, ex.getMessage(), ex);
	            }
	        }
	    return "lol";
	}
}
