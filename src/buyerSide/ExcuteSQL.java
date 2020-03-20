package buyerSide;


public class ExcuteSQL {
	public static JasonReturn Excute(JasonRecive jsr) 
	{
		JasonReturn jsrn_null = new JasonReturn();
		String FuncitonCode = jsr.getfunctionCode();
		if(FuncitonCode.equals("0010"))
		{
			JasonReturn jsrn = UserSignIn.SigIn(jsr);
			return jsrn;
		}
		else if(FuncitonCode.equals("0011"))
		{
			JasonReturn jsrn = UserRegistered.Registered(jsr);
			return jsrn;
		}
		return jsrn_null;
		
	}
	
}
