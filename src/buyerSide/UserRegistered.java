package buyerSide;
import java.io.*;

import java.nio.charset.Charset;
import java.sql.*;
import java.util.ArrayList;
import buyerSide.DBException.BadExecution;


public class UserRegistered {
	// JDBC driver name and database URL
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		static final String DB_URL = "jdbc:mysql://cdb-4cc35yyq.cd.tencentcdb.com:10031/Online_Bookstore";

		//  Database credentials
		static final String USER = "root";
		static final String PASS = "whu@2020@dachuang";
		
		public static JasonReturn Registered(JasonRecive js){
			Connection conn = null;
			Statement stmt = null;
			

			try{
				
			   //STEP 2: Register JDBC driver
			   Class.forName("com.mysql.jdbc.Driver");

			   //STEP 3: Open a connection
			   System.out.println("Connecting to database...");
			   conn = DriverManager.getConnection(DB_URL, USER, PASS);

			   //STEP 4: SQL������ʼ
			   System.out.println("Creating statement...");
			   stmt = conn.createStatement();	   	
			    
			   JasonReturn jsr = new JasonReturn();
			   
			   String UserPhoneNumbers = js.getUserPhoneNumbers();
			   String UserName = js.getUserName();
			   String UserEMail = js.getUserEmail();
			   String UserAvatar = js.getUserAvatar();
			   String UserPassWord = js.getUserPassWord();
			   int UserNumbers =0 ;
			   
			   //�ֶθ�ֵ
			   
			   //SQL���
			   /*
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
			   //�˴��Ѿ�����һ������ͻ���û����룬��һ�����в������
			    
			    */
			   int PhCount =0;
			   String sql  ="SELECT COUNT(*) AS count FROM User WHERE  UserPhoneNumbers = '"+UserPhoneNumbers+"'";
			   ResultSet rs = stmt.executeQuery(sql);
			   while(rs.next())
			   {
				   PhCount = rs.getInt("count");
			   }
			   rs.close();
			   if(PhCount == 0)
			   {
			
			   int InsertResult = 0;
			   String sql1 = "REPLACE INTO User(UserPhoneNumbers, UserMail, UserAvatar, UserName, UserPassWord) VALUES('"+UserPhoneNumbers+"', '"+UserEMail+"', '"+UserAvatar+"', '"+UserName+"', "+UserPassWord+")"; 
			   InsertResult = stmt.executeUpdate(sql1);
			   if(InsertResult != 0)
			   {
				   sql1 = "SELECT UserNumbers, UserName, UserAvatar FROM User WHERE UserPhoneNumbers = '"+ UserPhoneNumbers+"'" ;
				   ResultSet rs1 = stmt.executeQuery(sql1);
				   while(rs1.next())
				   {
					   UserNumbers = rs1.getInt("UserNumbers");
				   }
				   rs1.close();
				   //�ɹ����������jsr���ֶ�ֵ
				   jsr.setFunctionCode("0111");
				   jsr.setUserNumbers(UserNumbers);
				   jsr.setUserName(UserName);
				   jsr.setUserAvatar(UserAvatar);
				   
				   return jsr;
			   }
			   else
			   {
				   //��������׳��쳣
				   throw new DBException.BadExecution("Error in :Insert User  at 0011 ");                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
			   }
			   }
			   else
			   {
				   jsr.setFunctionCode("1111");
			   }
			   
			}catch(SQLException se){
			   //Handle errors for JDBC
			   se.printStackTrace();
			}
			catch(BadExecution e){
				e.printStackTrace();
				  JasonReturn jsrn = new JasonReturn();
				  jsrn.setFunctionCode("1000");
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

			System.out.println("���ݿ����ӹر�");
			return null;
			}//end main


}
