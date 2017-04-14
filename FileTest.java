import java.io.*;
public class FileTest {
 
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("input1.txt"))));
        String line;
        int cancode=2;
        
        
                String line1[] = new String[100];
                int i=0;
           try {
                // for performance compile once and use repeatedly (instead of line.matches("four.*"))
                //Pattern pattern = Pattern.compile("(four.*)"); // brackets only needed if using regex replace below ...
                
                while ((line = reader.readLine()) != null) {
                    //Matcher matcher = pattern.matcher(line);
                    if (line.equals("P1:0"))
                    {
                        line = line + ","+cancode; // your data
                        
                        // line = matcher.replaceAll("$16,"); // or with regex-replace ... "$1" is the first "()" in the pattern above
                    }
                    line1[i]=line;
                    i++;
                    //line1=line1.concat(
                    //writer.append(line);
                    //writer.newLine();
                   // writer.flush(); // to see everything that is written immediately in the file [it's buffered otherwise]
                }
                } finally {
                
                reader.close();
            }
             
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("input1.txt")));
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
 
}