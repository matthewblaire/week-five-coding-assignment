
public class AsteriskLogger implements Logger {

	private String makeTopAndBottomOfAsteriskBox(int lengthOfErrorString) { // This method returns a string of asterisks that we will use to form our error box
		
		StringBuilder fullString = new StringBuilder(); // instantiate StringBuilder that will eventually hold the top/bottom of asterisk box
		
		for (int i = 0; i < lengthOfErrorString; i++) { // this for loop creates a StringBuilder that has as many asterisks as lengthOfErrorString
			fullString.append("*");
		}
		
		return fullString.toString(); 
	}
	
	@Override
	public void log(String info) { // This method logs info to the console, with "***" preceding and following the info

		System.out.println("***" + info + "***"); // this one is obvious
		
	}

	@Override
	public void error(String error) { // This method logs an error to console inside of a box of asterisks. Instantiates a StringBuilder to hold
									  // The error string, preceded and followed by "***", then creates strings of asterisks that will become
									  // the top and bottom of our box, changing according to the size of the full error string in the middle.
		
		StringBuilder fullErrorString = new StringBuilder("***ERROR: "); // instantiate StringBuilder to hold middle of box, starting with left side
		fullErrorString.append(error + "***"); // append the error info and the right side of the box
		String topAndBottom = makeTopAndBottomOfAsteriskBox(fullErrorString.length());
		
		System.out.println(topAndBottom); // build top of asterisk box
		System.out.println(fullErrorString.toString()); // middle of box, with error info
		System.out.println(topAndBottom); // build bottom of box
		
		
		
	}

}
