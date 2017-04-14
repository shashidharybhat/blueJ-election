import java.io.*;

class RandomAccessFile1
{
    
    public static void main(String args[]) throws FileNotFoundException,IOException{
        
       RandomAccessFile raf = new RandomAccessFile("G:\\testout.txt","rw");
       raf.seek(0);
       raf.writeUTF("ready \r\n ");
       raf.seek(30);
       raf.writeUTF("ready Now");
    }
}
    