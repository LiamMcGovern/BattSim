package assignment1;

/**
 * Created by Liam McGovern on 1/29/14.
 */
public class ActorTest {
    public static void main(String[] args) {
        int quantityOfActors = Input.instance.getInt("How many Actors should be made?", 0, 100);

        Actor[] actors;
        actors = new Actor[quantityOfActors];

        for (int i = 0; i < quantityOfActors; i++) {
            actors[i] = new Actor();
        }



    }
}
