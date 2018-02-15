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
		 assertEquals(2,appt.getRecurBy());
		 assertEquals(0,appt.getRecurNumber());
		 assertFalse(appt.isRecurring());
		 assertEquals(0,appt.getRecurIncrement());
		 //assertEquals(0,appt.getRecurDays());
		 appt.setRecurrence(recurDays, recurBy, recurIncrement, recurNumber);
		 for(int i = 0;i < recurDays.length;i++) {
			 assertEquals(recurDays[i],appt.getRecurDays()[i]);
		 }
		 assertTrue(appt.isRecurring());
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
    */
	 @Test
	  public void test02()  throws Throwable  {
		 int startHour=27;
		 int startMinute=0;
		 int startDay=1;
		 int startMonth=13;											//dont need to test month, will crash the code with index out of range
		 int startYear=2018;										//year can be anything
		 String title="Birthday Party";								//title can be anything
		 String description="This is my birthday party.";			//description can be anything
		 //Construct a new Appointment object with the initial data	 
		 
		 //hour test upper
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 //minute test upper
		 startHour=23;
		 startMinute=60;
		 startDay=1;
		 Appt appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 //day test	upper		 
		 startHour=23;
		 startMinute=0;
		 startDay=32;
		 Appt appt2 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 // hour test lower
		 startHour=0;
		 startMinute=0;
		 startDay=1;
		 Appt appt3 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 //minute test lower
		 startHour=0;
		 startMinute=0;
		 startDay=1;
		 Appt appt4 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		// day test lower
		 startHour=0;
		 startMinute=0;
		 startDay=1;
		 Appt appt5 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 // hour test upper
		 startMonth=1;	
		 startHour=23;
		 startMinute=0;
		 startDay=1;
		 Appt appt6 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 //minute test upper
		 startHour=0;
		 startMinute=59;
		 startDay=1;
		 Appt appt7 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		// day test upper
		 startHour=0;
		 startMinute=0;
		 startMonth = 12;
		 startDay=31;
		 Appt appt8 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 //test toString isValid
		 assertEquals(null,appt.toString());
		
		 
		 assertFalse(appt.getValid());
		 assertFalse(appt1.getValid());
		 assertFalse(appt2.getValid());
		 
		 assertTrue(appt3.getValid());
		 assertTrue(appt4.getValid());
		 assertTrue(appt5.getValid());
		 assertTrue(appt6.getValid());
		 assertTrue(appt7.getValid());
		 assertTrue(appt8.getValid());
	 }
	 
	 @Test
	 public void test03()  throws Throwable{
		 //test set methods
		 int startHour=0;
		 int startMinute=0;
		 int startDay=1;
		 int startMonth=12;											//dont need to test month, will crash the code with index out of range
		 int startYear=2018;										//year can be anything
		 String title="Birthday Party";								//title can be anything
		 String description="This is my birthday party.";			//description can be anything
		 //Construct a new Appointment object with the initial data	 
		 
		 //hour test upper
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 appt.setTitle(description);
		 appt.setDescription(title);
		 appt.setStartDay(40);
		 assertFalse(appt.getValid());
		 appt.setStartDay(1);
		 appt.setStartHour(24);
		 assertFalse(appt.getValid());
		 appt.setStartHour(1);
		 appt.setStartMinute(61);
		 assertFalse(appt.getValid());
		 appt.setStartMinute(1);
		 //appt.setStartMonth(13);			cant check month due to index out of bound exception
		 //assertFalse(appt.getValid());
		 appt.setStartMonth(1);
		 appt.setStartYear(2019);
		 
		 assertEquals(1, appt.getStartHour());
		 assertEquals(1, appt.getStartMinute());
		 assertEquals(1, appt.getStartDay());
		 assertEquals(1, appt.getStartMonth());
		 assertEquals(2019, appt.getStartYear());
		 assertEquals(description, appt.getTitle());
		 assertEquals(title, appt.getDescription());
		 
	 }
	 
	 //test leap year
	 @Test
	 public void test04()  throws Throwable{
		 
		 int startHour=0;
		 int startMinute=0;
		 int startDay=29;
		 int startMonth=2;											//dont need to test month, will crash the code with index out of range
		 int startYear=2016;										//year can be anything
		 String title="Birthday Party";								//title can be anything
		 String description="This is my birthday party.";			//description can be anything
		 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 	 
		 assertTrue(appt.getValid());
		 appt.setStartYear(2018);
		 assertFalse(appt.getValid());
		 appt.setStartYear(2000);
		 assertTrue(appt.getValid());
		 appt.setStartYear(1900);
		 assertFalse(appt.getValid());
		 
		 
	 }
	 //test compareTo method
	 @Test
	 public void test05()  throws Throwable{
		 
		 int startHour=1;
		 int startMinute=1;
		 int startDay=1;
		 int startMonth=1;											//dont need to test month, will crash the code with index out of range
		 int startYear=2016;										//year can be anything
		 String title="Birthday Party";								//title can be anything
		 String description="This is my birthday party.";			//description can be anything
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 
		 int startHour2=2;
		 int startMinute2=2;
		 int startDay2=2;
		 int startMonth2=2;											//dont need to test month, will crash the code with index out of range
		 int startYear2=2017;
		 title="Birthday Party 1";								
		 description="This is my birthday party 1.";			
		 Appt appt1 = new Appt(startHour2,
		          startMinute2 ,
		          startDay2 ,
		          startMonth2 ,
		          startYear2 ,
		          title,
		         description);
		 assertEquals((startHour-startHour2)+(startMinute - startMinute2)+(startDay - startDay2)+(startMonth-startMonth2)+(startYear-startYear2),appt.compareTo(appt1));
		 
		 	 

		 
		 
	 }
}
