package buyerSide;


public class JasonReturn 
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
public JasonReturn()
{
 functionCode = "null";
 userEmail = "null";
 userName = "null";
 userAvtar = "null";
 userPhoneNumbers = "null";
 searchText = "null";
 deliveryAddress = "null";
 productName = "null";
 messageText = "null";
 releaseTime = "null";
 userNumbers = -1;
 productNumbers = -1;
 purchaseQuantity = -1;
 unitPrice = -1;
 messageNumbers = -1;
 userPassWord = "null";
}
 public void setfunctionCode(String functionCode)
 {
  this.functionCode = functionCode;
 }
 public String getfunctionCode()
 {
	 return functionCode;
 }
 public void setuserPassWord(String userPassWord)
 {
  this.userPassWord = userPassWord;
 }
 public String getuserPassWord()
 {
	 return userPassWord;
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