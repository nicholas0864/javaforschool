public class CompoundWord{
    private String firstWord = null;
    private String secondWord = null;

    public CompoundWord(String aFirstWord, String aSecondWord){
        firstWord = aFirstWord;
        secondWord = aSecondWord;
    }

    public String getFirstWord(){
        return firstWord;
    }
    
    public void setFirstWord(String aFirstWord){
        firstWord = aFirstWord;
    }

    public String getSecondWord(){
        return secondWord;
    }
    
    public void setSecondWord(String aSecondWord){
        secondWord = aSecondWord;
    }

    public int findTotalLength(){
        int length = firstWord.length() + secondWord.length();
        return length;
    }

    public void swapWords(){
        String temp = firstWord;
        firstWord = secondWord;
        secondWord = temp;
    }

    public String toString(){
        String output = firstWord + secondWord;
        return output;

    }
}