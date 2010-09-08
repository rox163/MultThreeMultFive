import org.junit.* ;
import static org.junit.Assert.* ;

public class ThreeFiveNumberSeriesTest {

	@Test public void test_buildSeries() {		
		//Test if negative number exception is caught
		try {
			ThreeFiveNumberSeries S = new ThreeFiveNumberSeries(-1,100);
			S.buildSeries();
			assertFalse(" not caught!",true);
			
		} catch (Exception e) {
			assertTrue(true);
		}
		
		//Test if incorrect range exception is caught
		try {
			ThreeFiveNumberSeries S = new ThreeFiveNumberSeries(100,1);
			S.buildSeries();
			assertFalse("Incorrect range Exception not caught!",true);
			
		} catch (Exception e) {
			assertTrue(true);
		}
		
		//Test if any item in the list is correct
		try {
			ThreeFiveNumberSeries S = new ThreeFiveNumberSeries(1,100);
			assertTrue("Series build Failure!", (S.buildSeries().get(14).compareTo("MultThreeMultFive")==0));
			assertTrue("Series build Failure!", (S.buildSeries().get(29).compareTo("MultThreeMultFive")==0));
			assertTrue("Series build Failure!", (S.buildSeries().get(17).compareTo("MultThree")==0));
			assertTrue("Series build Failure!", (S.buildSeries().get(32).compareTo("MultThree")==0));
			assertTrue("Series build Failure!", (S.buildSeries().get(19).compareTo("MultFive")==0));
			assertTrue("Series build Failure!", (S.buildSeries().get(54).compareTo("MultFive")==0));
			assertTrue("Series build Failure!", (S.buildSeries().get(12).compareTo("13")==0));
			assertTrue("Series build Failure!", (S.buildSeries().get(66).compareTo("67")==0));
		} catch (Exception e) {
			assertTrue(true);
		}
		
		
	}
}
