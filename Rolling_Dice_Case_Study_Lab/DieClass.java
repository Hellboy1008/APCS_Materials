public class DieClass
{
    public static void main (String args[]){
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());
        Die die1 = new Die();
        die1.roll();
        System.out.println(die1.getNumDots());
    }
}
