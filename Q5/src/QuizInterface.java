// Q5 Interface File
// Author: Chris Wilcox
// Date:   11/29/2015
// Class:  CS160
// Email:  wilcox@cs.colostate.edu

public interface QuizInterface {

    // Returns an encoded version of the specified string,
    // which can contain any ASCII character.
    // The encoding algorithm adds 1 to the ASCII value of
    // each character.
    // For example, "abcde01234" returns "bcdef12345".
    public String EncodeString(String s);

    // Returns a decoded version of the specified string,
    // which can contain any ASCII character.
    // The encoding algorithm subtracts 1 from the ASCII value of
    // each character.
    // For example, "bcdef12345" returns "abcde01234".
    public String DecodeString(String s);

    // Returns an array of integers, with the sum of the ASCII
    // values in each string in the array passed in.
    // For example, {"Java", "Programming", "rocks!"} returns {386, 1155, 579}
    public int[] sumAscii(String[] sArray);

    // Modifies the array by multiplying each element by 4.0.
    // For example, changes {2.0, 3.0, 4.0} to {8.0, 12.0, 16.0}
    public void quadrupleArray(double[] dArray);

    // Writes a file with the specified name and contents.
    public void writeFile(String filename, String[] contents);
}
