package frm.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * This class runs multiple Junit test 
 * classes together.
 * @author admin
 * @since May 2, 2015.
 */
@RunWith(Suite.class)
@SuiteClasses({JunitTests1.class, JunitTests.class})
public class AllTests {

	
	
}
