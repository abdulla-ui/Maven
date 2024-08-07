package booktest;

import org.testng.annotations.Test;

import basesshow.Baseshow;
import bookpkg.Bookmypkg;
import excelutil.Excelshow;


public class Bookmytest extends Baseshow {

	
	@Test
	public void test() throws Exception
	{
		Bookmypkg ob=new Bookmypkg(driver);
		String xl="C:\\Users\\LAPTOP SHOP\\OneDrive\\Documents\\bookmyshow.xlsx";
		String sheet1="sheet1";
		int rowcount=Excelshow.getrowcount(xl, sheet1);
		for(int i=1;i<=rowcount;i++)
		{
			String username=Excelshow.getcellValue(xl, sheet1, i, 0);
			System.out.println("user="+username);
			
			String paswd=Excelshow.getcellValue(xl, sheet1, i, 1);
			System.out.println("password="+paswd);
			ob.setvalues(username, paswd);
			ob.login();
			ob.product();
			ob.setvalues1("kanhangad", "671315");
			ob.checkout();
			ob.setvalues2("abdulla", "nidha", "addpen", "kanhangad,kasargod", "kanhangad", "671315", "8129226002");
			ob.placeoder();
			//ob.cancel();
			//ob.bankcancel();
			ob.logout();
			
			
			
			
	}
	}
}
