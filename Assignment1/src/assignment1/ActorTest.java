package assignment1;

/**
 * Created by Liam McGovern on 1/29/14.
 */
public class ActorTest {
    public static void main(String[] args) {
        int quantityOfActors = Input.instance.getInt("How many Actors should be made?");

        Actor[] setOfActors;
        setOfActors = new Actor[quantityOfActors];

        for (int i = 0; i < quantityOfActors; i++) {
            setOfActors[i] = new Actor();
            System.out.println(setOfActors[i]);
        }
    }
}
