
public class SpacedLogger implements Logger {
	
	private String spaceOut(String stringToSpaceOut) {  //This method puts spaces between every character in a string
														//Just cause otherwise I'd have to write the same thing in each method
		
		StringBuilder spacedString = new StringBuilder(); //Instantiate a StringBuilder to hold the new, better, more cool, spaced out string
		
		for (int i = 0; i < stringToSpaceOut.length(); i++) {  // this for loop runs until the end of the argument string
			spacedString.append(stringToSpaceOut.charAt(i) + " "); // append character from argument string, add space after
		}
		
		return spacedString.toString(); //return fully built really dope string
		
	}

	@Override
	public void log(String info) { //this method logs info to the console, with a space in between each character
		
		System.out.println(spaceOut(info));
		
	}

	@Override
	public void error(String error) { // this method does the same thing as the log() method but adds "ERROR: " to the front of the error string
		
		System.out.println("ERROR: " + spaceOut(error));
		
	}

}
