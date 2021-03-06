package stepDefinations;

/*import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
    @Given("^User is on NetBanking landing page$")
    public void user_is_on_NetBanking_landing_page(){
        //user navigate to netbanking page
    }
    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password(){

    }
    @Then("^Home page is populated$")
    public void home_page_is_populated(){

    }
    @And("^Cards are displayed$")
    public void cards_are_displayed(){

    }
}*/

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("navigated to login page");


    }

   /* @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        System.out.println("navigated to login page with username and password");

    }*/
   @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
   public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
       System.out.println("navigated to login page with username "+strArg1+" and password " + strArg2);
   }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("navigated to home page");

    }

    /*@And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        System.out.println("cards displayed");
    }*/
    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
        System.out.println("cards displayed are "+strArg1);
    }

}

