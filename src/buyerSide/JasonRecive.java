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
    public JasonRecive(String functionCode, String s1) /*һ����Ϣ*/
    {
    	this.functionCode = functionCode;
    	
    }

	public JasonRecive(String functionCode, String s1, String s2)/*������Ϣ*/
	{   
		this.functionCode = functionCode;
		if(functionCode == "0122")	/*��Ʒ���빺�ﳵ�ɹ�*/
	{
			this.productName= s1;
	         this.purchaseQuantity= Integer.parseInt(s2);
	         
	}
		else if(functionCode == "0140")/*�û��ϼ���Ʒ�ɹ�*/
		{
			this.userNumbers = Integer.parseInt(s1);
			this.productNumbers = Integer.parseInt(s2);

		}
		else if(functionCode == "0150")/*�û��޸����ϼ���Ʒ�ɹ�*/
		{
			this.userNumbers = Integer.parseInt(s1);
			this.productNumbers = Integer.parseInt(s2);
		}
	}


public JasonRecive(String functionCode, String s1, String s2, String s3)/*������Ϣ*/
	{   
	    this.functionCode = functionCode;
	    if(functionCode == "0110") /*�ɹ���¼*/{
    		this.userNumbers = Integer.parseInt(s1);
    		this.userName = s2;
    		this.userAvtar = s3;
    	}
    	else if (functionCode == "0111") /*�ɹ�ע��*/{
    		this.userNumbers = Integer.parseInt(s1);
    		this.userName = s2;
    		this.userAvtar = s3;
    	}
    	else if(functionCode == "0120")/*�ɹ�������Ʒ*/
	{
		this.searchText = s1;
		this.purchaseQuantity = Integer.parseInt(s2);
		this.unitPrice = Integer.parseInt(s3);
		
	}
    	else if(functionCode == "0121")/*������Ʒ�ɹ�*/
    	{
    		this.productName = s1;
    		this.purchaseQuantity = Integer.parseInt(s2);
    		this.deliveryAddress = s3;
    		
    	}
    	
    	else if(functionCode == "0123")/*�����ﳵ��������Ʒ�ɹ�*/
	{
		this.productName = s1;
		this.purchaseQuantity = Integer.parseInt(s2);
		this.deliveryAddress = s3;
	}
    	else if(functionCode == "0130") /*�ɹ�����*/
	{
		this.messageNumbers = Integer.parseInt(s1);
		this.messageText = s2;
		this.releaseTime = s3;
	}

	}
}

