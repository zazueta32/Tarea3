package hilo;

import java.util.Random;
import java.util.Scanner;

import interfaz.Buffer;

public class Productor extends Thread
{
	private Buffer buffer;
	int n;
	public Productor(Buffer buffer)
	{
	
		this.buffer = buffer;
	}
	@Override
	public void run()
	{
		
		Scanner teclado = new Scanner(System.in);

		
		while(n != -1)
		{
			System.out.println(" [Productor] Ingresa un numero");
			n = teclado.nextInt();
			buffer.setValor(n);
			
			if(n== -1) 
			{
				System.out.println(" [Productor] Fin");
			}
			else {
				
			
				try 
				{
					Thread.sleep(8);				
				} 
				catch (InterruptedException e) 
				{
					
					e.printStackTrace();
				}
			}

		}
	}

}