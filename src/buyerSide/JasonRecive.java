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

    public JasonRecive(String FunctionCode, String s1) //һ����Ϣ
    {
    	this.FunctionCode = FunctionCode;
    	if(FunctionCode == "0020")//�û�������Ʒ
    	{
    		this.SearchText = s1;
    	}
    	
    }

	public JasonRecive(String FunctionCode, String s1, String s2)//������Ϣ
	{   
		this.FunctionCode = FunctionCode;
		if(FunctionCode == "0010")	//�û������¼
		{
			this.UserPhoneNumbers = s1;
			this.UserPassWord = s2;
	         
		}
		else if(FunctionCode == "0030")//�û����󷢲�����
		{
			this.UserNumbers = Integer.parseInt(s1);
			this.Messagetext = s2;
		}
	}


public JasonRecive(String FunctionCode, String s1, String s2, String s3)//������Ϣ
	{   
	    this.FunctionCode = FunctionCode;
	  

	}
public JasonRecive(String FunctionCode, String s1, String s2, String s3,String s4)//�ĸ���Ϣ
{
	this.FunctionCode = FunctionCode;
	if (FunctionCode == "0022")//�û�����Ʒ���빺�ﳵ
	{
		this.UserNumbers = Integer.parseInt(s1);
		this.ProductNumbers = Integer.parseInt(s2);
		this.ProductName = s3;
		this.PurchaseQuantity = Integer.parseInt(s4);
	}
	else if (FunctionCode == "0040")//�û��ϼ���Ʒ
	{
		this.UserNumbers = Integer.parseInt(s1);
		this.ProductNumbers = Integer.parseInt(s2);
		this.UnitPrice = s3;
		this.PurchaseQuantity = Integer.parseInt(s4);
		
	}
	else if(FunctionCode == "0050")//�û��޸����ϼ���Ʒ
	{
		this.UserNumbers = Integer.parseInt(s1);
		this.ProductNumbers = Integer.parseInt(s2);
		this.UnitPrice = s3;
		this.PurchaseQuantity = Integer.parseInt(s4);
	}
}
public JasonRecive(String FunctionCode, String s1, String s2, String s3,String s4,String s5)//�����Ϣ
{
	this.FunctionCode = FunctionCode;
	if (FunctionCode == "0011")//�û�����ע��
	{
		this.UserEmail = s1;
	    this.UserName = s2;
	    this.UserAvatar = s3;
	    this.UserPhoneNumbers = s4;
	    this.UserPassWord = s5;
	}
	else if(FunctionCode == "0021")//�û�������Ʒ
	{
		this.UserNumbers = Integer.parseInt(s1);
		this.ProductNumbers = Integer.parseInt(s2);
		this.ProductName = s3;
		this.PurchaseQuantity = Integer.parseInt(s4);
		this.DeliveryAddress = s5;
	}
	else if(FunctionCode == "0023")//�û������ﳵ��������Ʒ
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

