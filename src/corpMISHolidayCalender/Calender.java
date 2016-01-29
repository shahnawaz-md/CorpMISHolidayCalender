package corpMISHolidayCalender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Calender {
	static WebDriver driver;
	private static final long TIMEOUT = 12000;
	
	@BeforeClass
	
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shahnawaz\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("http://192.168.10.131:8089/corpmis/admin/home");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown()	{
		
		driver.close();
		driver.quit();
	}	
	
	@Test
	public static void HolidayCalender() throws InterruptedException{
		driver.findElement(By.id("loginId")).sendKeys("admin-in");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("loginSubmit")).click();
		WebElement element = driver.findElement(By.linkText("Office Transaction"));
		 
        Actions action = new Actions(driver);
 
        action.moveToElement(element).perform();
        
        WebElement subElement = driver.findElement(By.xpath("//div[@id='headerPan']/div[4]/ul/li[7]/ul/li[2]/a"));
        
        action.moveToElement(subElement);
 
        action.click();
 
        action.perform();
        Thread.sleep(5000);
        
       
		driver.findElement(By.xpath("//div[@id='entityTabbedPanel']/ul/li[3]")).click();
		Thread.sleep(5000);
		WebElement company=driver.findElement(By.id("actionbean.companyHolidayCalendar.companyId.AutoCompleter"));
		company.sendKeys("ubi");
		Thread.sleep(5000);
		company.sendKeys(Keys.DOWN);
	//	company.sendKeys(Keys.DOWN);
		company.sendKeys(Keys.DOWN);
		company.sendKeys(Keys.ENTER);
		WebElement cal=driver.findElement(By.id("actionbean.companyHolidayCalendar.calendarPeriodId.AutoCompleter"));
		cal.sendKeys("2015");
		Thread.sleep(5000);
		cal.sendKeys(Keys.DOWN);
		cal.sendKeys(Keys.ENTER);
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_associatedEntitiesNumber")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_associatedEntitiesNumber")).sendKeys("23");
		driver.findElement(By.xpath(".//*[@id='StoreForm-CompanyHolidayCalendar']/div[7]/div/div[1]/div[2]/a[1]")).click();
		Thread.sleep(TIMEOUT);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_0__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_0__name")).sendKeys("New Year's Day");
		Select holiday = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_0__type"))); 
		holiday.selectByVisibleText("Company Holiday");
		//Calendar for New Year
	  	driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[0].date")).click();
	 	
	  
	  	//For Year
	   	WebElement year = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
	 	Select selectYear = new Select(year);
	 	selectYear.selectByValue("2015");
	 	Thread.sleep(2000);
	 		
	 	//For Month
		WebElement month = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth = new Select(month);
	 	selectMonth.selectByValue("0");
	 	driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[5]/a")).click();
	 	Thread.sleep(2000);
	 		
	 	driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_1__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_1__name")).sendKeys("Makar Sankranti/ Pongal");
		Select holiday1 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_1__type"))); 
		holiday1.selectByVisibleText("Restricted Holiday");
		//Calendar for Makar Sankranti/Pongal
	  	driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[1].date")).click();
		 	
		  
	  	//For Year
  	 	WebElement year1 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
	 	Select selectYear1 = new Select(year1);
	 	selectYear1.selectByValue("2015");		  	 			 		
 		Thread.sleep(2000);
		 		
		//For Month
 		WebElement month1 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
	 	Select selectMonth1 = new Select(month1);
	 	selectMonth1.selectByValue("0");
	 	driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[4]/a")).click(); 	
		Thread.sleep(2000);
			
	    driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_2__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_2__name")).sendKeys("Netaji Jayanti");
		Select holiday2 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_2__type"))); 
		holiday2.selectByVisibleText("Restricted Holiday");
		//Calendar for Netaji Jayanti
	  	driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[2].date")).click();
			 	
			  
	  	//For Year
	  	WebElement year2 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
	  	Select selectYear2 = new Select(year2);
	
	  	selectYear2.selectByValue("2015");			  	 			 		
		Thread.sleep(2000);
		
		//For Month
 		WebElement month2 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
 		Select selectMonth2 = new Select(month2);
		selectMonth2.selectByValue("0");
	 	driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[6]/a")).click();	 	
		Thread.sleep(2000);
			 		
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("scroll(0, 950)");
			 	
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_3__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_3__name")).sendKeys("Republic Day");
		Select holiday3 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_3__type"))); 
		holiday3.selectByVisibleText("Company Holiday");
		//Calendar for Republic Day
		driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[3].date")).click();
				 	
				  
		//For Year
		WebElement year3 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select selectYear3 = new Select(year3);
	    selectYear3.selectByValue("2015"); 			 		
		Thread.sleep(2000);
				 		
		//For Month
		WebElement month3 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth3 = new Select(month3);
		selectMonth3.selectByValue("0");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[2]/a")).click();	 	
		Thread.sleep(2000);
				 		
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_4__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_4__name")).sendKeys("Maha Shivratri");
		Select holiday4 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_4__type"))); 
	    holiday4.selectByVisibleText("Restricted Holiday");
		//Calendar for Maha Shivratri
		driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[4].date")).click();
					 	
					  
		//For Year
		WebElement year4 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select selectYear4 = new Select(year4);
		selectYear4.selectByValue("2015");					  	 			 		
		Thread.sleep(2000);
					 		
		//For Month
		WebElement month4 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth4 = new Select(month4);
		selectMonth4.selectByValue("1");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[3]/a")).click();						 	
		Thread.sleep(2000);
					 		
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_5__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_5__name")).sendKeys("Holi");
		Select holiday5 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_5__type"))); 
		holiday5.selectByVisibleText("Restricted Holiday");
		//Calendar for Holi
		driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[5].date")).click();
						 	
						  
		//For Year
		WebElement year5 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select selectYear5 = new Select(year5);
		selectYear5.selectByValue("2015");								  	 			 		
		Thread.sleep(2000);
						 		
		//For Month
		WebElement month5 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth5 = new Select(month5);
		selectMonth5.selectByValue("2");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[6]/a")).click();							 	
		Thread.sleep(2000);
						 		
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_6__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_6__name")).sendKeys("Good Friday");
		Select holiday6 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_6__type"))); 
		holiday6.selectByVisibleText("Restricted Holiday");
		//Calendar for Good Friday
		driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[6].date")).click();
							 	
							  
		//For Year
		WebElement year6 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select selectYear6 = new Select(year6);
		selectYear6.selectByValue("2015");									  	 			 		
		Thread.sleep(2000);
							 		
		//For Month
		WebElement month6 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth6 = new Select(month6);
		selectMonth6.selectByValue("3");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[6]/a")).click();								 	
		Thread.sleep(2000);
							 		
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_7__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_7__name")).sendKeys("Bengali New Year");
		Select holiday7 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_7__type"))); 
		holiday7.selectByVisibleText("Restricted Holiday");
		//Calendar for Bengali New Year
		driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[7].date")).click();
								 	
								  
		//For Year
		WebElement year7 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select selectYear7 = new Select(year7);
		selectYear7.selectByValue("2015");										  	 			 		
		Thread.sleep(2000);
								 		
		//For Month
		WebElement month7 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth7 = new Select(month7);
		selectMonth7.selectByValue("3");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[4]/a")).click();									 	
		Thread.sleep(2000);
								 		
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_8__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_8__name")).sendKeys("May Day");
		Select holiday8 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_8__type"))); 
		holiday8.selectByVisibleText("Company Holiday");
		//Calendar for May Day
		driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[8].date")).click();
									 	
									  
		//For Year
		WebElement year8 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select selectYear8 = new Select(year8);
		selectYear8.selectByValue("2015");											  	 			 		
		Thread.sleep(2000);
									 		
		//For Month
		WebElement month8 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth8 = new Select(month8);
		selectMonth8.selectByValue("4");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[6]/a")).click();										 	
		Thread.sleep(2000);
									 		
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_9__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_9__name")).sendKeys("Buddha Purnima");
		Select holiday9 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_9__type"))); 
		holiday9.selectByVisibleText("Restricted Holiday");
		//Calendar for Buddha Purnima
		driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[9].date")).click();
										 	
										  
		//For Year
		WebElement year9 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select selectYear9 = new Select(year9);
		selectYear9.selectByValue("2015");												  	 			 		
		Thread.sleep(2000);
										 		
		//For Month
		WebElement month9 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth9 = new Select(month9);
		selectMonth9.selectByValue("4");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[2]/a")).click();											 	
		Thread.sleep(2000);
										 		
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_10__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_10__name")).sendKeys("Raja Sankranti");
		Select holiday10 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_10__type"))); 
		holiday10.selectByVisibleText("Restricted Holiday");
		//Calendar for Raja Sankranti
		driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[10].date")).click();
											 	
											  
		//For Year
		WebElement year10 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select selectYear10 = new Select(year10);
		selectYear10.selectByValue("2015");													  	 			 		
		Thread.sleep(2000);
											 		
		//For Month
		WebElement month10 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth10 = new Select(month10);
		selectMonth10.selectByValue("5");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[2]/a")).click();												 	
		Thread.sleep(2000);
											 		
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_11__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_11__name")).sendKeys("Onam");
		Select holiday11 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_11__type"))); 
		holiday11.selectByVisibleText("Restricted Holiday");
		//Calendar for Onam
		driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[11].date")).click();
												 	
												  
		//For Year
		WebElement year11 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select selectYear11 = new Select(year11);
		selectYear11.selectByValue("2015");														  	 			 		
		Thread.sleep(2000);
												 		
		//For Month
		WebElement month11 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth11 = new Select(month11);
		selectMonth11.selectByValue("7");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[6]/a")).click();													 	
		Thread.sleep(2000);
												 		
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_12__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_12__name")).sendKeys("Ganesh Chaturthi");
		Select holiday12 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_12__type"))); 
		holiday12.selectByVisibleText("Restricted Holiday");
		//Calendar for Ganesh Chaturthi
		driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[12].date")).click();
													 	
													  
		//For Year
		WebElement year12 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select selectYear12 = new Select(year12);
		selectYear12.selectByValue("2015");															  	 			 		
		Thread.sleep(2000);
													 		
		//For Month
		WebElement month12 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth12 = new Select(month12);
		selectMonth12.selectByValue("8");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[5]/a")).click();														 	
		Thread.sleep(2000);
													 		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("scroll(0, 950)");
													 		
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_13__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_13__name")).sendKeys("IdUz Zoha");
		Select holiday13 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_13__type"))); 
		holiday13.selectByVisibleText("Restricted Holiday");
		//Calendar for IdUz Zoha
		driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[13].date")).click();
														 	
														  
		//For Year
		WebElement year13 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select selectYear13 = new Select(year13);
		selectYear13.selectByValue("2015");																  	 			 		
		Thread.sleep(2000);
														 		
		//For Month
		WebElement month13 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth13 = new Select(month13);
		selectMonth13.selectByValue("8");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[6]/a")).click();															 	
		Thread.sleep(2000);
														 		
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_14__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_14__name")).sendKeys("Mahatma Gandhi Jayanti");
		Select holiday14 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_14__type"))); 
		holiday14.selectByVisibleText("Company Holiday");
		//Calendar for Mahatma Gandhi Jayanti
		driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[14].date")).click();
															 	
															  
		//For Year
		WebElement year14 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select selectYear14 = new Select(year14);
		selectYear14.selectByValue("2015");																	  	 			 		
		Thread.sleep(2000);
															 		
		//For Month
		WebElement month14 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth14 = new Select(month14);
		selectMonth14.selectByValue("9");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[6]/a")).click();																 	
		Thread.sleep(2000);
															 		
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_15__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_15__name")).sendKeys("Durga Puja (Saptami)");
		Select holiday15 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_15__type"))); 
		holiday15.selectByVisibleText("Restricted Holiday");
		//Calendar for Durga Puja (Saptami)
		driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[15].date")).click();
																 	
																  
		//For Year
		WebElement year15 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select selectYear15 = new Select(year15);
		selectYear15.selectByValue("2015");																		  	 			 		
		Thread.sleep(2000);
																 		
		//For Month
		WebElement month15 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth15 = new Select(month15);
		selectMonth15.selectByValue("9");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[3]/a")).click();																	 	
		Thread.sleep(2000);
																 		
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_16__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_16__name")).sendKeys("Durga Puja (Astami)");
		Select holiday16 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_16__type"))); 
		holiday16.selectByVisibleText("Company Holiday");
		//Calendar for Durga Puja (Astami)
		driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[16].date")).click();
																	 	
																	  
		//For Year
		WebElement year16 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select selectYear16 = new Select(year16);
	 	selectYear16.selectByValue("2015");																			  	 			 		
		Thread.sleep(2000);
																	 		
		//For Month
		WebElement month16 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth16 = new Select(month16);
		selectMonth16.selectByValue("9");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[4]/a")).click();																		 	
		Thread.sleep(2000);
																	 		
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_17__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_17__name")).sendKeys("Dussera");
		Select holiday17 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_17__type"))); 
		holiday17.selectByVisibleText("Company Holiday");
		//Calendar for Dussera
		driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[17].date")).click();
																		 	
																		  
		//For Year
		WebElement year17 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select selectYear17 = new Select(year17);
		selectYear17.selectByValue("2015");																				  	 			 		
		Thread.sleep(2000);
																		 		
		//For Month
		WebElement month17 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth17 = new Select(month17);
		selectMonth17.selectByValue("9");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[5]/a")).click();																			 	
		Thread.sleep(2000);
																		 		
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_18__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_18__name")).sendKeys("Lakshmi Puja");
		Select holiday18 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_18__type"))); 
		holiday18.selectByVisibleText("Restricted Holiday");
		//Calendar for Lakshmi Puja
		driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[18].date")).click();
																			 	
																			  
		//For Year
		WebElement year18 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select selectYear18 = new Select(year18);
		selectYear18.selectByValue("2015");																					  	 			 		
		Thread.sleep(2000);
																			 		
		//For Month
		WebElement month18 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth18 = new Select(month18);
		selectMonth18.selectByValue("9");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[2]/a")).click();																				 	
		Thread.sleep(2000);
																			 		
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_19__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_19__name")).sendKeys("Diwali");
		Select holiday19 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_19__type"))); 
		holiday19.selectByVisibleText("Company Holiday");
		//Calendar for Diwali
		driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[19].date")).click();
																				 	
																				  
		//For Year
		WebElement year19 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select selectYear19 = new Select(year19);
		selectYear19.selectByValue("2015");																						  	 			 		
		Thread.sleep(2000);
																				 		
		//For Month
		WebElement month19 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth19 = new Select(month19);
		selectMonth19.selectByValue("10");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[4]/a")).click();																					 	
		Thread.sleep(2000);
																				 		
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_20__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_20__name")).sendKeys("Bhai Dooj");
		Select holiday20 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_20__type"))); 
		holiday20.selectByVisibleText("Restricted Holiday");
		//Calendar for Bhai Dooj
		driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[20].date")).click();
																					 	
																					  
		//For Year
		WebElement year20 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select selectYear20 = new Select(year20);
		selectYear20.selectByValue("2015");						  	 			 		
		Thread.sleep(2000);
																					 		
		//For Month
		WebElement month20 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth20 = new Select(month20);
		selectMonth20.selectByValue("10");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[6]/a")).click();																						 	
		Thread.sleep(2000);
																					 		
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_21__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_21__name")).sendKeys("Guru Nanak Jayanti");
		Select holiday21 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_21__type"))); 
		holiday21.selectByVisibleText("Restricted Holiday");
		//Calendar for Guru Nanak Jayanti
		driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[21].date")).click();
																						 	
																						  
		//For Year
		WebElement year21 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select selectYear21 = new Select(year21);
		selectYear21.selectByValue("2015");																								  	 			 		
		Thread.sleep(2000);
																						 		
		//For Month
		WebElement month21 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth21 = new Select(month21);
		selectMonth21.selectByValue("10");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[4]/a")).click();																							 	
		Thread.sleep(2000);
																						 		
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_22__name")).clear();
		driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_22__name")).sendKeys("Christmas");
		Select holiday22 = new Select(driver.findElement(By.id("StoreForm-CompanyHolidayCalendar_actionbean_companyHolidayCalendar_companyHolidays_22__type"))); 
		holiday22.selectByVisibleText("Company Holiday");
		//Calendar for Christmas
		driver.findElement(By.name("actionbean.companyHolidayCalendar.companyHolidays[22].date")).click();
																							 	
																							  
		//For Year
		WebElement year22 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select selectYear22 = new Select(year22);
		selectYear22.selectByValue("2015");																									  	 			 		
		Thread.sleep(2000);
																							 		
		//For Month
		WebElement month22 = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select selectMonth22 = new Select(month22);
		selectMonth22.selectByValue("11");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[6]/a")).click();																								 	
		Thread.sleep(2000);
																							 		
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("scroll(2500, 0)");
		Thread.sleep(2000);
																							 		
																							 																						 		
		//Store Button
			WebElement element1 = driver.findElement(By.xpath("//ul[@id='tools']/li[2]/a/span"));
		 	JavascriptExecutor executor = (JavascriptExecutor)driver;
		 	executor.executeScript("arguments[0].click();", element1);
		 	
		 	Thread.sleep(TIMEOUT);
		 	driver.findElement(By.xpath(".//button[1]/span[@class='ui-button-text']")).click();
		 	
		 	Thread.sleep(TIMEOUT);							
		
		driver.findElement(By.xpath(".//*[@id='menu']/li[3]/a")).click();
		Thread.sleep(TIMEOUT);
	}
	
}
