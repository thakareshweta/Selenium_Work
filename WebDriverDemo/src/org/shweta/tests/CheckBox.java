package org.shweta.tests;

import org.openqa.selenium.WebElement;

public class CheckBox {
	private WebElement  _checkbox;
	
	public CheckBox(WebElement checkBox)
	{
		_checkbox = checkBox;
	}
	
	public WebElement getCheckBox(){
		return _checkbox;
	}
	
	public void check()
	{
		if(!_checkbox.isSelected())
		{
			_checkbox.click();
		}
	}
	
	public void uncheck()
	{
		if(_checkbox.isSelected())
		{
			_checkbox.click();
		}
	}
	
}
