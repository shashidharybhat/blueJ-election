/**Programmed and executed by ___S___Y___B___.
 *The program envisions to give a suitable alternative for EVM's 
 * This program applies the concepts of loops , arrays ,
 * constructors , bufferedReader , Scanner , if statements
 * try catch operations.
 */
import java.io.*;
import java.util.concurrent.TimeUnit;
  public class Election_Main 
  {
    String voterID[] = new String[900];
    /**...........................................................................An array for storing the the voter id*/
    int classno ;/**..............................................................Present class no of the voter*/
    int class_size;/**............................................................The number of students in the class*/
    static String presentid;/**...................................................The voter ID of the present voter*/
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));/** Buffered reader*/
    static Election_Main ob = new Election_Main();/**.............................Main class object*/
    static VoteCandidate vote = new VoteCandidate();/**...........................VoteCandidate class object*/
    static Election_head_boy headboy = new  Election_head_boy();/**...............Election_head_boy class object*/
    int counter;
    String nextvoter;
    public Election_Main()
    {
        String template =  "/u003500"; /**........................................Template for the voter ID*/
        classno = 0;
        class_size = 0;
    }
    /**
     * Method dispHex(hexa)
     * Converts unicode character into integer to authenticate
     * 
     * @param hexa takes the unicode and converts into integer
     * @returns  the classno in integer format
     */
    public void dispHex(String hexa) 
    {
        String hex = hexa;
        int intValue = Integer.parseInt(hex, 16);
        System.out.println((char)intValue);      
    }
    /**
     * Method voterId()
     * Used to authenticate the voter ID entered 
     *
     */
    public void voterId()throws IOException , InterruptedException {
        boolean check = checkId(presentid);
       String code = presentid.substring(2,6);
        if(check == true ){  
           dispHex(code);
        }
        else if(check == false){
        System.err.println("improper ID .Please repeat the process again");
        ob.credential();
      }
      else{
          //Do nothing
        }
    }
    /**
     * Method credential()
     * Used to input voter data;
     */
    public void credential()throws IOException , InterruptedException {
        System.out.println("$$$$$$$$$$$$Welcome To The Election Process$$$$$$$$$$$$");
        System.out.println("Enter your voter ID");
        presentid = buf.readLine();
        System.out.println("Enter class number");    
        classno = Integer.parseInt(buf.readLine());
        
      }
     /**
      * Method checkId()
      *
      * @param votid A parameter
      * @return true:if voter ID is correct.
      *        false:if wrong.
      */              
     public static boolean checkId(String votid){
         if(votid.length() == 8){
             return true;
        }
        else{
            return false;
        }
    }
    /**
     *
     * Method repeat()
     * 
     */
    void repeat()throws IOException , InterruptedException{
        System.out.print("\u000C");
        System.out.println("OK");
        ob.select();
    }
    void select()throws IOException , InterruptedException{
        
        ob.credential();
        counter += 1;
        ob.voterId();
         vote.headboy(); 
        System.out.println("For the next voter,Press y.To proceed with the next class enter the code");
        nextvoter = buf.readLine();
        System.out.println(nextvoter);
        if(nextvoter.equals("y") == true||nextvoter.equals("Y") == true)
        {
          ob.repeat();
        }
        else if(nextvoter.equals("passwordenter") == true){
            System.out.println("The voting process will be stopped");
        }
        else{
            System.out.println("enter");
        }
     }
    public void voteCand(){
    }
    public static void main(String args[])throws IOException , InterruptedException  {
       ob.select();       
    }
}         
