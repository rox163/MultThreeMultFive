import java.util.ArrayList;
import java.util.List;

public class ThreeFiveNumberSeries {

	//Variables to define series range
	private final int m_start;
	private final int m_end;

	private final static String MULT_THREE = "MultThree";
	private final static String MULT_FIVE = "MultFive";
	
	private static int m_remThree;
	private static int m_remFive;
	
	/**
	 * main
	 */
	public static void main(String[] args) {
		try {
			//Class instantiation with range for series
			ThreeFiveNumberSeries series = new ThreeFiveNumberSeries(1, 100);
			
			//building the number series
			List<String> mySeries = series.buildSeries();
			
			//Printing the series
			for (String num : mySeries) {
				System.out.print(num + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ThreeFiveNumberSeries(int start, int end) throws Exception {
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

	public List<String> buildSeries() {		
		List<String> seriesList = new ArrayList<String>();

		for (int i=m_start; i<=m_end; i++) {
			m_remThree = i % 3;
			m_remFive = i % 5;

			if (m_remThree == 0 && m_remFive == 0) {	
				seriesList.add(MULT_THREE+MULT_FIVE);
			}
			else if (m_remThree == 0) {
				seriesList.add(MULT_THREE);
			}
			else if (m_remFive == 0) {
				seriesList.add(MULT_FIVE);
			}
			else {
				seriesList.add(Integer.toString(i));
			}
		}
		return seriesList;
	}

}
