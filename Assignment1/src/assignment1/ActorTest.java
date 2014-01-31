package assignment1;

/**
 * Created by Liam McGovern on 1/29/14.
 */
public class ActorTest {
    public static void main(String[] args) {
        int quantityOfActors = Input.instance.getInt("How many Actors should be made?");

        Actor[] setOfActors;
        setOfActors = new Actor[quantityOfActors];
        System.out.println("Listing unmodified Actor attributes: ");


        for (int i = 0; i < quantityOfActors; i++) {
            setOfActors[i] = new Actor();
            System.out.println(setOfActors[i]);
        }


        int index = Input.instance.getInt("Which attributes would you like to modify");
        setOfActors[index].inputAllFields();


        for (int i = 0; i < quantityOfActors; i++) {

            System.out.println(setOfActors[i]);
        }

    }
}