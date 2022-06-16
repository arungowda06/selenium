package com.Framework.Library;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods extends BaseTest{
	
	Actions act=new Actions(driver);
	Select dropdown;
	
	public void clickMethod(WebElement element) {
		element.click();	
	}
	
	public void enter_Value(WebElement element, String value){
		element.sendKeys(value);
	}
	
	public void select_dropdown(WebElement element){
		dropdown=new Select(element);
	}
	
	public void actions_Click(WebElement element){
		act.click(element);
	}
	
}
