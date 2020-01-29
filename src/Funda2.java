
import java.util.Arrays;


public class Funda2
{
    private String name;//the name of the string

    public String getName() {//get method
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }
    
    public static void main (String[]args){
     String myArray[] = new String [4];
     myArray[0]= "pk";
     myArray[1]= "dabbang";
     myArray[2]= "dhoom";
     myArray[3]= "udta punjab";
        System.out.println("list of things:");
        System.out.println(Arrays.toString(myArray));
     
     
    }
    
}
