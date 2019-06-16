package wedriver.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class WebDriverClass 
	{
	  public static void main(String args[]) throws InterruptedException
	  {
		  
		  System.setProperty("webdriver.chrome.driver", "E:\\DevOps Exam\\WebDriverSelenium\\chromedriver.exe");
		  
		  WebDriver wd=new ChromeDriver();
		  wd.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	      Thread.sleep(100);
	      wd.findElement(By.name("txtUsername")).sendKeys("Admin");
	      wd.findElement(By.name("txtPassword")).sendKeys("admin123");
	      wd.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	      wd.findElement(By.id("menu_leave_viewLeaveModule")).click();
//	      Thread.sleep(100);
//	      wd.findElement(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck")).click();
	      Thread.sleep(100);
	      WebElement chechbox1=wd.findElement(By.id("leaveList_chkSearchFilter_-1"));
	      chechbox1.click();
	      wd.findElement(By.xpath("//*[@id=\"leaveList_txtEmployee_empName\"]")).sendKeys("Sayma");
	     boolean radio1=wd.findElement(By.id("leaveList_cmbWithTerminated")).isSelected();
	      
	      if(radio1)
	    	  System.out.println("already radio selected");
	      else
	      {
	    	  System.out.println("Already radio isnt selected");
	    	  WebElement radio=wd.findElement(By.id("leaveList_cmbWithTerminated"));
		      radio.click();
	      }
	      Thread.sleep(100);
	      WebElement checkbox2=wd.findElement(By.xpath("//*[@id=\"leaveList_chkSearchFilter_2\"]"));
	      checkbox2.click();
	      if (checkbox2.isSelected()) {					
	            System.out.println("Checkbox is Toggled On");					

	        } else {			
	            System.out.println("Checkbox is Toggled Off");					
	        }	
	      
	      boolean x=wd.findElement(By.id("leaveList_chkSearchFilter_1")).isSelected();
	      if(x==true)
	      {
	    	  System.out.println("already selected");
	      }
	      else
	      {
	    	  wd.findElement(By.id("leaveList_chkSearchFilter_1")).click();
	      }
	     
	      WebElement dropdownbox=wd.findElement(By.id("leaveList_cmbSubunit")); 
	      Select dropdown = new Select(dropdownbox);
	       dropdown.selectByVisibleText("IT");
         }
	  
		
	}
