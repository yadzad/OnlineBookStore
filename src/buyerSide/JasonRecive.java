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
    public JasonRecive(String functionCode, String s1) //һ����Ϣ
    {
    	this.functionCode = functionCode;
    	if(functionCode == "0020")//�û�������Ʒ
    	{
    		this.searchText = s1;
    	}
    	
    }

	public JasonRecive(String functionCode, String s1, String s2)//������Ϣ
	{   
		this.functionCode = functionCode;
		if(functionCode == "0010")	//�û������¼
		{
			this.userPhoneNumbers = s1;
			this.userPassWord = s2;
	         
		}
		else if(functionCode == "0030")//�û����󷢲�����
		{
			this.userNumbers = Integer.parseInt(s1);
			this.messageText = s2;
		}
	}


public JasonRecive(String functionCode, String s1, String s2, String s3)//������Ϣ
	{   
	    this.functionCode = functionCode;
	  

	}
public JasonRecive(String functionCode, String s1, String s2, String s3,String s4)//�ĸ���Ϣ
{
	this.functionCode = functionCode;
	if (functionCode == "0022")//�û�����Ʒ���빺�ﳵ
	{
		this.userNumbers = Integer.parseInt(s1);
		this.productNumbers = Integer.parseInt(s2);
		this.productName = s3;
		this.purchaseQuantity = Integer.parseInt(s4);
	}
	else if (functionCode == "0040")//�û��ϼ���Ʒ
	{
		this.userNumbers = Integer.parseInt(s1);
		this.productNumbers = Integer.parseInt(s2);
		this.unitPrice = s3;
		this.purchaseQuantity = Integer.parseInt(s4);
		
	}
	else if(functionCode == "0050")//�û��޸����ϼ���Ʒ
	{
		this.userNumbers = Integer.parseInt(s1);
		this.productNumbers = Integer.parseInt(s2);
		this.unitPrice = s3;
		this.purchaseQuantity = Integer.parseInt(s4);
	}
}
public JasonRecive(String functionCode, String s1, String s2, String s3,String s4,String s5)//�����Ϣ
{
	this.functionCode = functionCode;
	if (functionCode == "0011")//�û�����ע��
	{
		this.userEmail = s1;
	    this.userName = s2;
	    this.userAvatar = s3;
	    this.userPhoneNumbers = s4;
	    this.userPassWord = s5;
	}
	else if(functionCode == "0021")//�û�������Ʒ
	{
		this.userNumbers = Integer.parseInt(s1);
		this.productNumbers = Integer.parseInt(s2);
		this.productName = s3;
		this.purchaseQuantity = Integer.parseInt(s4);
		this.deliveryAddress = s5;
	}
	else if(functionCode == "0023")/*�û������ﳵ��������Ʒ
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
	System.out.println("ִ�е�getfunctionCode");
	 return FunctionCode;
}


public void setFunctionCode(String functionCode)
{
	System.out.println("ִ�е�setfunctionCode");
	this.FunctionCode = functionCode;
}

public void setUserEmail(String userEmail)
{
	System.out.println("ִ�е�setuserEmail");
	 this.UserEmail = userEmail;
}

public void setUserName(String userName)
{
	System.out.println("ִ�е�setuserName");
	 this.UserName = userName;
}

public void setUserAvatar(String userAvatar)
{
	 this.UserAvatar = userAvatar;
	 
}

public void setUserPhoneNumbers(String userPhoneNumbers)
{
	System.out.println("ִ�е�setuserPhoneNumbers");
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

