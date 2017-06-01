import java.io.*;
class Print_class
{
    
    public static void main(String args[]){
         File n = new File("input1.txt");
         String y;
        StringBuffer s = new StringBuffer(n.getAbsolutePath().substring(0,14));        
        s.append("Locker\\input1.txt");
        System.out.println(s);
    }
}


