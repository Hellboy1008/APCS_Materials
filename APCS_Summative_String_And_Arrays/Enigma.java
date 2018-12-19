import java.util.Random;
public class Enigma
{
    private String code;

    //arrays to make code easier (put outside so that it can be accessed from both methods)
    private char[] character1 = {'1','5','7','8','9','0','a','e','g','h','i','m','o','p','q','r','s','w','y','z', '"','?',';','/','!'}; //(25)
    private char[] character2 = {'2','3','4','b','c','d','j','k','l','t','u','v','\'',',','.'}; //(15) 
    private char[] character3 = {'6','f','n','x',' '};//(5)
    private char[] character4 = {'*', '(', ')', '-', '+', '=', ':'}; //7
    private String[] coder1 = {"ax1","an2","am3","ay4","ar5","aw6","ix7","in8","im9","ir0","ux1","un2","um3","uy4","ur5","ow6","ex7","en8","em9","er0","ox1","on2","om3","oy4","or5"}; //(25)
    private String[] coder2 = {"ak6", "ag7","as8","az9", "at0","ad1","ik2","ig3","ihs4","ij5","ich6","icj7","uk8","ug9","us0","uz1","uts2","utz3","ek4","eg5","es6","ez7","et8","ed9","ok0","og1","os2","oz3","ot4","od5"}; //(30)
    private String[] coder3 = {"ah6","ap7","ab8","ih9","ib0","ip1","uf2","ub3","up4","eh5","eb6","ep7","oh8","ob9","op0"}; //(15)
    private String[] coder4 = {"!", "@", "#", "<", "%", ">", "&"}; //7

    private String[] userinput1 = {"1","2","2","3","3","4","4","5","6","6","6","7","8","9","0"}; //15
    private String[] userinput2 = {"a","b","b","c","c","d","d","e","f","f","f","g","h"}; //13
    private String[] userinput3 = {"i","j","j","k","k","l","l","m","n","n","n","o","p","q","r"}; //15
    private String[] userinput4 = {"s","t","t","u","u","v","v","w","x","x","x","y","z"}; //13
    private String[] userinput5 = {"\"","'","'",",",",",".",".","?"," "," "," ",";","/","!"}; //14
    private String[] userinput6 = {"*","(",")","-","+","=",":"}; //7
    private String[] decrypt1 = {"ax1","ak6","ag7","as8","az9","at0","ad1","an2","ah6","ap7","ab8","am3","ay4","ar5","aw6"}; //15
    private String[] decrypt2 = {"ix7","ik2","ig3","ihs4","ij5","ich6","icj7","in8","ih9","ib0","ip1","im9","ir0"}; //13
    private String[] decrypt3 = {"ux1","uk8","ug9","us0","uz1","uts2","utz3","un2","uf2","ub3","up4","um3","uy4","ur5","ow6"}; //15
    private String[] decrypt4 = {"ex7","ek4","eg5","es6","ez7","et8","ed9","en8","eh5","eb6","ep7","em9","er0"}; //13
    private String[] decrypt5 = {"ox1","ok0","og1","os2","oz3","ot4","od5","on2","oh8","op0","ob9","om3","oy4","or5"}; //14

    //Encrypt
    public String encrypt(String code){
        Random randomGenerator = new Random(); //creating an object
        String answer = ""; //assign an empty string to the answer
        String actual = code.toLowerCase(); //change the whole code to lower case
        int length = code.length(); //find the length of the string

        //variables used to keep generate random integers 
        int x2 = randomGenerator.nextInt(2);
        int x3 = randomGenerator.nextInt(3);

        //runs through every character of the string and converts it to a String + adds it to the answer (concat function)
        for (int x1 = 0; x1 < length; x1++){ 
            //characters with only 1 corresponding values
            for (int i = 0; i<25; i++){
                if (actual.charAt(x1) == character1[i]){
                    answer = answer.concat(coder1[i]);
                }
            }
            //characters with 2 corresponding values
            for (int i1 = 0; i1<15; i1++){
                if(actual.charAt(x1) == character2[i1]){
                    answer = answer.concat(coder2[(2*i1)+x2]);
                }
            }
            //characters with 3 corresponding values
            for (int i2 = 0; i2<5; i2++){
                if(actual.charAt(x1) == character3[i2]){
                    answer = answer.concat(coder3[(3*i2)+x3]);
                }
            }
            //symbols that correspond to numbers 
            for (int i3 = 0; i3<7; i3++){
                if (actual.charAt(x1) == character4[i3]){
                    answer = answer.concat(coder4[i3]);
                }
            }
        }

        //adds three random numbers at the end and start of the encryption for confusion
        for (int i4 = 0; i4<3; i4++){
            answer = answer.concat(Integer.toString(randomGenerator.nextInt(10)));
            answer = Integer.toString(randomGenerator.nextInt(10)) + answer;
        }
        
        //returns the answer to complete the encryption
        return answer;
    }

    /*
    Explaining the code: 

    The code has 3 different parts to it. First of all, english alphabets, symbols and numbers 
    are converted into Japanese Hiragana. Then, it is converted to the english pronounciation
    for each of the Hiragana. Finally, the pronounciations are printed out by the program 
    backwards with an extra number at the end. Additionally, some of the symbols are converted to other symbols. Decoding Table for 
    my encryption is attached on Schoology.

    String methods Used:

    1. length() 
    2. charAt() 
    3. toLowerCase() 
    4. compareTo() 
    5. concat() 
    6. replaceAll() 
    7. contains() 
    8. substring() 
    9. indexOf() 
    10. equals() 

     */

    //Decrypt
    public String decrypt(String code){
        Random randomGenerator = new Random(); //creating an object
        String answer1 = code; //assign an empty string to the answer
        int length = answer1.length(); //find the length of the string

        // if the code is valid, the method will run, if not, it will print "not possible"

        //replace the numbers that are there for confusion with empty strings 
        String numbers_2 = answer1.substring((length-3), length); //gets the random numbers at the back of the code
        answer1 = answer1.replaceAll(numbers_2,"");
        String numbers_1 = answer1.substring(0,3); //gets the random numbers at the front of the code
        answer1 = answer1.replaceAll(numbers_1,"");

        //check for characters (split into the ones that start with the same alphabet)
        for (int i10 = 0; i10<7; i10++){
            if(answer1.contains(coder4[i10])){
                answer1 = answer1.replaceAll(coder4[i10],userinput6[i10]);
            }
        }
        for (int i5 = 0; i5 < 15; i5++){
            if(answer1.contains(decrypt1[i5])){
                answer1 = answer1.replaceAll(decrypt1[i5],userinput1[i5]);
            }
        }
        for (int i6 = 0; i6 < 13; i6++){
            if(answer1.contains(decrypt2[i6])){
                answer1 = answer1.replaceAll(decrypt2[i6],userinput2[i6]);
            }
        }
        for (int i7 = 0; i7<15; i7++){
            if(answer1.contains(decrypt3[i7])){
                answer1 = answer1.replaceAll(decrypt3[i7],userinput3[i7]);
            }
        }
        for (int i8 = 0; i8<13; i8++){
            if(answer1.contains(decrypt4[i8])){
                answer1 = answer1.replaceAll(decrypt4[i8],userinput4[i8]);
            }
        }
        for (int i9 = 0; i9<14; i9++){
            if(answer1.contains(decrypt5[i9])){
                answer1 = answer1.replaceAll(decrypt5[i9],userinput5[i9]);
            }
        }

        //returns the answer to complete the decryption
        return answer1;
    }
}

