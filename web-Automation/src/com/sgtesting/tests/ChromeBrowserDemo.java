package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	//interfce webdriver
	//to create sub child class object,it is difficult,if we create interface reference object easy to access all the classs
	private static WebDriver oBrowser=null;

	public static void main(String[] args) {
           launchBrowser();
           navigate();
	}
	private  static void launchBrowser()
	{
		try
		{
			//it set the chrome path,it give during run time
			System.setProperty("webdriver.chrome.driver","E:\\Example Automation\\Automation\\web-Automation\\library\\driver\\chromedriver.exe" );
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	private static void navigate()
	{
		try
		{
			//allocate memory to oBrowser
			oBrowser.get("http://localhost:81/user/submit_tt.do");
		}catch(Exception e)
		{
			e.printStackTrace();
	}
	}
}
