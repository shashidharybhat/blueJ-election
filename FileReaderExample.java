
  
import java.io.*;  
public class FileReaderExample {  
    public static void main(String args[])throws FileNotFoundException,IOException{    
          FileReader fr=new FileReader("\u0043\u003a\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0041\u0064\u006d\u0069\u006e\u0069\u0073\u0074\u0072\u0061\u0074\u006f\u0072\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u004c\u006f\u0063\u006b\u0065\u0072\u002f\u0069\u006e\u0070\u0075\u0074\u002e\u0074\u0078\u0074");    
          int i;    
          
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }    
}    





