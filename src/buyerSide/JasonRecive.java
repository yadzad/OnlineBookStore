package buyerSide;


public class JasonRecive 
{
private String FunctionCode;
private String	UserEmail;
private String	UserName;
private String	UserAvatar;
private String	UserPhoneNumbers;
private String	SearchText;
private String	DeliveryAddress;
private String	ProductName;
private String	MessageText;
private String	ReleaseTime;
private String	UnitPrice;
private String UserPassWord;

private int UserNumbers;
private int	ProductNumbers;
private int	PurchaseQuantity;
private int	MessageNumbers;
public JasonRecive(){}
/*
    public JasonRecive(String functionCode, String s1) //一个信息
    {
    	this.functionCode = functionCode;
    	if(functionCode == "0020")//用户搜索商品
    	{
    		this.searchText = s1;
    	}
    	
    }

	public JasonRecive(String functionCode, String s1, String s2)//两个信息
	{   
		this.functionCode = functionCode;
		if(functionCode == "0010")	//用户请求登录
		{
			this.userPhoneNumbers = s1;
			this.userPassWord = s2;
	         
		}
		else if(functionCode == "0030")//用户请求发布留言
		{
			this.userNumbers = Integer.parseInt(s1);
			this.messageText = s2;
		}
	}


public JasonRecive(String functionCode, String s1, String s2, String s3)//三个信息
	{   
	    this.functionCode = functionCode;
	  

	}
public JasonRecive(String functionCode, String s1, String s2, String s3,String s4)//四个信息
{
	this.functionCode = functionCode;
	if (functionCode == "0022")//用户将商品加入购物车
	{
		this.userNumbers = Integer.parseInt(s1);
		this.productNumbers = Integer.parseInt(s2);
		this.productName = s3;
		this.purchaseQuantity = Integer.parseInt(s4);
	}
	else if (functionCode == "0040")//用户上架商品
	{
		this.userNumbers = Integer.parseInt(s1);
		this.productNumbers = Integer.parseInt(s2);
		this.unitPrice = s3;
		this.purchaseQuantity = Integer.parseInt(s4);
		
	}
	else if(functionCode == "0050")//用户修改已上架商品
	{
		this.userNumbers = Integer.parseInt(s1);
		this.productNumbers = Integer.parseInt(s2);
		this.unitPrice = s3;
		this.purchaseQuantity = Integer.parseInt(s4);
	}
}
public JasonRecive(String functionCode, String s1, String s2, String s3,String s4,String s5)//五个信息
{
	this.functionCode = functionCode;
	if (functionCode == "0011")//用户请求注册
	{
		this.userEmail = s1;
	    this.userName = s2;
	    this.userAvatar = s3;
	    this.userPhoneNumbers = s4;
	    this.userPassWord = s5;
	}
	else if(functionCode == "0021")//用户购买商品
	{
		this.userNumbers = Integer.parseInt(s1);
		this.productNumbers = Integer.parseInt(s2);
		this.productName = s3;
		this.purchaseQuantity = Integer.parseInt(s4);
		this.deliveryAddress = s5;
	}
	else if(functionCode == "0023")/*用户购买购物车内所有商品
	{
		this.userNumbers = Integer.parseInt(s1);
		this.productNumbers = Integer.parseInt(s2);
		this.productName = s3;
		this.purchaseQuantity = Integer.parseInt(s4);
		this.deliveryAddress = s5;
	}

}

*/
public String getuserEmail()
{
	 return UserEmail;
}

public String getuserAvatar()
{
	 return UserAvatar;
}

public String getuserName()
{
	 return UserName;
}

public String getuserPhoneNumbers()
{
	 return UserPhoneNumbers;
}

public String getsearchText()
{
	 return SearchText;
}

public String getdeliveryAddress()
{
	 return DeliveryAddress;
}

public String getproductName()
{
	 return ProductName;
}

public String getmessageText()
{
	 return MessageText;
}

public String getreleaseTime()
{
	 return ReleaseTime;
}

public int getuserNumbers()
{
	 return UserNumbers;
	 
}

public int getproductNumbers()
{
	 return ProductNumbers;
}

public int getpurchaseQuantity()
{
	 return PurchaseQuantity;
}

public String getunitPrice()
{
	 return UnitPrice; 
}

public int getmessageNumbers()
{
	 return MessageNumbers;
}

public String getuserPassWord()
{
	 return UserPassWord;
}

public String getfunctionCode()
{	
	System.out.println("执行到getfunctionCode");
	 return FunctionCode;
}


public void setFunctionCode(String functionCode)
{
	System.out.println("执行到setfunctionCode");
	this.FunctionCode = functionCode;
}

public void setUserEmail(String userEmail)
{
	System.out.println("执行到setuserEmail");
	 this.UserEmail = userEmail;
}

public void setUserName(String userName)
{
	System.out.println("执行到setuserName");
	 this.UserName = userName;
}

public void setUserAvatar(String userAvatar)
{
	 this.UserAvatar = userAvatar;
	 
}

public void setUserPhoneNumbers(String userPhoneNumbers)
{
	System.out.println("执行到setuserPhoneNumbers");
	 this.UserPhoneNumbers = userPhoneNumbers;
}

public void setSearchText(String searchText)
{
	 this.SearchText = searchText;
}

public void setDeliveryAddress(String deliveryAddress)
{
	 this.DeliveryAddress = deliveryAddress;
}

public void setProductName(String productName)
{
	 this.ProductName = productName;
}
public void setMessageText(String messageText)
{
	 this.MessageText = messageText;
	 
}

public void setReleaseTime(String releaseTime)
{
	 this.ReleaseTime = releaseTime;
}

public void setUserNumbers(int userNumbers)
{
	 this.UserNumbers = userNumbers;
}

public void setProductNumbers(int productNumbers)
{
	 this.ProductNumbers = productNumbers;
}

public void setPurchaseQuantity(int purchaseQuantity)
{
	 this.PurchaseQuantity = purchaseQuantity;
}

public void setUnitPrice(String unitPrice)
{
	 this.UnitPrice = unitPrice;
}

public void setMessageNumbers(int messageNumbers)
{
	 this.MessageNumbers = messageNumbers;
}

public void setUserPassWord(String userPassWord)
{
	 this.UserPassWord = userPassWord;
}
}

