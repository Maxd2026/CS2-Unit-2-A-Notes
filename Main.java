public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");

      // IF STATEMENTS: use boolean expressions to make
      // DECISIONS about which code to execute

      // Determine what value or condition your choice rests on
      // EX: Using the elevator at BWL depends on TIME
      double time = 8.5; // means 8:30 AM
      time = 8.25; // means 8:15 AM

      // Put the CONDITION to test in parenthesis
      if ( time < 8 ) {
         // if statement BODY only runs if CONDITION was TRUE
         System.out.println("You can take the elevator!");
      }
      // Statement below is outside of the if statement, so it'll run anyway
      System.out.println("The elevator is only available before 8 AM");

      // TWO-WAY SELECTION: if block + else block
      time = 8.0;
      if ( time < 8 ) {
         System.out.println("Eligible for elevator!");

      }
      else {
         // Statement in ELSE block runs when IF block is false
         System.out.println("Take the stairs...");
      }

      // Another example of TWO-WAY SELECTION
      // in this case, using just a boolean VALUE (not an EXPRESSION)
      boolean heads = false; // flipped tails
      // if ( true ) 
      if ( heads ) {
         System.out.println("Flipped heads! Wear white.");
      }
      else {
         System.out.println("Flipped tails! Wear black.");
      }

      // 2. ELSE IF BLOCKS (chained conditionals)
      // when you are accounting for muliple possible answers
      int battery = 19;
      // Always start the block with an IF statement
      if ( battery >= 95 ) {
         System.out.println("Unplug your phone!");
      }
      // ORDER MATTERS for else if blocks
      // as soon as a condition is met, the rest of the chain is SKIPPED!
      else if ( battery < 20 ) {
         System.out.println("LOW POWER MODE");
      }
      else if ( battery <= 50 ) {
         System.out.println("Plug in your phone soon...");
      }
      else {
         System.out.println("otherwise...");
      }

   } // this closes the main METHOD
} // this closes the Main CLASS
