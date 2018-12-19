public class Die
{
    private int numDots; 
    
    public void roll(){
        numDots = (int)((Math.random()*6)+1);
    }

    public int getNumDots(){
        return this.numDots;
    }   
    
}
