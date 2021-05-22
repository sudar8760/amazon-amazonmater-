package com.locate;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJVMReport(String json) {
File file = new File("C:\\amazon\\target");
Configuration config = new Configuration(file, "amazon");
config.addClassifications("platform", "win10");
config.addClassifications("Browser", "Chrome");
config.addClassifications("version", " 90.0.4430.212");
config.addClassifications("Environment", "QA");
config.addClassifications("sprint", "13");
List<String> li = new ArrayList<String>();
li.add(json);
ReportBuilder builder = new ReportBuilder(li, config);
builder.generateReports();

	}

}
