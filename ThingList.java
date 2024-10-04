public class ThingList {

        Node head;

        private class Node {
                Thing data;
                Node  next;
        }

        public void addThing(int row, int col){

                Thing tA = new Thing();
                tA.row = row;
                tA.col = col;
                Node nA = new Node();
                nA.data = tA;
                nA.next = L;
                L       = nA;

        }




        public void moveAll(Thing L){

                for( Node T = L; T != null; T = T.next ) {
                        maybeTurn(T.data);
                        step(T.data);
                }

        }

        public void printAll(){

                for( Node T = L; T != null; T = T.next )
                        System.out.println(T.data.row + " " + T.data.col + " " + T.data.lab);

                System.out.println("done");
                System.out.flush();

        }

        
        
}
