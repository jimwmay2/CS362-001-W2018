package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This my birthday party.", appt.getDescription());    
		 /* 
		 int[] recurDays = {4,7,10};
		 int recurBy = 3;
		 int recurIncrement = 12;
		 int recurNumber = 2;
		  * appt.setRecurrence( recurDays, recurBy, recurIncrement, recurNumber);
		 for(int i =0; i < recurDays.length;i++) {
			assertEquals(1,appt.getRecurDays()[i+1]); 
		 }
		 assertEquals(3,appt.getRecurBy());
		 assertEquals(12,appt.getRecurIncrement());
		 assertEquals(0,appt.getRecurNumber());*/
	 }

}


