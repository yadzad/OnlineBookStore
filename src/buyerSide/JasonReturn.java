package buyerSide;


public class JasonReturn 
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
public JasonReturn()
{

 FunctionCode = "null";
 UserEmail = "null";
 UserName = "null";
 UserAvatar = "null";
 UserPhoneNumbers = "null";
 SearchText = "null";
 DeliveryAddress = "null";
 ProductName = "null";
 Messagetext = "null";
 Releasetime = "null";
 UserNumbers = -1;
 ProductNumbers = -1;
 PurchaseQuantity = -1;
 UnitPrice = "null";
 MessageNumbers = -1;
 UserPassWord = "null";
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


 
}