import java.util.Arrays; 
/** * Java Program to split a CSV String into individual String values. This * program shows two ways to split the CSV String and create a String array out * of it, first by using String.split() method and second, by using * StringTokenizer class. * * @author WINDOWS 8 * */ 
public class HelloWorldApp { 
    public static void main(String... args) { 
        String CSV = "Google,Apple,Microsoft"; 
        String[] values = CSV.split(","); 
        System.out.println(values[2] + values[1]);
    }
    }

