import java.util.Scanner;
public class TelephoneNumber 
{
    public static void main(String[] args) 
    {
    	String phoneNum;		//holds a number in letters
    	String trimedNum;		//hold phoneNum without spaces
    	String upper;			//holds trimedNum with only upper case leters
    	int numLength;			//length of phoneNum
    	
    	Scanner input = new Scanner(System.in);
    	System.out.println("Please enter a telephone number expressed in letters");
    	phoneNum = input.nextLine();		//phoneNum accepts a phone number in letters
    	
    	trimedNum = phoneNum.replaceAll(" ","");		//trims allthe white spaces
    	upper = trimedNum.toUpperCase();				//makes all the letters upper case
    	numLength = upper.length();
    	System.out.println(upper);						//prints the phone number with uppercase and nospaces
    	
    	while(numLength < 7)			//if phone number is less than 7 leters asks to re-enter phone number
    	{
    		System.out.println("Please enter a telephone number with 7 or more letters");
    		phoneNum = input.nextLine();
    		
    		trimedNum = phoneNum.replaceAll(" ","");
    		upper = trimedNum.toUpperCase();
    		numLength = trimedNum.length();
    	}
    	
    	for(int i = 0; i < 7; i++)			//loops throught the string index by index comparing that index with a value from A to Z
    	{
    		char c = upper.charAt(i);		//c holds a character value at the ith point in the string
    		
    		if(i == 3)						//if i = 3 then make a hypen between the numbers
    		{
    			System.out.print('-');
    		}
    		
    		if(c == 'A'||c == 'B'||c == 'C')	//if string at ith position is A,B,or C print 2
    		{
    			System.out.print("2");
    		}
    		else if(c == 'D'||c == 'E'||c == 'F')	//if string at ith position is D,E,or F print 3
    		{
    			System.out.print("3");
    		}
    		else if(c == 'G'||c == 'H'||c == 'I')	//if string at ith position is G,H,or I print 4
    		{
    			System.out.print("4");
    		}
    		else if(c == 'J'||c == 'K'||c == 'L')	//and so on...
    		{
    			System.out.print("5");
    		}
    		else if(c == 'M'||c == 'N'||c == 'O')
    		{
    			System.out.print("6");
    		}
    		else if(c == 'P'||c == 'Q'||c == 'R'|| c == 'S')
    		{
    			System.out.print("7");
    		}
    		else if(c == 'T'||c == 'U'||c == 'V')
    		{
    			System.out.print("8");
    		}
    		else if(c == 'W'||c == 'X'||c == 'Y'||c =='Z')
    		{
    			System.out.print("9");
    		}
    	}
    }
}
