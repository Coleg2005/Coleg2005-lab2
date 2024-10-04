import java.util.*;

public class TypeC extends Thing{

        private int timeSinceLast = 0;
        private int spiral = 1;

        public TypeC(){
                super(65, 50, 'g');
        }

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
