package br.com.senacrs.alp.aulas;

public class MinhaLista<T> implements Lista<T> {
	
	private Nodo<T> inicio = new Nodo<T>();
	
	@Override
	public void adicionarFinal(T valor) {

		//implementar
	}

	@Override
	public void adicionarInicio(T valor) {
		
				//implementar
				
	}

	@Override
	public void adicionarPosicao(int posicao, T valor) {
		adicionarPosicao(obterTamanho(),valor);
		adicionarPosicao(0,valor); 
		//implementar
		
	}

	@Override
	public T obterPrimeiro() {
		
		int tamanho = obterTamanho();
		T resultado = obterPosicao(tamanho+1);
		
		return resultado;
	}

	@Override
	public T obterUltimo() {
		int tamanho = obterTamanho();
		T resultado = obterPosicao(tamanho-1);
		return resultado;
	}

	@Override
	public T obterPosicao(int posicao) {
		Nodo<T> nodo = null;
		
		nodo = obterNodoPosicao(posicao);
		
		
		return nodo.conteudo;
		}
		
		private Nodo<T> obterNodoPosicao(int posicao){
			Nodo<T> nodo = inicio;
			
			int indice = -1;
			while (posicao!= indice){
				nodo = nodo.proximo;
				indice++;
				
			}
			return nodo;
		}
		
		
	@Override
	public int obterTamanho() {
		
		int resultado = 0;
		Nodo<T> nodo = null;
		
		nodo=inicio;
		while(nodo.proximo !=null){
			nodo = nodo.proximo;
			resultado++;
		}
		return resultado;
		
	}
	

	@Override
	public T removerPosicao(int posicao) {
		
		//implementar
		
		return null;
	}

	@Override
	public void esvaziar() {
		inicio =null;
		
		
	}

}
