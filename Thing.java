import java.util.*;


abstract class Thing{

        // dir: 0=North, 1=East, 2=South, 3=West.
        // timeSinceLast: this is only important for "TypeB" Things.
        public int  row, col, dir, timeSinceLast;
        public char lab = 'r';
        public boolean isTypeB;


        
        public void rightTurn(Thing t) {
                t.dir = (t.dir + 1) % 4;
        }
            
        public void leftTurn(Thing t) {
                t.dir = (t.dir + 3) % 4;
        }
            
        

        public static void step(Thing t) {
                final int[] dc = {
                        0, 1, 0, -1
                }, dr = {
                        1, 0, -1, 0
                };
                t.row += dr[t.dir];
                t.col += dc[t.dir];
        }

        public abstract void maybeTurn(Thing t);

        private class Node {
                public Thing data;
                public Node next;
             
                public Node() {
                }
        }
             

}