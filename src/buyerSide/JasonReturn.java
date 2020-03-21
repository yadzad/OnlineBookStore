package buyerSide;


public class JasonReturn 
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
 userAvatar = "null";
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
 public void setFunctionCode(String functionCode)
 {
  this.functionCode = functionCode;
 }
 public String getFunctionCode()
 {
	 return functionCode;
 }
 public void setUserPassWord(String userPassWord)
 {
  this.userPassWord = userPassWord;
 }
 public String getUserPassWord()
 {
	 return userPassWord;
 }
 public void setUserEmail(String userEmail)
 {
	 this.userEmail = userEmail;
 }
 public String getUserEmail()
 {
	 return userEmail;
 }
 public void setUserName(String userName)
 {
	 this.userName = userName;
 }
 public String getUserName()
 {
	 return userName;
 }
 public void setUserAvatar(String userAvatar)
 {
	 this.userAvatar = userAvatar;
	 
 }
 public String getUserAvatar()
 {
	 return userAvatar;
 }
 public void setUserPhoneNumbers(String userPhoneNumbers)
 {
	 this.userPhoneNumbers = userPhoneNumbers;
 }
 public String getUserPhoneNumbers()
 {
	 return userPhoneNumbers;
 }
 public void setSearchText(String searchText)
 {
	 this.searchText = searchText;
 }
 public String getSearchText()
 {
	 return searchText;
 }
 public void setDeliveryAddress(String deliveryAddress)
 {
	 this.deliveryAddress = deliveryAddress;
 }
 public String getDeliveryAddress()
 {
	 return deliveryAddress;
 }
 public void setProductName(String productName)
 {
	 this.productName = productName;
 }
 public String getProductName()
 {
	 return productName;
 }
 public void setMessageText(String messageText)
 {
	 this.messageText = messageText;
	 
 }
 public String getMessageText()
 {
	 return messageText;
 }
 public void setReleaseTime(String releaseTime)
 {
	 this.releaseTime = releaseTime;
 }
 public String getReleaseTime()
 {
	 return releaseTime;
 }
 public void setUserNumbers(int userNumbers)
 {
	 this.userNumbers = userNumbers;
 }
 public int getUserNumbers()
 {
	 return userNumbers;
	 
 }
 public void setProductNumbers(int productNumbers)
 {
	 this.productNumbers = productNumbers;
 }
 public int getProductNumbers()
 {
	 return productNumbers;
 }
 public void setPurchaseQuantity(int purchaseQuantity)
 {
	 this.purchaseQuantity = purchaseQuantity;
 }
 public int getPurchaseQuantity()
 {
	 return purchaseQuantity;
 }
 public void setUnitPrice(int unitPrice)
 {
	 this.unitPrice = unitPrice;
 }
 public int getUnitPrice()
 {
	 return unitPrice; 
 }
 public void setMessageNumbers(int messageNumbers)
 {
	 this.messageNumbers = messageNumbers;
 }
 public int getMessageNumbers()
 {
	 return messageNumbers;
 }
 
}