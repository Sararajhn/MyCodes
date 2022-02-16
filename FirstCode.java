
public class FirstCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i =7;
        if(i>5)
		
		System.out.println("HEoWorld!");
        else if(i==7)
        	System.out.println("Hi world");
        else
        	System.out.println("Hi");
        
        // Switch statements
        
        int n=2;
        switch(n)
        {
        // it will check for matching n value , in this case n =2
        //so it will execute all th statements below 2
        //we can avaoid that using break statements betwen them
        // Switch doesnt support "double" type
        
        case 1:
        	   System.out.println("one");
        	   break;
        case 2 :
        	System.out.println("Two");
        	break;
        	default:
        	System.out.println("Three");
        }
        
        //while loop
        int j =1;
        while(j<5)
        {
        	System.out.println("While loop execution");
        	j++;
        }
        //Do-while loop
        //condition will check later
        //when you need to take input from the user
        int k=4;
        do
        {
        	System.out.println("Do while loop");
        	k++;
        }while(k<5);
        //For loop
        for(int l=0;l<=10;l++)
        {
        	System.out.println("For loop");
        }
	}

}
