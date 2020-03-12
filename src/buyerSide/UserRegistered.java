package buyerSide;
import java.io.*;

import java.nio.charset.Charset;
import java.sql.*;
import java.util.ArrayList;
import buyerSide.DBException.BadExecution;


public class UserRegistered {
	// JDBC driver name and database URL
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		static final String DB_URL = "jdbc:mysql://cdb-4cc35yyq.cd.tencentcdb.com:10031/Online_BookStore";

		//  Database credentials
		static final String USER = "root";
		static final String PASS = "whu@2020@dachuang";
		
		public static JasonReturn Registered(JasonRecive js){
			Connection conn = null;
			Statement stmt = null;
			String keywords;

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
			   String sql1 ="SELECT COUNT (*) AS count FROM User";
			   ResultSet rs1 = stmt.executeQuery(sql1);
			   while(rs1.next())
			   {
				   count = rs1.getInt("count");
			   }
			   rs1.close();
			   userNumbers = ++count;
			   
			   while(true)
			   {
				   sql1 = "SELECT COUNT(*) AS count FROM User WHERE userNumbers = "+userNumbers;
				   rs1 = stmt.executeQuery(sql1);
				   while(rs1.next())
				   {
					   count = rs1.getInt("count");
				   }
				   rs1.close();
				   if(count == 0)
					   break;
				   else
					   userNumbers++;
			   }
			   //此处已经有了一个不冲突的用户代码，下一步进行插入操作
			   int InsertResult = 0;
			   sql1 = "INSERT INTO User(userNumbers, userPhoneNumbers, 	userMail, userAvatar, userName) VALUES("+userNumbers+", '"+userPhoneNumbers+"', '"+userMail+"', '"+userAvatar+"', '"+userName+"')"; 
			   InsertResult = stmt.executeUpdate(sql1);
			   if(InsertResult != 0)
			   {
				   //成功插入后设置jsr的字段值
			
				   return jsr;
			   }
			   else
			   {
				   //插入错误，抛出异常
				   throw new DBException.BadExecution("Error in :Insert User  at 0011 ");                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
			   }
			}catch(SQLException se){
			   //Handle errors for JDBC
			   se.printStackTrace();
			}
			catch(BadExecution e){
				e.printStackTrace();
				JasonReturn jsrn = new JasonReturn();
				//jsrn.setFunctionCode("1130");
				return jsrn;
			}catch(Exception e){
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
