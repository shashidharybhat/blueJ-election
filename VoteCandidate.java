import java.io.*;
import java.util.*;
class VoteCandidate 
{
    static int voteforser;
    static Scanner kb = new Scanner(System.in);
    RandomAccessFile raf = new RandomAccessFile("F:\testout.txt","rw");
    public static void headboy(){
        System.out.println("###############HEAD BOY###############");
        System.out.println("Candidate \t Serial Number");
        System.out.println("Shashidhar.Y.Bhat \t 1");
        System.out.println("XXYYZZ \t 2");
        System.out.println("Enter the serial number of the candidate");    
        voteforser = kb.nextInt();
        
    }
    public void headgirl() {  
        
    }      
    public static void main(String args[]){
        VoteCandidate ob = new VoteCandidate();
        ob.headboy();
    }
    
    }

    
    