import java.util.*;

//(a) A=0.2 and m=100, (b) A=0.5 and m=100, and (c) A=0.8 and m=100; and (ii) the division hashing method with (d) m=100.


public class hashExampleD{
  
  public static void main( String[] args) {
    HashMap hm = new HashMap();
    Random rn = new Random();
    int m = 100;
    double key;
    int j;
    int[] keyCounter = new int[1000];
    
	for(int i =0; i < 100000 ; i++)
		{
    		int answer = rn.nextInt(1000);
      		key = Math.floor(answer % m);
      		j = (int) key;
      		keyCounter[j]++;
		}
    
    for(int i =0; i < 100000 ; i++)
		{
    		int answer = rn.nextInt(1000);
      		key = Math.floor(answer % m);
      		j = (int) key;
      		keyCounter[j]++;
		}
    
    for(int i =0; i < 100000 ; i++)
		{
    		int answer = rn.nextInt(1000);
      		key = Math.floor(answer % m);
      		j = (int) key;
      		keyCounter[j]++;
		}
    
    for(int i =0; i < 100000 ; i++)
		{
    		int answer = rn.nextInt(1000);
      		key = Math.floor(answer % m);
      		j = (int) key;
      		keyCounter[j]++;
		}
    
    for(int i =0; i < 100000 ; i++)
		{
    		int answer = rn.nextInt(1000);
      		key = Math.floor(answer % m);
      		j = (int) key;
      		keyCounter[j]++;
		}
    
    for(int i = 0; i< 1000; i++)
    	{
      		if(keyCounter[i]>0)
              System.out.println("key "+ i + " - fq "+keyCounter[i]/5);
    		
    	}
  }

}