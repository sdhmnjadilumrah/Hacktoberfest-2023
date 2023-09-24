/*Sample Program to illustarte Selection Sort Technique in Java
The following code represents the usage of Selection Sort Technique to arrange numbers in the ascending order.
*/
import java.util.*;
public class Selection
{
    //Main Method(This is the execution part of the program)
    public static void main(String args[]) 
    {
        int i,j,n,t,min;
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter the size of the array(must be less than 100): "); //Input message for the user
        n = in.nextInt(); //Getting input for the size of the array from the user
        while(n>100 || n<1) 
        {
            System.out.println("Invalid Input! Enter the size of the array less than 100: "); //Alternate message for user in case input is invalid
            n = in.nextInt(); //n variable stores the size of the array
        }
        int num[] = new int[100];
        System.out.println("Enter the elements of the array: ");
        for(i=0;i<n;i++)
        {
            num[i] = in.nextInt(); //Getting input for the elements of the array from the user
        }
        for(i=0;i<n-1;i++) // Traversing the elements of the array
        {
            min = i;
            for(j=i+1;j<n;j++)
            {
                //Checking if the adjacent value in the array is smaller or not
                if(num[j]<num[min])
                min = j; //Assigning the smallest value to min variable after traversing the array
            }
            // Swapping of the minimum number to the beginning of the array
            t = num[i];
            num[i] = num[min];
            num[min] = t;
        }
        System.out.println("Numbers arranged in ascending order are: ");
        for(i=0;i<n;i++)
        {
            System.out.println(num[i]);
        }
    }
}