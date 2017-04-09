
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    static String name;
    int age;

    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
        age = 0;
        name = "hii";
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void disp(String y)
    {
        // put your code here
        System.out.println(y);
    }
    public static void main(String args[]){
        Student st = new Student();
        st.disp(name);
    }
}
