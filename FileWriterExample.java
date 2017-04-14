import java.io.*;  
public class FileWriterExample {  
    
    public static void main(String args[]){    
         try{    
           RandomAccessFile fw=new RandomAccessFile("G:\\testout.txt","rw");    
           fw.seek(0);
           fw.writeUTF("3");    
           //fw.writeChars("\n\r");
           fw.writeUTF("5");
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}  
