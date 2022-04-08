//TODOa complete this javadoc comment
/**
 * [The class for a game called "Snap,Crackle,Pop" used to run the game.]
 * @author [Harshavardhan Reddipalli]
 * @version 1.0
 */

//TODO1: declare the SnapCracklePop class
   public class SnapCracklePop{
   
   //TODOb Complete Comments
   /**
    * [Private variables snap,crackle and pop of type integer.snap is if the no.of rounds is a multiple of the snap number.
      The same is for crackle and pop but their respective type of number]
    */
   //TODO2 Declare private instance variables 
   //to store Snap, Crackle, and Pop values
    private int snap;
    private int crackle;
    private int pop;
   
   //TODOc complete comments
  /**
   * [The SnapCracklePop constructor takes in 3 integers,snap,crackle,pop,and assigns them to their instance variables]
   * @param [snap] [To store the value of snap passed by this.snap(which is passed on by the user)]
   * @param [crackle] [To store the value of crackle passed by this.crackle(which is passed on by the user)]
   * @param [pop] [To store the value of pop passed by this.pop(which is passed on by the user)]
   */  
   /*  The constructor takes in three ints,
    *  which must be assigned to their instance variables and initialized.
    */
   //TODO3 Write the constructor
    public SnapCracklePop(int snap, int crackle, int pop){
       this.snap = snap;
       this.crackle = crackle;
       this.pop = pop;
     }
      
   //TODOe complete comments
  /**
   * [The method playRound runs one round of the game and then returns the output]
   * @param [round] [Takes an integer which is the current round and then returns the output]
   * @return [The output of the present round]
   */ 
  /* playRound() is a helper method for playGame(). 
   *  It takes an int parameter representing the 
   *  current round of play, and returns the 
   *  String result for that specific round only.
   */
   //TODO4 implement the playRound method 
    public String playRound(int round){
       String output = "";
   
       if(round % this.snap == 0) {
          output += "snap";
        }
       if(round % this.crackle == 0) {
          output += "crackle";
        }
       if(round % this.pop == 0) {
          output += "pop";
        }
       if(output == "") {
        output += round;
        }
     return output;
   }
   
   //TODOd complete comments
   /**
   * [The playGame method with the help of the playRound method takes a single parameter representing 
      the no.of rounds and returns the output of the game]
   * @param [rounds] [The number of rounds(as an integer)]
   * @return [The output of the game]
   */ 
    /* playGame() takes a single parameter representing the rounds and returns
   *  a String representing the result of the entire game. The helper method
   *  playRound() may be useful here, so you may want to complete it first.
   */
   //TODO5 implement the playGame method
      public String playGame(int rounds){
         String result = "";
         int snaps = 0;
         int crackles =0;
         int pops = 0;
         
         for(int i = 1; i <= rounds;i++){
             String current_result = playRound(i);
             if(current_result.indexOf("Snap") != -1) {
                snaps++;
              }
             if(current_result.indexOf("crackle") != -1) {
                crackles++;
              }
             if(current_result.indexOf("pop") != -1) {
                pops++;
              }
             result += "Round " + i + ": " + current_result + "\n";
         }
         return result;
      }  
      //Loop through the rounds of the game
      //call playRound to handle the specific round
      //return the total aggregated game results
   
   //TODOf complete comments
   /**
    * [Implements the getSnap method and then returns the value of snap]
    * @return [The value of snap]
    */ 
    //TODO6 implement the getSnap method
    public int getSnap(){
       return snap;
       }
       
   //TODOg complete comments
   /**
    * [Implements the getCrackle method and then returns the value of crackle]
    * @return [The value of crackle]
    */ 
    //TODO7 implement the getCrackle method  
    public int getCrackle(){
       return crackle;
     }
     
   //TODOh complete comments
   /**
    * [Implements the getPop method and then returns the value of pop]
    * @return [The value of pop]
    */ 
    //TODO8 implement the getPop method
    public int getPop(){
       return pop;
      }
}
//end class