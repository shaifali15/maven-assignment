public class StringManipulation {
    //Creating function to find length of the string
    public int getStringLength(String InitialString) {
        int length = 0;
        for (char c : InitialString.toCharArray()) {
            length++;
        }
        return length;
    }

    //creating function to print reversed string
    public String reverseString(String InitialString) {
        //storing string into temporary array
        char temporaryArray[] = InitialString.toCharArray();
        String ReverseOfString = "";
        for (int index = getStringLength(InitialString)- 1; index >= 0; index--) {
            ReverseOfString += temporaryArray[index];
        }
        return ReverseOfString;
    }
}
