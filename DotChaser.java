import java.util.*;

public class DotChaser {

  // Used to randomize movement
  public static Random rand = new Random(System.currentTimeMillis());  
  /**
   * This static method is ok :)
   */
  public static void main(String[] args) {
    int N = 200;

    if( args.length != 0 )
      N = Integer.parseInt(args[0]);

    // List of things given a name and count
    ThingList list = new ThingList();
    int count = 0;

    while( true ) {
      // Every N rounds, add another typeA and typeB Thing.
      if( count % N == 0 ) {

        // Gives a name and adds a typeA thing to the ThingList
        Thing tA = new TypeA();
        list.addThing(tA);

        // Gives a name and adds a typeB thing to the ThingList
        Thing tB = new TypeB();
        list.addThing(tB);

        // Gives a name and adds a typeB thing to the ThingList
        Thing tC = new TypeC();
        list.addThing(tC);
      }

      // Prints and Moves all
      list.printAll();
      list.moveAll(rand);
      
      count++;
    }
  }
}
