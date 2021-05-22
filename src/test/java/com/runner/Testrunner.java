package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;

import com.locate.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"},glue= {"com.stepdef"},monochrome=true,dryRun=false,snippets=SnippetType.CAMELCASE,plugin= {"progress"})
public class Testrunner {
	@AfterClass
	public static void AfterAllExe() {
		JvmReport.generateJVMReport("C:\\amazon\\target\\amazon.json");

	}
}