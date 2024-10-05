import java.util.*;


abstract class Thing{

        // Protected variables for all things
        protected int  row;
        protected int col;
        protected int dir;
        protected char lab;

        public Thing(int row, int col, char lab) {
                this.row = row;
                this.col = col;
                this.lab = lab;
                this.dir = 0;
        }
        
        // Declared function here and defined fuction in appropriate classes
        public abstract void maybeTurn(Random rand);

        // Movement occurs in all things so step, rightTurn & leftTurn in Thing class
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
