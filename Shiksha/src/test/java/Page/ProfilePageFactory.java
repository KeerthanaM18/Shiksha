package Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProfilePageFactory {
	WebDriver driver;
	Robot robot;
	
//--------------------------------------LOGIN------------------------------------------------------------------------------
	
	@FindBy(xpath="//a[text()=\"Login\"]")
	WebElement login;
	
	@FindBy(xpath="//input[@placeholder=\"Email address\"]") 
	WebElement email;
	
	@FindBy(xpath="//input[@class=\"input password\"]") 
	WebElement password;
	
	@FindBy(xpath="//button[text()=\"Login\"]")
	WebElement submit;
	
	//UserProfile
	@FindBy(xpath="//strong[@class=\"gnbY21UserName\"]") 
	WebElement userprofile;
	
	@FindBy(xpath="//a[@href=\"/userprofile/edit\"]")
	WebElement profile;
	
	@FindBy(xpath="(//button[@class=\"custom-button custom-button--primary\"])[1]") 
	WebElement Marks;
	
//----------------------------------10th marks-------------------------------------------------------------------------- 
	
	@FindBy(xpath="(//div[@class=\"FieldWrapper\"]/div/input)[1]")
	WebElement Board;
	
	@FindBy(xpath="//ul[@class=\"_69be\"]/li[3]/span")
	WebElement Board1;
	
	@FindBy(xpath="(//div[@class=\"text-field\"])[2]//input")
	WebElement School;
	
	@FindBy(xpath="(//div[@class=\"text-field\"])[3]//input")
	WebElement passingyear;
	
	@FindBy(xpath="//ul[@class=\"_69be\"]/li[1]/span")
	WebElement passingyear1;
	
	@FindBy(xpath="(//div[@class=\"text-field\"])[4]//input")
	WebElement Grading;
	
	@FindBy(xpath="//ul[@class=\"_69be\"]/li[4]/span\r\n")
	WebElement Grading1;
	
	@FindBy(xpath="(//div[@class=\"text-field\"])[5]//input")
	WebElement score;
	
	@FindBy(xpath="//div[@class=\"_202e\"]/button[2]")
	WebElement Save;
	
//-------------------------------------------MBA--------------------------------------------------------------------------
	
	@FindBy(xpath="//ul[@class=\"nav\"]/li[1]/a[1]")
	WebElement mba;
	
	@FindBy(xpath="(//li[@key=\"Exams\"]/a[1])[1]")
	WebElement Exam;
	
	@FindBy(xpath="(//a[@href=\"/mba/cat-exam\"])[1]")
	WebElement cat;
	
	@FindBy(xpath="//i[@id=\"shrt_1653\"]")
	WebElement like;
	
	@FindBy(xpath="//div[@class=\"dialop-popup overlay-bg\"]/div/div[2]/div/div/p/p")
	WebElement textLike;
	
//-------------------------------------------CAT------------------------------------------------------------------------
	
	@FindBy(xpath="(//div[@class=\"share-box tooltip-sharing\"]/i)")
	WebElement share;
	
	@FindBy(xpath="//a[@href=\"https://www.facebook.com/sharer/sharer.php?u=https://www.shiksha.com/mba/cat-exam\"]")
	WebElement facebook;
	
	@FindBy(xpath="//a[@href=\"https://www.facebook.com/sharer/sharer.php?u=https://www.shiksha.com/mba/cat-exam\"]")
	WebElement text;
	
//-------------------------------------------ShikshaOnline---------------------------------------------------------------
	
	@FindBy(xpath="//ul[@class=\"nav\"]/li[8]/a[1]")
	WebElement Online;
	
	@FindBy(xpath="//a[@href=\"https://www.shiksha.com/online-courses/programming-courses-certification-training-st619\"]")
	WebElement program;
	
	@FindBy(xpath="//input[@name=\"keyword\"]")
	WebElement search;
	
	@FindBy(xpath="//span[@class=\"filter-tag\"]")
	WebElement filter;
	
	@FindBy(xpath="(//div[@class=\"collapseList\"]//span)[1]")
	WebElement programfilter;
	
	@FindBy(xpath="(//span[@class=\"box\"]/i)[1]")
	WebElement selfpaced;
	
	@FindBy(xpath="(//div[@class=\"collapseList\"]//span)[2]")
	WebElement level;
	
	@FindBy(xpath="(//span[@class=\"box\"]/i)[3]")
	WebElement begin;
	
	@FindBy(xpath="//span[@class=\"button-text apply-button-text\"]")
	WebElement applyfilter;
	
	@FindBy(xpath="(//span[@class=\"cta-button-container cta-button  \"])[1]")
	WebElement enquire;
	
	@FindBy(xpath="//div[@class=\"thank-you\"]")
	WebElement courseassert;
	
//---------------------------------------EducationINVALID---------------------------------------------------------------
	
	@FindBy(xpath="//strong[@class=\"gnbY21UserName\"]") 
	WebElement useredit;
	
	@FindBy(xpath="//a[@href=\"/userprofile/edit\"]")
	WebElement profileedit;
	
	@FindBy(xpath="(//div[@class=\"_04a0\"])[3]")
	WebElement eduedit;
	
	@FindBy(xpath="(//div[@class=\"_04a0\"])[4]")
	WebElement marksedit;
	
	@FindBy(xpath="(//div[@class=\"text-field\"]/input)[2]")
	WebElement SchoolName;
	
	@FindBy(xpath="(//button[@class=\"custom-button custom-button--primary\"])[10]")
	WebElement saveedit;
	
	@FindBy(xpath="(//button[@class=\"custom-button custom-button--primary\"])[8]")
	WebElement Done;
	
		public ProfilePageFactory (WebDriver driver)
		{
	    	this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    }
		public void ExplicitWait(WebElement webElement,int time){
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
				wait.until(ExpectedConditions.elementToBeClickable(webElement));
		 }
		
//--------------------------------------LOGIN---------------------------------------------------------------------------------------
		
		public void background() throws InterruptedException, AWTException
		{
			login.click();
			Thread.sleep(2000);
			email.sendKeys("keerthanamuniraj18@gmail.com");
			robot = new Robot();
			int xCoordinate = 500;
		    int yCoordinate = 500;
		    robot.mouseMove(xCoordinate, yCoordinate);
		    Thread.sleep(2000);
		    password.sendKeys("Keerthz_18");
			Thread.sleep(1000);
			submit.click();
			Thread.sleep(1000);
		}
	
//-----------------------------------10thMarks----------------------------------------------------------------------		
		
		public void Profile()
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", userprofile);
		}
		public void UserProfile() throws AWTException, InterruptedException 
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", profile);
			
			Robot r = new Robot();
			r.mouseMove(10, 500);
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(1000);
	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        js1.executeScript("arguments[0].scrollIntoView(true);",Marks);
	    	Marks.click();
	    	Thread.sleep(1000);
		}
		public void board()
		{
			Board.click();
			Board1.click();
		}
		public void school(String Scl) throws InterruptedException
		{
			Thread.sleep(1000);
			School.sendKeys(Scl);
		}
		public void year()
		{
			passingyear.click();
			passingyear1.click();
		}
		public void grade()
		{
			Grading.click();
			Grading1.click();	
		}
		public void scroll() {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scroll(0,200)");
		}
		public void Score(String Scr) throws InterruptedException {
			ExplicitWait(score,3);
			score.sendKeys(Scr);	
		}
		public void save()
		{
			Save.click();
			String exp="https://www.shiksha.com/userprofile/edit";
			Assert.assertEquals(exp,driver.getCurrentUrl() );
		}
		
//--------------------------------------------MBA-------------------------------------------------------------------------
		
		public void clickmba() 
		{
			Actions act = new Actions(driver);
			act.moveToElement(mba).build().perform();
		}
		public void exam() throws InterruptedException 
		{
			ExplicitWait(Exam,20);
			Actions act = new Actions(driver);
			act.moveToElement(Exam).build().perform();
		}
		public void CAT()
		{
			cat.click();
		}
		public void scrolldown() throws InterruptedException 
		{	
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,700)");
		}
		public void like() throws InterruptedException 
		{
			Thread.sleep(1000);
			like.click();
		}
		public boolean LikeAssert()
		{
			String expMg="The Master of Business Administration (MBA) has also been added to your shortlist.";
			String actMg=textLike.getText();
			if(expMg.equalsIgnoreCase(actMg)) 
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		
//--------------------------------------CAT--------------------------------------------------------------------------------------------
		
		public void CATshare()
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();",share);
		}
		public void shareoption() throws InterruptedException 
		{
			Thread.sleep(1000);
			facebook.click();
		}
		public String verify()
		{
			String msg=text.getText();
			return msg;
		}
		
//-------------------------------------ShikshaOnline----------------------------------------------------------------------------
		
		public void ShikshaOnline() 
		{
			Actions act = new Actions(driver);
			act.moveToElement(Online).build().perform();
		}
		public void Programming() 
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();",program);
		}
		public void Searching(String Search) throws AWTException, InterruptedException 
		{
			Thread.sleep(1000);
			search.sendKeys(Search);
			
			Robot r =new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);	
		}
		public void Filters() throws InterruptedException
		{
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,700)");
			filter.click();
		}
		public void ProgramFilter() throws InterruptedException
		{
			Thread.sleep(1000);
			programfilter.click();
		}
		public void Self() throws InterruptedException 
		{
			Thread.sleep(1000);
			selfpaced.click();
		}
		public void Level() throws InterruptedException 
		{
			Thread.sleep(1000);
			level.click();
		}
		public void Beginner() throws InterruptedException
		{
			Thread.sleep(1000);
			begin.click();
		}
		public void Applyfilter() throws InterruptedException
		{
			Thread.sleep(1000);
			applyfilter.click();
		}
		public void Enquire() throws InterruptedException
		{
			Thread.sleep(1000);
			enquire.click();
		}
		public boolean CourseAssert() {
			String expMg="Thank you for your Enquiry";
			String actMg=courseassert.getText();
			if(expMg.equalsIgnoreCase(actMg))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
//---------------------------------------EducationINVALID-----------------------------------------------------------------
		
		public void UserEdit() throws InterruptedException 
		{
			Thread.sleep(1000);
			useredit.click();
		}
		public void ProfileEdit() throws InterruptedException
		{
			Thread.sleep(1000);
			profileedit.click();
		}
		public void ProfileScroll() throws InterruptedException 
		{
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,900)");
		}
		public void Eduedit() 
		{
			eduedit.click();
		}
		public void Marksedit() throws InterruptedException
		{
			Thread.sleep(1000);
			marksedit.click();
		}
		String actual;
		public void Modify(String school2) throws InterruptedException, AWTException
		{
			Thread.sleep(1000);
			SchoolName.clear();
			actual = school2;
			SchoolName.sendKeys(actual);	
		}
		public void scrolledit() 
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scroll(0,200)");
		}
		public void SaveEdit()
		{
			saveedit.click();
		}
		String expected;
		public void compare(String school1) throws InterruptedException
		{
			expected = school1;
		}
		public void DoneEdit() throws InterruptedException 
		{
			
			Assert.assertEquals(expected,actual);
			Thread.sleep(1000);
			Done.click();	
		}	
}		

