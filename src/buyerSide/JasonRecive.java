package buyerSide;


public class JasonRecive 
{
private String 
        functionCode,  
		userEmail,
		userName,
		userAvatar,
		userPhoneNumbers,
		searchText,
		deliveryAddress,
		productName,
		messageText,
		releaseTime,
		unitPrice,
		userPassWord;

private int 
		userNumbers,
		productNumbers,
		purchaseQuantity,
		messageNumbers;
    public JasonRecive(String functionCode, String s1) /*һ����Ϣ*/
    {
    	this.functionCode = functionCode;
    	if(functionCode == "0020")/*�û�������Ʒ*/
    	{
    		this.searchText = s1;
    	}
    	
    }

	public JasonRecive(String functionCode, String s1, String s2)/*������Ϣ*/
	{   
		this.functionCode = functionCode;
		if(functionCode == "0010")	/*�û������¼*/
		{
			this.userPhoneNumbers = s1;
			this.userPassWord = s2;
	         
		}
		else if(functionCode == "0030")/*�û����󷢲�����*/
		{
			this.userNumbers = Integer.parseInt(s1);
			this.messageText = s2;
		}
	}


public JasonRecive(String functionCode, String s1, String s2, String s3)/*������Ϣ*/
	{   
	    this.functionCode = functionCode;
	  

	}
public JasonRecive(String functionCode, String s1, String s2, String s3,String s4)/*�ĸ���Ϣ*/
{
	this.functionCode = functionCode;
	if (functionCode == "0022")/*�û�����Ʒ���빺�ﳵ*/
	{
		this.userNumbers = Integer.parseInt(s1);
		this.productNumbers = Integer.parseInt(s2);
		this.productName = s3;
		this.purchaseQuantity = Integer.parseInt(s4);
	}
	else if (functionCode == "0040")/*�û��ϼ���Ʒ*/
	{
		this.userNumbers = Integer.parseInt(s1);
		this.productNumbers = Integer.parseInt(s2);
		this.unitPrice = s3;
		this.purchaseQuantity = Integer.parseInt(s4);
		
	}
	else if(functionCode == "0050")/*�û��޸����ϼ���Ʒ*/
	{
		this.userNumbers = Integer.parseInt(s1);
		this.productNumbers = Integer.parseInt(s2);
		this.unitPrice = s3;
		this.purchaseQuantity = Integer.parseInt(s4);
	}
}
public JasonRecive(String functionCode, String s1, String s2, String s3,String s4,String s5)/*�����Ϣ*/
{
	this.functionCode = functionCode;
	if (functionCode == "0011")/*�û�����ע��*/
	{
		this.userEmail = s1;
	    this.userName = s2;
	    this.userAvatar = s3;
	    this.userPhoneNumbers = s4;
	    this.userPassWord = s5;
	}
	else if(functionCode == "0021")/*�û�������Ʒ*/
	{
		this.userNumbers = Integer.parseInt(s1);
		this.productNumbers = Integer.parseInt(s2);
		this.productName = s3;
		this.purchaseQuantity = Integer.parseInt(s4);
		this.deliveryAddress = s5;
	}
	else if(functionCode == "0023")/*�û������ﳵ��������Ʒ*/
	{
		this.userNumbers = Integer.parseInt(s1);
		this.productNumbers = Integer.parseInt(s2);
		this.productName = s3;
		this.purchaseQuantity = Integer.parseInt(s4);
		this.deliveryAddress = s5;
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
public void setuserAvatar(String userAvatar)
{
	 this.userAvatar = userAvatar;
	 
}
public String getuserAvatar()
{
	 return userAvatar;
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
public void setunitPrice(String unitPrice)
{
	 this.unitPrice = unitPrice;
}
public String getunitPrice()
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
public void setuserPassWord(String userPassWord)
{
	 this.userPassWord = userPassWord;
}
public String getuserPassWord()
{
	 return userPassWord;
}
}

