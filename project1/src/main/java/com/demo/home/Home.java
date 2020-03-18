package com.demo.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	WebDriver driver;
	
	@FindBy(xpath="//a[@title='Bank & Save']//div[@class='title-container']")
	WebElement bankAndSave;

	@FindBy(xpath="//div[@class='column-inner-tab-cell']//span[text()='Personal Savings']")
	WebElement personelSaving;
	
	@FindBy(xpath="//h6[text()='Savings Maximiser']")
	WebElement savingMax;
	
	@FindBy(xpath="/html/body/div[2]/div/section/div[3]/div/div[1]/a")
	WebElement openNow;
	
	@FindBy(xpath="//a[@tabindex='2']")
	WebElement newCust;
	
	public void click_on_bankAndSave(){
		bankAndSave.click();
	}
	public void click_on_bpersonelSaving(){
		personelSaving.click();
	}
	public void click_on_SavingMax(){
		savingMax.click();
	}
	public void click_on_openNow(){
		openNow.click();
	}
	public void click_on_newCust(){
		newCust.click();
	}
}
