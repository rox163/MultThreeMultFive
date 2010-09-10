import org.junit.* ;
import static org.junit.Assert.* ;

public class ThreeFiveNumberListTest {

	@Test public void test_negative() throws Exception{		
		//Test if negative number exception is caught
	
		ThreeFiveNumberList L = new ThreeFiveNumberList(-1,100);
		L.buildList();

	}
	
	@Test public void test_range() throws Exception{
		
		//Test if incorrect range exception is caught
		ThreeFiveNumberList L = new ThreeFiveNumberList(100,1);
		L.buildList();
			
	}
	
	@Test public void test_item() throws Exception {
		
		ThreeFiveNumberList L = new ThreeFiveNumberList(5, 500);
		assertTrue("Item build fail!",(L.buildItem(322)).compareTo("322") == 0);
		
	}
	
	@Test public void test_list() throws Exception{
		
		//Test if any item in the list is correct
		ThreeFiveNumberList L = new ThreeFiveNumberList(1,100);
		assertTrue("Series build Failure!", (L.buildList().get(14).compareTo("MultThreeMultFive") == 0));
		assertTrue("Series build Failure!", (L.buildList().get(29).compareTo("MultThreeMultFive") == 0));
		assertTrue("Series build Failure!", (L.buildList().get(17).compareTo("MultThree") == 0));
		assertTrue("Series build Failure!", (L.buildList().get(32).compareTo("MultThree") == 0));
		assertTrue("Series build Failure!", (L.buildList().get(19).compareTo("MultFive") == 0));
		assertTrue("Series build Failure!", (L.buildList().get(54).compareTo("MultFive") == 0));
		assertTrue("Series build Failure!", (L.buildList().get(12).compareTo("13") == 0));
		assertTrue("Series build Failure!", (L.buildList().get(66).compareTo("67") == 0));
	
	}
}
