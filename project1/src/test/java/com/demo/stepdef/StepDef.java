package com.demo.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.demo.home.Form;
import com.demo.home.Home;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	public WebDriver driver;
	 

@Given("launch the url")
public void launch_the_url() {
   

    System.setProperty("webdriver.chrome.driver","C:\\Users\\logasweetha.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.ing.com.au/");
}

@When("fill the form")
public void fill_the_form() throws InterruptedException {
	Home home=PageFactory.initElements(driver, Home.class);
    Thread.sleep(5000);
    home.click_on_bankAndSave();
    
    home.click_on_bpersonelSaving();
    
    Thread.sleep(1000);
    home.click_on_SavingMax();
    home.click_on_openNow();

    Thread.sleep(1000);
    home.click_on_newCust();
    
    Thread.sleep(5000);
    
    Form form=PageFactory.initElements(driver, Form.class);
    form.click_on_radiobut();
    
}

@Then("logged in")
public void logged_in() {
    
}



}
