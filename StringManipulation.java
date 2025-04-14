import java.util.Scanner; 
public class StringManipulation { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in);  
System.out.print("Enter the first string: "); 
String firstString = scanner.nextLine(); 
char[] firstCharArray = firstString.toCharArray();  
int length = firstCharArray.length; 
System.out.println("Length of the first string: " + length); 
System.out.print("Enter a position to find the character (0 to " + (length - 1) + "): "); 
int position = scanner.nextInt(); 
if (position >= 0 && position < length) { 
char characterAtPosition = firstCharArray[position]; 
System.out.println("Character at position " + position + ": " + characterAtPosition); 
} else { 
System.out.println("Invalid position!"); 
} 
scanner.nextLine(); 
System.out.print("Enter the second string: "); 
String secondString = scanner.nextLine(); 
String concatenatedString = firstString + secondString; 
System.out.println("Concatenated string: " + concatenatedString); 
} 
}