package com.automationtesting.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassPractice {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver dr= new ChromeDriver();
		dr.get("https://facebook.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
