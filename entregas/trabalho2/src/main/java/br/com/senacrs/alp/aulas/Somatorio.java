package br.com.senacrs.alp.aulas;


public class Somatorio {
	
	private static Somatorio instancia = new Somatorio();
	
	
	private Somatorio() {

		super();
	}
	
	public double somaTotal(double[] valores) {
		
		double resultado = 0.0;
		
		
		if (valores == null)
		{
			resultado = Double.NaN;
		}
		
	else {			
		
			for (int i = 0; i <= valores.length -1; i++)
			{
				
			resultado = resultado + valores[i];
							
	        }
			
		}
		
		return resultado;
	
}
	
	public static Somatorio getInstancia() {
		
		return Somatorio.instancia;
	}
}
