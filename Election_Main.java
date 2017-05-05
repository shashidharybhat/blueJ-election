/**Programmed and executed by ___S___Y___B___.
 *The program envisions to give a suitable alternative for EVM's 
 * This program applies the concepts of loops , arrays ,
 * constructors , bufferedReader , Scanner , if statements
 * try catch operations.
 */
 import elect.*;
import java.io.*;
import java.util.*;
  public class Election_Main 
  {
    String voterID[] = new String[900];
    /**...........................................................................An array for storing the the voter id*/
    int classno ;/**..............................................................Present class no of the voter*/
    int class_size;/**............................................................The number of students in the class*/
    static String presentid;/**...................................................The voter ID of the present voter*/
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));/** Buffered reader*/
    static Election_Main ob = new Election_Main();/**.............................Main class object*/
    static MainVote vote = new MainVote();/**...........................MainVote class object*/
    HouseStore house = new HouseStore();
    Password pass = null;
    BufferedReader reader = null;
    BufferedWriter writer = null;
    int counter = -1;
    String nextvoter;
    String presenthouse = null;
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
    public boolean dispHex(String hexa) 
    {
        String hex = hexa;
        int intValue = Integer.parseInt(hex, 16);
        char charval = (char)intValue;
        if(Character.getNumericValue(charval) == classno){
            return true;
        } 
        else{
          return false;
        }
    }
    /**
     * Method voterId()
     * Used to authenticate the voter ID entered 
     *
     */
    public void voterId()throws Exception , InterruptedException {
        boolean checkid = checkId(presentid);
        boolean checkno = false;
       
       if(checkid == true ){  
           String code = presentid.substring(0,4);
           checkno = dispHex(code);
           ob.trueVoteid();
        }
       if(checkno == false){
          System.out.println("Improper class number.Please try again with the correct number");
          ob.credential();
          System.out.print("\u000C");
       }
       if(checkid == false){
          System.out.println("Improper ID .Please repeat the process again");
          ob.credential();
          System.out.print("\u000C");
        }
        else{
          //Do nothing
        }
    }
    public void Entrance(){        
       System.out.println("\u263A\u263A\u263A\u263A\u263A");
       System.out.println("*******Welcome to the elections of Cauvery Primary and High School*******");
       System.out.println("$$$$$$$$$$$$Welcome To The Election Process$$$$$$$$$$$$");
    }
    /**
     * Method credential()
     * Used to input voter data;
     */
    public void credential()throws Exception {
        System.out.println("Enter your voter ID");
        presentid = buf.readLine();
        try{
          System.out.println("Enter your class number.Do not enter the section");    
          classno = Integer.parseInt(buf.readLine());
        }catch(Exception e){
          System.out.println("Invalid class number");
          credential();
          System.out.print("\u000C");
        }
        System.out.println("Enter your house name");
        System.out.println("Enter \n A for Agni House \n P for Prithvi House \n V for Vayu House \n J for Jala House");
        presenthouse = buf.readLine();
        ob.voterId();
        Thread.sleep(1);
      }
     /**
      * Method checkId()
      *
      * @param votid A parameter
      * @return true:if voter ID is correct.
      *        false:if wrong.
      */              
     public static boolean checkId(String votid) throws Exception {
         if(votid.length() == 6){
             return true;
        }
        else{
            return false;
        }
    }
    public void trueVoteid()throws Exception{
        counter++;
        boolean truevote = true;
        for(int x = 0;x < 900 ;x++){
            String tempid = voterID[x];
            if(tempid==null) break;
            if(tempid.substring(3).equals(presentid.substring(3))){
                truevote = false;   
                break;
            }
        }
        if(truevote == true){
            System.out.println("Valid VoterId Please Continue");
            voterID[counter] = presentid;
        }else{
            System.out.println("VoterId Invalid Please enter the details again");
            ob.credential();
            System.out.print("\u000C");
        }
    }
    /**
     *
     * Method repeat()
     * 
     */
    void repeat()throws IOException ,Exception{
        System.out.print("\u000C");
        System.out.println("OK");
        ob.select();
    }
    void select()throws IOException , InterruptedException,Exception{
        ob.Entrance();
        ob.credential();
         vote.headboy(); 
         vote.headGirl();
         vote.sportsCap();
         house.select(presenthouse);
        System.out.println("For the next voter,Press any key");
        String next = buf.readLine();
        if(next.equals("\u0070\u0061\u0073\u0073\u0077\u006f\u0072\u0064\u0065\u006e\u0074\u0065\u0072") == true){
            System.out.println("The voting process will be stopped");
            System.exit(0);
          }
        else {
         ob.repeat();
        }
    }
    public String getHouse(){
        return presenthouse;
    }
    public static void main(String args[])throws Exception , InterruptedException  {
       ob.select();       
    }
}         


