import java.util.*;

public class TypeA extends Thing {
    private Random rand = new Random();

    public TypeA(){
        super( 45, 50, 'r');
    }

    public void maybeTurn() {
        int i = rand.nextInt(3);

        if (i == 1){
            rightTurn();
        } else if (i == 2) {
            leftTurn();
        }

    }
}
