
  
import java.io.*;  
public class FileReaderExample {  
    public static void main(String args[])throws FileNotFoundException,IOException{    
          FileReader fr=new FileReader("input1.txt");    
          int i;    
          fr.skip(2);
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }    
}    




