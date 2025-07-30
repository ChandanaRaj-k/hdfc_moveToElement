package Reusable;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
public static String timestamp = new SimpleDateFormat("dd-MM-yyyy-HH.mm.ss").format(new Date());
	
	public static String reportpath = "ExtentReport/eReport-"+timestamp+".html";
	
	public static ExtentReport getExtentReport() {
		
		ExtentReport report = new ExtentReport();
		
		File extentReportFile = new File(reportpath);
		
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
		
		try {
			sparkReporter.loadXMLConfig("./src/test/resources/extent-report-config.xml");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		report.attachReporter(sparkReporter);
		
		return report;
	}

	private void attachReporter(ExtentSparkReporter sparkReporter) {
		// TODO Auto-generated method stub
		
	}


}

