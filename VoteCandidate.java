import java.io.*;
import java.util.*;
class VoteCandidate 
{
    static int voteforser;
    boolean votecand1;
    boolean votecand2;//
   int cand1vote;
   int cand2vote;
   int can1vote =  0;
    static Scanner kb = new Scanner(System.in);
   //RandomAccessFile raf = new RandomAccessFile("G:\\testout.txt","rw");
   BufferedReader reader = null;
   BufferedWriter writer = null;
    public  void headboy() throws FileNotFoundException,IOException {
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("input1.txt"))));
        System.out.println("###############HEAD BOY###############");
        System.out.println("Candidate \t Serial Number");
        System.out.println("Shashidhar.Y.Bhat \t 1");
        System.out.println("XXYYZZ \t \t   2");
        System.out.println("Enter the serial number of the candidate");    
        voteforser = kb.nextInt();
        if(voteforser == 1){
            can1vote++;
            voteStore("P1",can1vote);
           }     
           else if(voteforser == 2){
            
           }
           else{
            System.out.println("Invalid serial number please try again");
            headboy();
            }
    }
    public void voteStore(String code,int vote) throws IOException,FileNotFoundException {  
          String line;  
          int cancode = vote;
          String candcode = code;
          String line1[] = new String[100];
          int i=0;
           try {
                while ((line = reader.readLine()) != null) {
                    if (line.substring(0,2).equals(candcode))
                    {
                        line = line + ","+cancode; 
                    }
                    line1[i]=line;
                    i++;
                }
                } finally {
                reader.close();
          }             
          writer = new BufferedWriter(new FileWriter(new File("input1.txt")));
                try {                
                for(int j=0; j<i; j++) { 
                 if(j>0) writer.newLine();            
                writer.append(line1[j]);                          
            }
                writer.flush();            
            }
           finally {            
            writer.close();
          }
    }      
    public static void main(String args[]) throws FileNotFoundException,IOException{
        VoteCandidate ob = new VoteCandidate();
        ob.headboy();
    }    
    }
    
    
    

    
    
    