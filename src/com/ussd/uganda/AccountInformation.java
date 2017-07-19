package com.ussd.uganda;
import java.sql.*;
public class AccountInformation extends Operations  {
	 // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/ussd";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "namungoona";
	
	
	
	
	
	
	
	public AccountInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public static void M(){
		
	}
	

	
	
	public static void  SaveAllAirtimeToMobileKibiina(){
		
		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		    //  System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		     // System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		     // System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "update account set savingcredit= savingcredit + airtime, airtime=airtime-airtime";
		      stmt.executeUpdate(sql);
		      
		    
		     // System.out.println("Password Changed");
		
		     
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("");
		
	}
	
	
	public static String DateWithdraw(){
		
   String packageperiod ="" ;
		
		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		    //  System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		     // System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		     // System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "select packageperiod from account" ;
		      
		      
		      ResultSet rs = stmt.executeQuery(sql);

		      while(rs.next()){
		         //Retrieve by column name
		         
		    	  packageperiod = rs.getString("packageperiod");
		         

		         //Display values
		      //   System.out.print("ID: " + id);
		         
		      }
		      
		      
		
		     
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("");
		
		
		   
		   return packageperiod;
		
	}
	
	public static String CheckPassword(){
		
		
String password ="";
		
		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		    //  System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		     // System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		     // System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "select password from account" ;
		      
		      
		      ResultSet rs = stmt.executeQuery(sql);

		      while(rs.next()){
		         //Retrieve by column name
		         
		         password = rs.getString("password");
		         

		         //Display values
		      //   System.out.print("ID: " + id);
		         
		      }
		      
		      
		
		     
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("");
		
	
		
		return password;
	}
	
	public static void InsertPackageAmount(double Amount){
		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		    //  System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		     // System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		     // System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "update account set packageamount="+Amount;
		      stmt.executeUpdate(sql);
		      
		    
		     // System.out.println("Password Changed");
		
		     
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("");
		
	}
	
	
	
	public static String  GetSubscription(){
        String subscription ="";
	
		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		    //  System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		     // System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		     // System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "select subscription from account" ;
		      
		      
		      ResultSet rs = stmt.executeQuery(sql);

		      while(rs.next()){
		         //Retrieve by column name
		         
		    	  subscription = rs.getString("subscription");
		         

		         //Display values
		      //   System.out.print("ID: " + id);
		         
		      }
		      
		      
		
		     
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("");
		
		   
		   return subscription;
		
		   
		   
	}
	
	public static void TransferSavingCredit(double Amount){
		
		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		    //  System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		     // System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		     // System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "update account set  savingcredit=savingcredit-"+Amount;
		      stmt.executeUpdate(sql);
		      
		    
		     // System.out.println("Password Changed");
		
		     
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("");
		
		
	}
	
	//getting Account Name 
	
	
	
	public static String GetAccountName (){
		
		String SavingCredit ="";
				
				Connection conn = null;
				   Statement stmt = null;
				   try{
				      //STEP 2: Register JDBC driver
				      Class.forName("com.mysql.jdbc.Driver");

				      //STEP 3: Open a connection
				    //  System.out.println("Connecting to a selected database...");
				      conn = DriverManager.getConnection(DB_URL, USER, PASS);
				     // System.out.println("Connected database successfully...");
				      
				      //STEP 4: Execute a query
				     // System.out.println("Creating statement...");
				      stmt = conn.createStatement();

				      String sql = "select name from account" ;
				      
				      
				      ResultSet rs = stmt.executeQuery(sql);

				      while(rs.next()){
				         //Retrieve by column name
				         
				    	  SavingCredit = rs.getString("name");
				         

				         //Display values
				      //   System.out.print("ID: " + id);
				         
				      }
				      
				      
				
				     
				   }catch(SQLException se){
				      //Handle errors for JDBC
				      se.printStackTrace();
				   }catch(Exception e){
				      //Handle errors for Class.forName
				      e.printStackTrace();
				   }finally{
				      //finally block used to close resources
				      try{
				         if(stmt!=null)
				            conn.close();
				      }catch(SQLException se){
				      }// do nothing
				      try{
				         if(conn!=null)
				            conn.close();
				      }catch(SQLException se){
				         se.printStackTrace();
				      }//end finally try
				   }//end try
				   System.out.println("");
				
				
				   
				   return SavingCredit;
				
			}
			
			

	public static String AccoutBalance (){
		
String SavingCredit ="";
		
		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		    //  System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		     // System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		     // System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "select savingcredit from account" ;
		      
		      
		      ResultSet rs = stmt.executeQuery(sql);

		      while(rs.next()){
		         //Retrieve by column name
		         
		    	  SavingCredit = rs.getString("savingcredit");
		         

		         //Display values
		      //   System.out.print("ID: " + id);
		         
		      }
		      
		      
		
		     
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("");
		
		
		   
		   return SavingCredit;
		
	}
	
	
	
	//Getting package Amount
	
	
	public static String GetPackageAmount(){
		
String packageamount ="";
		
		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		    //  System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		     // System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		     // System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "select packageamount from account" ;
		      
		      
		      ResultSet rs = stmt.executeQuery(sql);

		      while(rs.next()){
		         //Retrieve by column name
		         
		    	  packageamount = rs.getString("packageamount");
		         

		         //Display values
		      //   System.out.print("ID: " + id);
		         
		      }
		      
		      
		
		     
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("");
		
		return packageamount;
		
		
	}
	
	//Get package period 
	
	
	public static String GetPackagePeriod(){
		
		String status ="";
				
				Connection conn = null;
				   Statement stmt = null;
				   try{
				      //STEP 2: Register JDBC driver
				      Class.forName("com.mysql.jdbc.Driver");

				      //STEP 3: Open a connection
				    //  System.out.println("Connecting to a selected database...");
				      conn = DriverManager.getConnection(DB_URL, USER, PASS);
				     // System.out.println("Connected database successfully...");
				      
				      //STEP 4: Execute a query
				     // System.out.println("Creating statement...");
				      stmt = conn.createStatement();

				      String sql = "select packageperiod from account" ;
				      
				      
				      ResultSet rs = stmt.executeQuery(sql);

				      while(rs.next()){
				         //Retrieve by column name
				         
				         status = rs.getString("packageperiod");
				         

				         //Display values
				      //   System.out.print("ID: " + id);
				         
				      }
				      
				      
				
				     
				   }catch(SQLException se){
				      //Handle errors for JDBC
				      se.printStackTrace();
				   }catch(Exception e){
				      //Handle errors for Class.forName
				      e.printStackTrace();
				   }finally{
				      //finally block used to close resources
				      try{
				         if(stmt!=null)
				            conn.close();
				      }catch(SQLException se){
				      }// do nothing
				      try{
				         if(conn!=null)
				            conn.close();
				      }catch(SQLException se){
				         se.printStackTrace();
				      }//end finally try
				   }//end try
				   System.out.println("");
				
				return status;
				
				
			}
	
	
	// Checking subscrption
	public static String CheckSubscription(){
		
String status ="";
		
		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		    //  System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		     // System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		     // System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "select subscription from account" ;
		      
		      
		      ResultSet rs = stmt.executeQuery(sql);

		      while(rs.next()){
		         //Retrieve by column name
		         
		         status = rs.getString("subscription");
		         

		         //Display values
		      //   System.out.print("ID: " + id);
		         
		      }
		      
		      
		
		     
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("");
		
		return status;
		
		
	}
	
	
	
	
	public static void Reset(){
		
		
		
		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		    //  System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		     // System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		     // System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "update account set airtime=0, savingcredit=0,password='', packageamount=0, packageperiod=0, subscription=0";
		      stmt.executeUpdate(sql);
		      
		    
		     // System.out.println("Password Changed");
		
		     
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("You have Successfully Reset the System ");
	}
	
	public static void SetPackagePeriod(double Period){
		
		
		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		    //  System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		     // System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		     // System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "update account set packageperiod=+"+Period;
		      stmt.executeUpdate(sql);
		      
		    
		     // System.out.println("Password Changed");
		
		     
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("");
	}
	
	public static void AddAirtimeAsync(double Amount){
		
		
		
		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		    //  System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		     // System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		     // System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "update account set airtime=airtime+"+Amount;
		      stmt.executeUpdate(sql);
		      
		    
		     // System.out.println("Password Changed");
		
		     
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("");
	}
	public static void Transaction(double Amount){
		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		    //  System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		     // System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		     // System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "update account set airtime=airtime-"+Amount+", savingcredit=savingcredit+"+Amount;
		      stmt.executeUpdate(sql);
		      
		    
		     // System.out.println("Password Changed");
		
		     
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("");
	}
	
	
	public static void Subscription(){
		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		    //  System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		     // System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		     // System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "update account set subscription=1";
		      stmt.executeUpdate(sql);
		      
		    
		     // System.out.println("Password Changed");
		
		     
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Subscription is done !");
	}
	
	
	public static void Unsubscription(){
		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		    //  System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		     // System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		     // System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "update account set subscription=0,packageamount=0";
		      stmt.executeUpdate(sql);
		      
		    
		     // System.out.println("Password Changed");
		
		     
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("");
	}
	
	
	public static String GetAirtime(){
		
		
		
		   String airtime ="" ;
				
				Connection conn = null;
				   Statement stmt = null;
				   try{
				      //STEP 2: Register JDBC driver
				      Class.forName("com.mysql.jdbc.Driver");

				      //STEP 3: Open a connection
				    //  System.out.println("Connecting to a selected database...");
				      conn = DriverManager.getConnection(DB_URL, USER, PASS);
				     // System.out.println("Connected database successfully...");
				      
				      //STEP 4: Execute a query
				     // System.out.println("Creating statement...");
				      stmt = conn.createStatement();

				      String sql = "select airtime from account" ;
				      
				      
				      ResultSet rs = stmt.executeQuery(sql);

				      while(rs.next()){
				         //Retrieve by column name
				         
				    	  airtime = rs.getString("airtime");
				         

				         //Display values
				      //   System.out.print("ID: " + id);
				         
				      }
				      
				      
				
				     
				   }catch(SQLException se){
				      //Handle errors for JDBC
				      se.printStackTrace();
				   }catch(Exception e){
				      //Handle errors for Class.forName
				      e.printStackTrace();
				   }finally{
				      //finally block used to close resources
				      try{
				         if(stmt!=null)
				            conn.close();
				      }catch(SQLException se){
				      }// do nothing
				      try{
				         if(conn!=null)
				            conn.close();
				      }catch(SQLException se){
				         se.printStackTrace();
				      }//end finally try
				   }//end try
				   System.out.println("");
				
				
				   
				   return airtime;
	}
	
	public static void InsertAT(double AT){
		
		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		    //  System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		     // System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		     // System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "Update account set airtime =airtime+"+ AT;
		      stmt.executeUpdate(sql);
		      
		    
		     // System.out.println("Password Changed");
		
		     
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("");
	}
	
	
	
	public static String GetPin (String Pass){
		
		String pin ="";
		
		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		    //  System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		     // System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		     // System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "select password from account where password ="+Pass ;
		      
		      
		      ResultSet rs = stmt.executeQuery(sql);

		      while(rs.next()){
		         //Retrieve by column name
		         
		         pin = rs.getString("password");
		         

		         //Display values
		      //   System.out.print("ID: " + id);
		         
		      }
		      
		      
		
		     
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("");
		
		return pin;
	}
	
	
	
	public static void  InsertPassword(String Password){
		

		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		    //  System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		     // System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		     // System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "Update account set password ="+ Password;
		      stmt.executeUpdate(sql);
		      
		    
		     // System.out.println("Password Changed");
		      
		      
		      
		     
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Password set Succesfully!");
		}//end main
		
	

	

}
