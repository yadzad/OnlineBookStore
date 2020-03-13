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
		releaseTime;

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
}

