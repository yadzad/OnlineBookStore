package buyerSide;


public class JasonRecive 
{
private String 
        functionCode,  
		userEmail,
		userName,
		userAvtar,
		userPhoneNumbers,
		searchText,
		deliveryAddress,
		productName,
		messageText,
		releaseTime,
		userPassWord;

private int 
		userNumbers,
		productNumbers,
		purchaseQuantity,
		unitPrice,
		messageNumbers;
    public JasonRecive(String functionCode, String s1) /*一个信息*/
    {
    	this.functionCode = functionCode;
    	
    }

	public JasonRecive(String functionCode, String s1, String s2)/*两个信息*/
	{   
		this.functionCode = functionCode;
		if(functionCode == "0122")	/*商品加入购物车成功*/
	{
			this.productName= s1;
	         this.purchaseQuantity= Integer.parseInt(s2);
	         
	}
		else if(functionCode == "0140")/*用户上架商品成功*/
		{
			this.userNumbers = Integer.parseInt(s1);
			this.productNumbers = Integer.parseInt(s2);

		}
		else if(functionCode == "0150")/*用户修改已上架商品成功*/
		{
			this.userNumbers = Integer.parseInt(s1);
			this.productNumbers = Integer.parseInt(s2);
		}
	}


public JasonRecive(String functionCode, String s1, String s2, String s3)/*三个信息*/
	{   
	    this.functionCode = functionCode;
	    if(functionCode == "0110") /*成功登录*/{
    		this.userNumbers = Integer.parseInt(s1);
    		this.userName = s2;
    		this.userAvtar = s3;
    	}
    	else if (functionCode == "0111") /*成功注册*/{
    		this.userNumbers = Integer.parseInt(s1);
    		this.userName = s2;
    		this.userAvtar = s3;
    	}
    	else if(functionCode == "0120")/*成功搜索商品*/
	{
		this.searchText = s1;
		this.purchaseQuantity = Integer.parseInt(s2);
		this.unitPrice = Integer.parseInt(s3);
		
	}
    	else if(functionCode == "0121")/*购买商品成功*/
    	{
    		this.productName = s1;
    		this.purchaseQuantity = Integer.parseInt(s2);
    		this.deliveryAddress = s3;
    		
    	}
    	
    	else if(functionCode == "0123")/*购买购物车内所有商品成功*/
	{
		this.productName = s1;
		this.purchaseQuantity = Integer.parseInt(s2);
		this.deliveryAddress = s3;
	}
    	else if(functionCode == "0130") /*成功留言*/
	{
		this.messageNumbers = Integer.parseInt(s1);
		this.messageText = s2;
		this.releaseTime = s3;
	}

	}

public void setfunctionCode(String functionCode)
{
 this.functionCode = functionCode;
}
public String getfunctionCode()
{
	 return functionCode;
}
public void setuserEmail(String userEmail)
{
	 this.userEmail = userEmail;
}
public String getuserEmail()
{
	 return userEmail;
}
public void setuserName(String userName)
{
	 this.userName = userName;
}
public String getuserName()
{
	 return userName;
}
public void setuserAvtar(String userAvtar)
{
	 this.userAvtar = userAvtar;
	 
}
public String getuserAvatar()
{
	 return userAvtar;
}
public void setuserPhoneNumbers(String userPhoneNumbers)
{
	 this.userPhoneNumbers = userPhoneNumbers;
}
public String getuserPhoneNumbers()
{
	 return userPhoneNumbers;
}
public void setsearchText(String searchText)
{
	 this.searchText = searchText;
}
public String getsearchText()
{
	 return searchText;
}
public void setdeliveryAddress(String deliveryAddress)
{
	 this.deliveryAddress = deliveryAddress;
}
public String getdeliveryAddress()
{
	 return deliveryAddress;
}
public void setproductName(String productName)
{
	 this.productName = productName;
}
public String productName()
{
	 return productName;
}
public void setmessageText(String messageText)
{
	 this.messageText = messageText;
	 
}
public String getmessageText()
{
	 return messageText;
}
public void setreleaseTime(String releaseTime)
{
	 this.releaseTime = releaseTime;
}
public String getreleaseTime()
{
	 return releaseTime;
}
public void setuserNumbers(int userNumbers)
{
	 this.userNumbers = userNumbers;
}
public int getuserNumbers()
{
	 return userNumbers;
	 
}
public void setproductNumbers(int productNumbers)
{
	 this.productNumbers = productNumbers;
}
public int getproductNumbers()
{
	 return productNumbers;
}
public void setpurchaseQuantity(int purchaseQuantity)
{
	 this.purchaseQuantity = purchaseQuantity;
}
public int getpurchaseQuantity()
{
	 return purchaseQuantity;
}
public void setunitPrice(int unitPrice)
{
	 this.unitPrice = unitPrice;
}
public int getunitPrice()
{
	 return unitPrice; 
}
public void setmessageNumbers(int messageNumbers)
{
	 this.messageNumbers = messageNumbers;
}
public int getmessageNumbers()
{
	 return messageNumbers;
}
}

