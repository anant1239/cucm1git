package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//login.feature is a cucumber class  to run the cucumber class we can use annotation called Runwith
//this run with it will help us to understand what class we are running
@RunWith(Cucumber.class)
//it does not know where my cucmber class //path is not avaliable
@CucumberOptions(features={"C:\\Users\\Forza Ferrari\\eclipse-workspace\\cucm\\src\\test\\resources\\login\\login.feature"}
,glue= {"stepdefintion"},
dryRun=false,//now this will execute login.feature file
tags="@PositiveTest",
plugin= {"html:testoutput/anant123.html","junit:testoutput/anant12.html","json:testoutput/Anant1.json"})


public class testrunner
{
	
}
