import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Lib {

	public static void write(String input)
	{
		System.out.println(input);
	}
	
	public static String input()
	{
		Lib.write("write command:");
		System.out.print(">");
		Scanner sc = new Scanner(System.in);
		String Command = sc.nextLine();
		return Command;
	}
	
	public static String getLatestDate(String name)
	{
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		//String[] Answers = new String[40];
		String Answer = "";
		
		String url = "jdbc:mysql://server.snekabel.se/spel";
	    String user = "spelbasic";
	    String password = "lol123";
	    
	    try {
	    	con = DriverManager.getConnection(url, user, password);
	    	pst = con.prepareStatement("SELECT datetime FROM Animals WHERE animal =\"" + name + "\"");
	        rs = pst.executeQuery();
	        
	        java.sql.ResultSetMetaData rsMetaData = rs.getMetaData();

	        int numberOfColumns = rsMetaData.getColumnCount();
	        //System.out.println("Number of columns:" + numberOfColumns);
	        while (rs.next())
	        {
	        	for(int i =1; i <= numberOfColumns; i++)
	        	{
	        		Answer = rs.getString(i);
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
	    return Answer;
	}
	
	public static String addThing(String command, String username, String animalname)
	{
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		//String[] Answers = new String[40];
		String Answer = "";
		
		String url = "jdbc:mysql://server.snekabel.se/spel";
	    String user = "spelbasic";
	    String password = "lol123";
	    
	    try {
	    	con = DriverManager.getConnection(url, user, password);
	    	pst = con.prepareStatement("INSERT INTO Animals(user,animal,command) VALUES(?,?,?)");
            pst.setString(1, username);
            pst.setString(2, animalname);
            pst.setString(3, command);
            pst.executeUpdate();
	        	
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
	    return Answer;
	}
	
}
