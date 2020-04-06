package prime_no_loop;

public class prime_no_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = 30 ;
        boolean flag = false;
        for(int i=2;i<=num /2 ;++i)
        {
        	if(num % i == 0)
        	{
        		flag = true;
        		break;
        	}
        }
        
        if(!flag)
		    System.out.println(num + " is prime no ");
        else
        	System.out.println(num + " is not a prime no ");   	
	}

}
