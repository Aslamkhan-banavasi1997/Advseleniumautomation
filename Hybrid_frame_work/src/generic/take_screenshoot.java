package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.asn1.dvcs.Data;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class take_screenshoot 
{
private static final take_screenshoot driver = null;

public static void main(String[]args) throws IOException
{
	String photo="./photo/";
	Date  d=new Date();
	String d1=d.toString();
	String d2=d1.replaceAll(":", "-");
	
	TakesScreenshot ts=(TakesScreenshot)driver;
   File src = ts.getScreenshotAs(OutputType.FILE);
   File dst = new File(photo+d2+".jpeg");
   FileUtils.copyFile(src, dst);
    
}
}

