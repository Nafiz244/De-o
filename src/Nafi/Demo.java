package Nafi;

public class Demo {
	  public static void main(String[] args) 
	    {
	       char Alphabet = 'A';
	       int n = 4;
	         
	        System.out.println("Here is your pattern....!!!");
	         
	        for (int i =1 ; i< n;++i) 
	        {
	            for (int j = i; j<=1; ++j)
	            {
	                System.out.print(Alphabet+" ");
	            }
	            ++Alphabet;
	             
	            System.out.println();
	        }
	         
	    }
	}

