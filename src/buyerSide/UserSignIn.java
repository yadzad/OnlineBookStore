package buyerSide;

import java.sql.*;

public class UserSignIn {
	// JDBC driver name and database URL
			static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
			static final String DB_URL = "jdbc:mysql://cdb-4cc35yyq.cd.tencentcdb.com:10031/Online_BookStore";

			//  Database credentials
			static final String USER = "root";
			static final String PASS = "whu@2020@dachuang";
			
			public static JasonReturn SigIn(JasonRecive js){
				Connection conn = null;
				Statement stmt = null;
				

				try{
					
				   //STEP 2: Register JDBC driver
				   Class.forName("com.mysql.jdbc.Driver");

				   //STEP 3: Open a connection
				   System.out.println("Connecting to database...");
				   conn = DriverManager.getConnection(DB_URL, USER, PASS);

				   //STEP 4: SQL操作开始
				   System.out.println("Creating statement...");
				   stmt = conn.createStatement();	   	
				    
				   JasonReturn jsr = new JasonReturn();
				   
				   String userPhoneNumbers = "";
				   String userName = "";
				   String userMail = "";
				   String userAvatar = "";
				   int userNumbers =0 ;
				   
				   //字段赋值
				   
				   //SQL语句
				   int count = 0;
				   String sql1 = "SELECT COUNT(*) AS count FROM User WHERE userNumbers = "+userNumbers;
				   ResultSet rs1 = stmt.executeQuery(sql1);
				   while(rs1.next())
				   {
					   count = rs1.getInt("count");
				   }
				   rs1.close();
				   if(count != 0)
				   {
					   //查找到该账户则返回给前端信息
					   sql1 = "SELECT * FROM User WHERE userNumbers = "+userNumbers;
					   rs1 = stmt.executeQuery(sql1);
					   while(rs1.next())
					   {
						   //给相关数据赋值
					   }
					   rs1.close();
					   //给jsr赋值
					   return jsr;
				   }
				   else
				   {
					   //没有查找到该用户，返回错误信息
					   return jsr;
				   }
				}catch(SQLException se){
				   //Handle errors for JDBC
				   se.printStackTrace();
				}
				catch(Exception e){
				   //Handle errors for Class.forName
				   e.printStackTrace();
				}
				finally{
				   //finally block used to close resources
				   try{
				      if(stmt!=null)
				         stmt.close();
				   }catch(SQLException se2){
				   }// nothing we can do
				   try{
				      if(conn!=null)
				         conn.close();
				   }catch(SQLException se){
				      se.printStackTrace();
				   }//end finally try
				}//end try

				System.out.println("数据库连接关闭");
				return null;
				}//end main

}
