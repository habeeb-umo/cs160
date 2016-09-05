// Final Programming Quiz (Interface File)
// Author: Chris Wilcox
// Date:   12/6/2015
// Class:  CS160
// Email:  wilcox@cs.colostate.edu

public interface QuizInterface {

	// Interface Methods
	
	// Reads file tokens into an array of strings
	public void readFile(String filename);

	// Counts frequency of character in array of strings
	public int charFrequency(String []strings, char match);

	// Initializes an array of cubed values
	public void initializeArray(double values[]);
	
	// Sum values within a range of indices in an array
	public double sumRange(double values[], int low, int high);
}

