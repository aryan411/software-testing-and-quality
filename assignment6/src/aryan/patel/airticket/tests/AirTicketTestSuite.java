package aryan.patel.airticket.tests;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({SeatingPlanTest.class,TicketTest.class,SellTicketTest.class})
public class AirTicketTestSuite {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
