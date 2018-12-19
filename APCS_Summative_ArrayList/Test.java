import java.util.*;

public class Test
{
    public static void main (String args[]){
        ArrayList<Integer> getnum = new ArrayList<Integer>();
        getnum.add(1);
        getnum.add(2);
        getnum.add(14);
        String line = getnum.toString();
        line = line.replace('[',' ');
        line = line.replace(']',' ');
        System.out.println("A" + line);
    }
}
