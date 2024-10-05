import java.util.*;

public class TypeA extends Thing {

    // Makes a thing typeA, all other parts of this thing are taken care of in Thing
    public TypeA(){
        super( 45, 50, 'r');
    }

    // Given function for tupeA movement
    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3);

        if (i == 1){
            rightTurn();
        } else if (i == 2) {
            leftTurn();
        }

    }
}
