package runner_script;

import org.testng.annotations.Test;

import generic.Generic;
import pom_Script.POM;

public class TestCase extends Generic
{
	@Test
	public void login()
	{
		POM p = new POM(driver);
		p.entrusn("Admin");
		p.entrpsw("Psw");
		p.clkbtn();
		System.out.println("This testcase will be executed after method");
		System.out.println("This is modified test case by vidhi");
	}

}
