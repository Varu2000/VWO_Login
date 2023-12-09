package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report_extnt {

	public static ExtentReports getReport() {

		ExtentSparkReporter report = new ExtentSparkReporter("./reports/TestReport.html");
		ExtentReports extntReport = new ExtentReports();
		extntReport.attachReporter(report);
		return extntReport;
		
	}
}
