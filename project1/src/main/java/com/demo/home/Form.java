package com.demo.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Form {

	@FindBy(xpath="//label[@for='singleOrJointButtons-0']")
	WebElement radiobut;
	
	public void click_on_radiobut(){
		radiobut.click();
	}
}
