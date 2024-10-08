import java.util.*;

public class TypeB extends Thing {
    private int timeSinceLast = 0;

    // Makes a thing typeB, all other parts of this thing are taken care of in Thing
    public TypeB(){
        super(55, 50, 'b');
    }

    // Given function for typeB movement
    public void maybeTurn(Random rand) {

        timeSinceLast++;
        if(timeSinceLast == 10){
            timeSinceLast = 0;
            int i = rand.nextInt(3);
            if (i == 1) {
                rightTurn();
            } else if (i == 2){
                leftTurn();
            }
        }
    }     
}
