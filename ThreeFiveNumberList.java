import java.util.ArrayList;
import java.util.List;

public class ThreeFiveNumberList{

	//Variables to define series range
	private final int m_start;
	private final int m_end;

	private final static String MULT_THREE = "MultThree";
	private final static String MULT_FIVE = "MultFive";
	
	
	/**
	 * main
	 */
	public static void main(String[] args) {
		try {
			//Class instantiation with range for series
			ThreeFiveNumberList series = new ThreeFiveNumberList(1, 100);
			
			//building the number series
			List<String> myList = series.buildList();
			
			//Printing the series
			for (String num : myList) {
				System.out.print(num + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ThreeFiveNumberList(int start, int end) throws Exception {
		if (start > end) {
			//Check for ascending number series range
			throw new Exception("Start value cannot be greater than end value");
		}
		if (start < 0) {
			//series start cannot be negative
			throw new Exception("Start value has to be positive");
		}

		m_start = start;
		m_end = end;
	}

	public List<String> buildList() {		
		List<String> seriesList = new ArrayList<String>();

		for (int i=m_start; i<=m_end; i++) {
			
			seriesList.add(buildItem(i));
			
		}
		return seriesList;
	}
	
	public String buildItem(int item) {
		
		int remThree = item % 3;
		int remFive = item % 5;

		if (remThree == 0 && remFive == 0) {	
			return (MULT_THREE+MULT_FIVE);
		}
		else if (remThree == 0) {
			return (MULT_THREE);
		}
		else if (remFive == 0) {
			return (MULT_FIVE);
		}
		else {
			return (Integer.toString(item));
		}
	}

}
