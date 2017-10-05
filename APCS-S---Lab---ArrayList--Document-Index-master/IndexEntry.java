import java.util.*;

public class IndexEntry
{
    private String word;
    private ArrayList<Integer> numsList;

    public IndexEntry (String a){
        this.word = a.toUpperCase(); 
        ArrayList<Integer> numsList = new ArrayList<Integer>();
    }

    public void add (int num){
        if (numsList.contains(num) == false){
            numsList.add(num);
        }
    }

    public String getWord(){
        return word;
    }

    public String toString(){
        String numbers = numsList.toString();
        numbers = numbers.replace('[',' ');
        numbers = numbers.replace(']',' ');
        return word + numbers;
    }
}
