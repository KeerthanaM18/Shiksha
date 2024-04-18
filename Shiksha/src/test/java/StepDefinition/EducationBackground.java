package StepDefinition;

import java.awt.AWTException;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import DriverSetup.SetupDriver;
import Page.ProfilePageFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EducationBackground {
	 WebDriver driver;
	ProfilePageFactory lp;

	@Given("User is logged in and click on profile")
	public void user_is_logged_in_and_click_on_profile() throws InterruptedException, AWTException 
	{
		driver = SetupDriver.chromedriver();
		   lp=new ProfilePageFactory(driver);
	       lp.background(); 
	}
//--------------------------------------10thMarks-----------------------------------------------------------------------
	
	@When("user click on user profile")
	public void user_click_on_user_profile() throws AWTException, InterruptedException 
	{
	   lp.UserProfile();
	}
	@And("user click on profile")
	public void user_click_on_profile() 
	{
	    lp.Profile();
	}
	@And("user click on add 10th mark sheet")
	public void user_click_on_add_10th_mark_sheet() 
	{
	 
	}
	@And("user selects from dropdown Board")
	public void user_selects_from_dropdown_board() 
	{
	   lp.board(); 
	}
	@And("^Fill the school details (.*)")
	public void fill_the_school_details(String School) throws InterruptedException 
	{
		lp.school(School);
	}
	@And("User selects from dropdown Passing Out Year")
	public void user_selects_from_dropdown_passing_out_year()
	{
		lp.year();   
	}
	@And("User selects from dropdown grading system")
	public void user_selects_from_dropdown_grading_system()
	{
		lp.grade();
	}
	@And("^Fill the score details (.*)")
	public void fill_the_score_details(String score) throws InterruptedException 
	{
		lp.scroll();
		lp.Score(score);
    }
	@Then("click on save")
	public void click_on_save()
	{
	    lp.save();
	    
	}
	
	//@AfterStep
	//public static void takeScreendown(Scenario scenerio) 
	//{
	//	   TakesScreenshot ts= (TakesScreenshot) driver;
	//	   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	//	   scenerio.attach(src, "image/png",scenerio.getName());
	//}
	
//-------------------------------------MBA-------------------------------------------------------------------------------
	
	@When("user click on MBA option")
	public void user_click_on_mba_option() 
	{
		lp.clickmba();
	}
	@And("User clicks on Exam")
	public void user_clicks_on_exam() throws InterruptedException 
	{
		lp.exam();
	}
	@And("User clicks on CAT")
	public void user_clicks_on_cat()
	{
		lp.CAT();
	}
	@And("scroll down")
	public void scroll_down() throws InterruptedException 
	{
		lp.scrolldown();
	}
	@And("click on Like button")
	public void click_on_like_button() throws InterruptedException 
	{
		lp.like();
	}
	@Then("Course shortlisted successfully")
	public void course_shortlisted_successfully() throws InterruptedException 
	{	Thread.sleep(1000);
		Assert.assertTrue(lp.LikeAssert());
	}
	
	//@AfterStep
	//public static void takeScreendown(Scenario scenerio) 
	//{
	//	   TakesScreenshot ts= (TakesScreenshot) driver;
	//	   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	//	   scenerio.attach(src, "image/png",scenerio.getName());
	//}
	
//-----------------------------------------CAT-----------------------------------------------------

	@When("User clicks on Mba")
	public void user_clicks_on_mba() 
	{
		lp.clickmba();
	}
	@And("user selects exam")
	public void user_selects_exam() throws InterruptedException
	{
		lp.exam(); 
	}
	@And("user selects cat")
	public void user_selects_cat()
	{
		lp.CAT(); 
	}
	@And("user clicks on share")
	public void user_clicks_on_share() throws InterruptedException 
	{
		Thread.sleep(1000);
		lp.CATshare();
		lp.shareoption();
	}
	@Then("redirects to share option")
	public void redirects_to_share_option() 
	{
		String exp="https://www.shiksha.com/mba/cat-exam";
		Assert.assertEquals(exp,driver.getCurrentUrl() );
	}
	
	//@AfterStep
	//public static void takeScreendown(Scenario scenerio) 
	//{
	//	   TakesScreenshot ts= (TakesScreenshot) driver;
	//	   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	//	   scenerio.attach(src, "image/png",scenerio.getName());
	//}
	
//---------------------------------------ShikshaOnline----------------------------------------------------------------
	
	@When("User clicks on ShikshaOnline")
	public void user_clicks_on_shiksha_online()
	{
		lp.ShikshaOnline();
	}
	@And("User selects Programming")
	public void user_selects_programming()
	{
		lp.Programming();
	}
	@And("User enters a course")
	public void user_enters_a_course(DataTable course) throws AWTException, InterruptedException
	{
		List<List<String>> cells=course.cells();
		lp.Searching(cells.get(0).get(0));
	}
	@And("User clicks on All filters")
	public void user_clicks_on_all_filters() throws InterruptedException 
	{
		lp.Filters();
	}
	@And("User apply filter for program")
	public void user_apply_filter_for_program() throws InterruptedException 
	{
		lp.ProgramFilter();
		lp.Self();
	}
	@And("User apply filter for level")
	public void user_apply_filter_for_level() throws InterruptedException
	{
		lp.Level();
		lp.Beginner();
		lp.Applyfilter();
	}
	@And("clicks on Enquire option")
	public void clicks_on_enquire_option() throws InterruptedException 
	{
		lp.Enquire();
	}
	@Then("course details sent on mail")
	public void course_details_sent_on_mail() throws InterruptedException 
	{
		Thread.sleep(3000);
		Assert.assertTrue(lp.CourseAssert());
	}
	
//	@AfterStep
//	 static void takeScreendown(Scenario scenerio) 
//	{
//	   TakesScreenshot ts= (TakesScreenshot) driver;
//	   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//	   scenerio.attach(src, "image/png",scenerio.getName());
//	}
	
//--------------------------------EducationINVALID------------------------------------------------------------------------
	
	@When("User clicks on UserProfile")
	public void user_clicks_on_user_profile() throws InterruptedException 
	{
		lp.UserEdit();
	}
	@And("User clicks on Profile")
	public void user_clicks_on_profile() throws InterruptedException 
	{
		lp.ProfileEdit();
	}
	@And("User scroll down")
	public void user_scroll_down() throws InterruptedException 
	{
		lp.ProfileScroll();
	}
	@And("User clicks on Education Background")
	public void user_clicks_on_education_background() 
	{
		lp.Eduedit(); 
	}
	@And("User clicks on 10th marks edit")
	public void user_clicks_on_10th_marks_edit() throws InterruptedException
	{
		lp.Marksedit();
	}
	@And("^user enters (.*)$")
	public void user_enters(String School1) throws InterruptedException, AWTException 
	{  
		lp.Modify(School1); 
	}
	@And("User clicks on save")
	public void user_clicks_on_save() 
	{
		lp.scrolledit();
		lp.SaveEdit();
	}
	@And("user enters (.*)")
	public void user_enters_christ_king_public_school(String School1) throws InterruptedException 
	{
	 lp.compare(School1);  
	}
	@Then("click on Done")
	public void click_on_done() throws InterruptedException 
	{
		lp.DoneEdit();

		String exp="https://www.shiksha.com/userprofile/edit";
		Assert.assertEquals(exp,driver.getCurrentUrl() );
	}
	
	
//	@AfterStep
//	public void takeScreendown(Scenario scenerio) 
//	{
//	   TakesScreenshot ts= (TakesScreenshot) driver;
//	   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//	   scenerio.attach(src,"image/png",scenerio.getName());
//	}
}

