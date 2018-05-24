package hilo;

import java.util.Random;

import interfaz.Buffer;

public class Consumidor extends Thread
{
	private Buffer buffer;
	int t = 1;
	int factorial;
	
	public Consumidor(Buffer buffer) 
	{
		this.buffer = buffer;
	}
	
	@Override
	public void run()
	{
		
		
		while(t != -1)
		{
			
			t = buffer.getValor();

			
			if(t == -1) 
			{
				System.out.println(" [Consumidor] : Fin");
			}
			else
			{
				
			
			factorial = 1;
			
			
				 for (int i = t; i > 0; i--)
	             {
	                factorial = factorial * i; 
				
			}

			System.out.println(" [Consumidor] El factorial del numero " + t + " es: " + factorial);

			
			try 
			{
				sleep(new Random().nextInt(1000));
			}
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
			}
	
			
		}
	}

}