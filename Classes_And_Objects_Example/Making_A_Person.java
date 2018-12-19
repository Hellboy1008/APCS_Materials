public class Making_A_Person
{
    public static void main(String arg[]){
    People_Info person = new People_Info();
    System.out.println(person.weight());
    System.out.println(person.grade());
    System.out.println(person.age());
    // System prints out the age, grade and weight of the person from the other class
    // called "People_Info" 
    People_Info person_1 = new People_Info();
    person_1.weight_1(60);
    System.out.println("New weight = " + person_1.weight());
    // Changes the weight of the person using the setter in the other class, thus printing
    // out a new value for the weight 
    }
}
