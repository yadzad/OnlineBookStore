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
private String	Messagetext;
private String	Releasetime;
private String	UnitPrice;
private String UserPassWord;

private int UserNumbers;
private int	ProductNumbers;
private int	PurchaseQuantity;
private int	MessageNumbers;
public JasonRecive(){}

    public JasonRecive(String FunctionCode, String s1) //一个信息
    {
    	this.FunctionCode = FunctionCode;
    	if(FunctionCode == "0020")//用户搜索商品
    	{
    		this.SearchText = s1;
    	}
    	
    }

	public JasonRecive(String FunctionCode, String s1, String s2)//两个信息
	{   
		this.FunctionCode = FunctionCode;
		if(FunctionCode == "0010")	//用户请求登录
		{
			this.UserPhoneNumbers = s1;
			this.UserPassWord = s2;
	         
		}
		else if(FunctionCode == "0030")//用户请求发布留言
		{
			this.UserNumbers = Integer.parseInt(s1);
			this.Messagetext = s2;
		}
	}


public JasonRecive(String FunctionCode, String s1, String s2, String s3)//三个信息
	{   
	    this.FunctionCode = FunctionCode;
	  

	}
public JasonRecive(String FunctionCode, String s1, String s2, String s3,String s4)//四个信息
{
	this.FunctionCode = FunctionCode;
	if (FunctionCode == "0022")//用户将商品加入购物车
	{
		this.UserNumbers = Integer.parseInt(s1);
		this.ProductNumbers = Integer.parseInt(s2);
		this.ProductName = s3;
		this.PurchaseQuantity = Integer.parseInt(s4);
	}
	else if (FunctionCode == "0040")//用户上架商品
	{
		this.UserNumbers = Integer.parseInt(s1);
		this.ProductNumbers = Integer.parseInt(s2);
		this.UnitPrice = s3;
		this.PurchaseQuantity = Integer.parseInt(s4);
		
	}
	else if(FunctionCode == "0050")//用户修改已上架商品
	{
		this.UserNumbers = Integer.parseInt(s1);
		this.ProductNumbers = Integer.parseInt(s2);
		this.UnitPrice = s3;
		this.PurchaseQuantity = Integer.parseInt(s4);
	}
}
public JasonRecive(String FunctionCode, String s1, String s2, String s3,String s4,String s5)//五个信息
{
	this.FunctionCode = FunctionCode;
	if (FunctionCode == "0011")//用户请求注册
	{
		this.UserEmail = s1;
	    this.UserName = s2;
	    this.UserAvatar = s3;
	    this.UserPhoneNumbers = s4;
	    this.UserPassWord = s5;
	}
	else if(FunctionCode == "0021")//用户购买商品
	{
		this.UserNumbers = Integer.parseInt(s1);
		this.ProductNumbers = Integer.parseInt(s2);
		this.ProductName = s3;
		this.PurchaseQuantity = Integer.parseInt(s4);
		this.DeliveryAddress = s5;
	}
	else if(FunctionCode == "0023")//用户购买购物车内所有商品
	{
		this.UserNumbers = Integer.parseInt(s1);
		this.ProductNumbers = Integer.parseInt(s2);
		this.ProductName = s3;
		this.PurchaseQuantity = Integer.parseInt(s4);
		this.DeliveryAddress = s5;
	}

}


public String getUserEmail()
{
	 return UserEmail;
}

public String getUserAvatar()
{
	 return UserAvatar;
}

public String getUserName()
{
	 return UserName;
}

public String getUserPhoneNumbers()
{
	 return UserPhoneNumbers;
}

public String getSearchText()
{
	 return SearchText;
}

public String getDeliveryAddress()
{
	 return DeliveryAddress;
}

public String getProductName()
{
	 return ProductName;
}

public String getMessagetext()
{
	 return Messagetext;
}

public String getReleasetime()
{
	 return Releasetime;
}

public int getUserNumbers()
{
	 return UserNumbers;
	 
}

public int getProductNumbers()
{
	 return ProductNumbers;
}

public int getPurchaseQuantity()
{
	 return PurchaseQuantity;
}

public String getUnitPrice()
{
	 return UnitPrice; 
}

public int getMessageNumbers()
{
	 return MessageNumbers;
}

public String getUserPassWord()
{
	 return UserPassWord;
}

public String getFunctionCode()
{	

	 return FunctionCode;
}


public void setFunctionCode(String FunctionCode)
{
	
	this.FunctionCode = FunctionCode;
}

public void setUserEmail(String UserEmail)
{
	
	 this.UserEmail = UserEmail;
}

public void setUserName(String UserName)
{
	
	 this.UserName = UserName;
}

public void setUserAvatar(String UserAvatar)
{
	 this.UserAvatar = UserAvatar;
	 
}

public void setUserPhoneNumbers(String UserPhoneNumbers)
{
	
	 this.UserPhoneNumbers = UserPhoneNumbers;
}

public void setSearchText(String SearchText)
{
	 this.SearchText = SearchText;
}

public void setDeliveryAddress(String DeliveryAddress)
{
	 this.DeliveryAddress = DeliveryAddress;
}

public void setProductName(String ProductName)
{
	 this.ProductName = ProductName;
}
public void setMessagetext(String Messagetext)
{
	 this.Messagetext = Messagetext;
	 
}

public void setReleasetime(String Releasetime)
{
	 this.Releasetime = Releasetime;
}

public void setUserNumbers(int UserNumbers)
{
	 this.UserNumbers = UserNumbers;
}

public void setProductNumbers(int ProductNumbers)
{
	 this.ProductNumbers = ProductNumbers;
}

public void setPurchaseQuantity(int PurchaseQuantity)
{
	 this.PurchaseQuantity = PurchaseQuantity;
}

public void setUnitPrice(String UnitPrice)
{
	 this.UnitPrice = UnitPrice;
}

public void setMessageNumbers(int MessageNumbers)
{
	 this.MessageNumbers = MessageNumbers;
}

public void setUserPassWord(String UserPassWord)
{
	 this.UserPassWord = UserPassWord;
}
}

