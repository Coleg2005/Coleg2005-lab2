import java.util.*;

public class TypeC extends Thing{

        private int timeSinceLast = 0;
        private int spiral = 1;

        // Makes a thing typeC, all other parts of this thing are taken care of in Thing
        public TypeC(){
                super(65, 50, 'g');
        }

        // TypeC movement, each rotation takes more steps to turn.
        public void maybeTurn(Random rand) {    
               
                timeSinceLast++;
                if(timeSinceLast == spiral){
                        timeSinceLast = 0;
                        int i = rand.nextInt(3);
                        if (i == 1) {
                                rightTurn();
                        } else if (i == 2){
                                leftTurn();
                        }
                        spiral++;
                }
            }   


       
}
