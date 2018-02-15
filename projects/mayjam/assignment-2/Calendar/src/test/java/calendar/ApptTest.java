package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * 
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
		 assertEquals(startHour, appt.getStartHour());
		 assertEquals(startMinute, appt.getStartMinute());
		 assertEquals(startDay, appt.getStartDay());
		 assertEquals(startMonth, appt.getStartMonth());
		 assertEquals(startYear, appt.getStartYear());
		 assertEquals(title, appt.getTitle());
		 assertEquals(description, appt.getDescription());    
		 int[] recurDays = {3,4,5};
		 int recurBy = 2;
		 int recurIncrement = 6;
		 int recurNumber = 7;
		 appt.setRecurrence(recurDays, recurBy, recurIncrement, recurNumber);
		 for(int i = 0;i < recurDays.length;i++) {
			 assertEquals(recurDays[i],appt.getRecurDays()[i]);
		 }
		 assertEquals(recurBy,appt.getRecurBy());
		 assertEquals(recurIncrement,appt.getRecurIncrement());
		 assertEquals(recurNumber,appt.getRecurNumber());
		 
		 String daytime = "am";
		 if(startHour > 12 ) {
			 daytime = "pm";
			 startHour -=12;
		 }
		 //test toString method
		 assertEquals("\t" + startMonth + "/" + startDay + "/" + startYear + " at " + startHour + ":" + startMinute + daytime + " ," + title + ", " + description +"\n",appt.toString());
	 }

	 
	/**
	 * Test that the isValid method works as expected.
    
	 @Test
	  public void test02()  throws Throwable  {
		 int startHour=27;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;											//dont need to test month, will crash the code with index out of range
		 int startYear=2018;										//year can be anything
		 String title="Birthday Party";								//title can be anything
		 String description="This is my birthday party.";			//description can be anything
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 startHour=23;
		 startMinute=61;
		 startDay=1;
		  
		 Appt appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 startHour=23;
		 startMinute=0;
		 startDay=0;
		 		  
		 Appt appt2 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 startHour=23;
		 startMinute=0;
		 startDay=1;
		 
		 assertFalse(appt.getValid());
		 assertFalse(appt1.getValid());
		 assertFalse(appt2.getValid());
	 }
*/


}
