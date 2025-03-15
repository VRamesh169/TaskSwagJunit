package org.runner;

import org.execute.TC01_Browser_LoginPage;
import org.execute.TC02_LogOutPage;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TC01_Browser_LoginPage.class,
	           TC02_LogOutPage.class
	
})
public class SuiteClass {

}
