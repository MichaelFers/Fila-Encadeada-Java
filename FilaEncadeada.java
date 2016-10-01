package FilaEncadeada;

public class FilaEncadeada<T> {

	private No<T> primeiro;
	private int tamanho;
	
	public FilaEncadeada(){
		primeiro = null;
		tamanho = 0;
	}
	
	public void enfileirar(T item){
		No<T> novoNo = new No(item);
		if(eVazio()){
			primeiro = novoNo;
			tamanho++;
		}else{
			No<T> aux = primeiro;
			No<T> aux2 = null;
			while(aux != null){
				aux2 = aux;
				aux = aux.proximo;
			}
			aux2.proximo = novoNo;
			tamanho++;
		}
		
		
	}
	
	private T remover(int index){
		
		if(eVazio() || index > this.tamanho || index < 0){
			throw new IllegalAccessError("Erro ao tentar remover");
		}else if(index == 1){
			No<T> noExcluido = primeiro;
			primeiro = primeiro.proximo;
			return noExcluido.item;
		}
		No<T> aux = primeiro;
		No<T> aux2 = null;
		int cont=1;
		while(cont<index){
			aux2 = aux;
			aux = aux.proximo;
			cont++;
		}
		aux2.proximo = aux.proximo;
		return aux.item;
		
		
	}
	
	public T desenfileirar(){
		return this.remover(1);
	}
	
	public T desenfileirar(int index){
		return this.remover(index);
	}
	
	private boolean eVazio(){
		return primeiro == null;
	}
	
	public String toString(){
		
		String to_string = "";
		
		No<T> aux = primeiro;
		while(aux != null){
			to_string += aux.item+" -> ";
			aux = aux.proximo;
		}
		return to_string;
	}
	public T pegar(int index){
		No<T> aux = primeiro;
		No<T> aux2 = null;
		int cont = 1;
		
		while(cont<=index){
			aux2 = aux;
			aux = aux.proximo;
			cont++;
		}
		
		return aux2.item;
		
	}
}
