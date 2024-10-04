import java.util.*;


abstract class Thing{

        // dir: 0=North, 1=East, 2=South, 3=West.
        // timeSinceLast: this is only important for "TypeB" Things.
        protected int  row, col, dir;
        protected char lab;

        public Thing(int row, int col, char lab) {
                this.row = row;
                this.col = col;
                this.lab = lab;
                this.dir = 0;
        }
        
        public abstract void maybeTurn();

        public void step() {
                final int[] dc = {
                        0, 1, 0, -1
                }, dr = {
                        1, 0, -1, 0
                };
                row += dr[dir];
                col += dc[dir];
        }

        public void rightTurn() {
                dir = (dir + 1) % 4;
        }
            
        public void leftTurn() {
                dir = (dir + 3) % 4;
        }
            

}
