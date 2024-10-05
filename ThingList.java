import java.util.*;

public class ThingList{

        // Nodes for list
        private class Node {
                Thing data;
                Node  next;
        

                Node(Thing t){
                        data = t;
                        next = null;
                }
        }

        // Initializes head
        private Node head;

        // Sets head for ThingList
        public ThingList(){
                head = null;
        }
        

        // Adds thing
        public void addThing(Thing t){

                Node newNode = new Node(t);
                newNode.next = head;
                head = newNode;

        }

        // Moves all things
        public void moveAll(Random rand){

                for( Node T = head; T != null; T = T.next ) {
                        T.data.maybeTurn(rand);
                        T.data.step();
                }

        }

        // Prints all things
        public void printAll(){

                for( Node T = head; T != null; T = T.next )
                        System.out.println(T.data.row + " " + T.data.col + " " + T.data.lab);

                System.out.println("done");
                System.out.flush();

        }

        
        
}
