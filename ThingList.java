public class ThingList{

        private class Node {
                Thing data;
                Node  next;
        

                Node(Thing t){
                        data = t;
                        next = null;
                }
        }

        private Node head;

        public ThingList(){
                head = null;
        }
        

        public void addThing(Thing t){

                Node newNode = new Node(t);
                newNode.next = head;
                head = newNode;
                
        }

        public void moveAll(){

                for( Node T = head; T != null; T = T.next ) {
                        T.data.maybeTurn();
                        T.data.step();
                }

        }

        public void printAll(){

                for( Node T = head; T != null; T = T.next )
                        System.out.println(T.data.row + " " + T.data.col + " " + T.data.lab);

                System.out.println("done");
                System.out.flush();

        }

        
        
}
