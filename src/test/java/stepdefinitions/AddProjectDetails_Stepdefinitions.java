package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import common.Wrapper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.TestRunner;

public class AddProjectDetails_Stepdefinitions extends TestRunner {
	
	public static WebDriver driver;
	
	@Given("^User should have launched the application$")
	public void user_should_have_launched_the_application() throws Throwable {
		
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	 driver=new ChromeDriver();
	 String url="http://elearningm1.upskills.in/";
	 driver.get(url);
	 driver.manage().window().maximize();

	}

	@Given("^User should get logged in as Teacher$")
	public void user_should_get_logged_in_as_Teacher() throws Throwable {
		
		driver.findElement(By.id("login")).sendKeys("testteacher2");
		driver.findElement(By.id("password")).sendKeys("teacher");
		driver.findElement(By.id("form-login_submitAuth")).click();

	}

	@Given("^teacher has created course$")
	public void teacher_has_created_course() throws Throwable {
		driver.findElement(By.linkText("My courses")).click();
		driver.findElement(By.className("thumbnail")).click();
	}

	@When("^click on Project icon$")
	public void click_on_Project_icon() throws Throwable {
		driver.findElement(By.xpath("//img[@title='Projects']")).click();

	}

	@When("^click on create a new project icon$")
	public void click_on_create_a_new_project_icon() throws Throwable {
		driver.findElement(By.xpath("//img[@title='Create a new project']")).click();
	}

	@When("^enter valid credential in title text box \"([^\"]*)\"$")
	public void enter_valid_credential_in_title_text_box(String arg1) throws Throwable {
		driver.findElement(By.id("add_blog_blog_name")).sendKeys(arg1);

	}
	
	@When("^enter valid credential in title text box$")
	public void enter_valid_credential_in_title_text_box() throws Throwable {
		driver.findElement(By.id("add_blog_blog_name")).sendKeys(Wrapper.getDateFromExcel(1,0));

	}

	@When("^enter valid credential in sub title text box \"([^\"]*)\"$")
	public void enter_valid_credential_in_sub_title_text_box(String arg1) throws Throwable {
		driver.findElement(By.id("add_blog_blog_subtitle")).sendKeys(arg1);
	}
	

	@When("^enter valid credential in sub title text box$")
	public void enter_valid_credential_in_sub_title_text_box() throws Throwable {
		driver.findElement(By.id("add_blog_blog_subtitle")).sendKeys(Wrapper.getDateFromExcel(1,1));
	}

	@When("^click on save blog button$")
	public void click_on_save_blog_button() throws Throwable {
		driver.findElement(By.id("add_blog_submit")).click();
		assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText(),"The project has been added.","Project is not added");
	}

	@When("^click on project link$")
	public void click_on_project_link() throws Throwable {
       driver.findElement(By.xpath("//a[contains(text(),'learning')]")).click();
	}

	@When("^click on new task icon$")
	public void click_on_new_task_icon() throws Throwable {
	   driver.findElement(By.xpath("//img[@title='New task']")).click();
	}
	
	@When("^enter valid title in title text box \"([^\"]*)\"$")
	public void enter_valid_title_in_title_text_box(String arg1) throws Throwable {
		driver.findElement(By.id("add_post_title")).sendKeys(arg1);
	}
	
	@When("^enter valid title in title text box$")
	public void enter_valid_title_in_title_text_box() throws Throwable {
		driver.findElement(By.id("add_post_title")).sendKeys(Wrapper.getDateFromExcel(1,2));
	}

	@When("^click on save button$")
	public void click_on_save_button() throws Throwable {
		driver.findElement(By.id("add_post_save")).click();
	//	Thread.sleep(20000);
		//assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText(),"The article has been added.","Task is not added");
	}

	@When("^click on Role management icon$")
	public void click_on_Role_management_icon() throws Throwable {
		 driver.findElement(By.xpath("//img[@title='Roles management']")).click();
	}

	@When("^click on add a new role icon$")
	public void click_on_add_a_new_role_icon() throws Throwable {
		driver.findElement(By.xpath("//img[@title='Add a new role']")).click();
	}
	
	@When("^enter valid role in title text box \"([^\"]*)\"$")
	public void enter_valid_role_in_title_text_box(String arg1) throws Throwable {
		driver.findElement(By.name("task_name")).sendKeys(arg1);
	}
	
	@When("^enter valid role in title text box$")
	public void enter_valid_role_in_title_text_box() throws Throwable {
		driver.findElement(By.name("task_name")).sendKeys(Wrapper.getDateFromExcel(1,3));
	}
	
	@When("^click on save button for Role$")
	public void click_on_save_button_for_Role() throws Throwable {
		driver.findElement(By.name("Submit")).click();
		assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText(),"The task has been created","Task is not created");
	}

	@When("^click on Assign role icon$")
	public void click_on_Assign_role_icon() throws Throwable {
		driver.findElement(By.xpath("//img[@title='Assign roles']")).click();
	}

	@When("^select student / teacher name in user list box \"([^\"]*)\"$")
	public void select_student_teacher_name_in_user_list_box(String arg1) throws Throwable {
     Select userDropDown= new Select(driver.findElement(By.id("assign_task_task_user_id")));
     userDropDown.selectByVisibleText(arg1);	
	}
	
	@When("^select student / teacher name in user list box$")
	public void select_student_teacher_name_in_user_list_box() throws Throwable {
     Select userDropDown= new Select(driver.findElement(By.id("assign_task_task_user_id")));
     userDropDown.selectByVisibleText(Wrapper.getDateFromExcel(1,4));	
	}

	@When("^click on validate button$")
	public void click_on_validate_button() throws Throwable {
		driver.findElement(By.id("assign_task_submit")).click();
		assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText(),"The task has been assigned.","Task is not assigned");	
	}

	@When("^click on user management icon$")
	public void click_on_user_management_icon() throws Throwable {
		driver.findElement(By.xpath("//img[@title='Users management']")).click();
	}

	@When("^click on checkbox beside the user$")
	public void click_on_checkbox_beside_the_user() throws Throwable {
		driver.findElement(By.xpath("//input[@value='1280']")).click();
	}

	@When("^click on register button$")
	public void click_on_register_button() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Register']")).click();
	}

	@Then("^The user has been registered message should get displayed$")
	public void the_user_has_been_registered_message_should_get_displayed() throws Throwable {
		assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText(),"The user has been registered","User is not registered");			
		
	}

}
