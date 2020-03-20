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

				   //STEP 4: SQL������ʼ
				   System.out.println("Creating statement...");
				   stmt = conn.createStatement();	   	
				    
				   JasonReturn jsr = new JasonReturn();
				   
				   String userPhoneNumbers = js.getuserPhoneNumbers();
				   String userPassWord = js.getuserPassWord();
				   String userName = "";
				   String userAvatar = "";
				   int userNumbers = 0;
				   
				   //�ֶθ�ֵ
				   
				   //SQL���
				   int count = 0;
				   String sql1 = "SELECT * FROM User WHERE userPhoneNumbers = '"+userNumbers+"' AND userPassWord = '"+userPassWord+"'";
				   ResultSet rs1 = stmt.executeQuery(sql1);
				   while(rs1.next())
				   {
					   count = 1;
					   userName = rs1.getString("userName");
					   userAvatar = rs1.getString("userAvatar");
					   userNumbers = rs1.getInt("userNumbers");
					   
				   }
				   rs1.close();
				   if(count == 1)
				   {
					   //���ҵ����˻�����������ȷ�򷵻ظ�ǰ����Ϣ		
					   //��jsr��ֵ
					   jsr.setfunctionCode("0110");
					   jsr.setuserNumbers(userNumbers);
					   jsr.setuserName(userName);
					   jsr.setuserAvatar(userAvatar);
					   return jsr;
				   }
				   else
				   {
					   //û�в��ҵ����û������ش�����Ϣ
					   jsr.setfunctionCode("1110");
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

				System.out.println("���ݿ����ӹر�");
				return null;
				}//end main

}
