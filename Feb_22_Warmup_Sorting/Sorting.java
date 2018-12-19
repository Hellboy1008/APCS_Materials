public class Sorting
{
    public static void main (String args[]){
        int[] examplearray = {1,2,4,3,5,8,7,9,6};
        System.out.println("Selection Sort -> ");
        long start = System.nanoTime(); 
        Selectionsort(examplearray);
        long elapsedTime = System.nanoTime() - start;
        System.out.println("Time Taken: " + elapsedTime + "nanoseconds");

    }

    public static int[] Selectionsort(int[] arrays){
        int[] copy = new int[arrays.length];
        copy = arrays;
        int x2 = 0;
        for (int i = 0; i < arrays.length; i++){
            int x = i; 
            int min = arrays[i];
            int x1 = 0;
            for (int j = i+1; j < arrays.length; j++){
                if (arrays[j] < min){
                    x = j;
                    x1 +=1;
                }
            }
            if (x1 != 0){
                x2 += 1;
            }
            arrays[i] = arrays[x];
            arrays[x] = min;
        }
        
        System.out.println("Number of times sorted: " + x2);
        return arrays;
    }
}
