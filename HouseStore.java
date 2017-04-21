import java.io.*;
import java.util.*;
class HouseStore
{
     static Scanner kb = new Scanner(System.in);
    //RandomAccessFile raf = new RandomAccessFile("G:\\testout.txt","rw");
    BufferedReader reader = null;
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = null;
    
    String House = null;
    int voteforser;
    int Acan1;
    int Acan2;
      public void storeVote(String code,int vote) throws IOException,FileNotFoundException {  
          String line;  
          int cancode = vote;
          String candcode = code;
          String line1[] = new String[100];
          int i=0;
          reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("input1.txt"))));
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
    public void Agni() throws Exception{
        System.out.println("Welcome to Agni House Elections \n There are two posts In Agni House \n House Captian \n Vice-Captain \n Vote for Captain \n SYB \t 1 \n XYZ \t 2 \n Enter the serial number of the candidate");
        voteforser = Integer.parseInt(read.readLine());
        if(voteforser == 1){
            ++Acan1;
            storeVote("A1",Acan1);
        }else if(voteforser == 2){
            ++Acan2;
            storeVote("A2",Acan2);
        }
        else{
            System.out.println("Invalid serial number");
            Agni();
        }
    }
    public void select(String hs) throws Exception{
        House = hs;
        if(House.equalsIgnoreCase("a") == true){
            Agni();
        }
    }
}