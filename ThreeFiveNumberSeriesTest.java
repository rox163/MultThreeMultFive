import org.junit.* ;
import static org.junit.Assert.* ;

public class ThreeFiveNumberSeriesTest {

	@Test public void test_negative() throws Exception{		
		//Test if negative number exception is caught
	
		ThreeFiveNumberSeries S = new ThreeFiveNumberSeries(-1,100);
		S.buildSeries();

	}
	
	@Test public void test_range() throws Exception{
		
		//Test if incorrect range exception is caught
		ThreeFiveNumberSeries S = new ThreeFiveNumberSeries(100,1);
		S.buildSeries();
			
	}
	
	@Test public void test_series() throws Exception{
		
		//Test if any item in the list is correct
		ThreeFiveNumberSeries S = new ThreeFiveNumberSeries(1,100);
		assertTrue("Series build Failure!", (S.buildSeries().get(14).compareTo("MultThreeMultFive")==0));
		assertTrue("Series build Failure!", (S.buildSeries().get(29).compareTo("MultThreeMultFive")==0));
		assertTrue("Series build Failure!", (S.buildSeries().get(17).compareTo("MultThree")==0));
		assertTrue("Series build Failure!", (S.buildSeries().get(32).compareTo("MultThree")==0));
		assertTrue("Series build Failure!", (S.buildSeries().get(19).compareTo("MultFive")==0));
		assertTrue("Series build Failure!", (S.buildSeries().get(54).compareTo("MultFive")==0));
		assertTrue("Series build Failure!", (S.buildSeries().get(12).compareTo("13")==0));
		assertTrue("Series build Failure!", (S.buildSeries().get(66).compareTo("67")==0));
	
	}
}
