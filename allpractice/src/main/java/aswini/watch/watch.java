package aswini.watch;

import java.time.LocalTime;

public class watch {
	   
      public static void main(String[] args) throws InterruptedException {
		while(true)
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++) {
				System.out.print("😍");
				
				Thread.sleep(1);
				}
				System.out.println();
			}
			
			
		}
	   
	}
}
