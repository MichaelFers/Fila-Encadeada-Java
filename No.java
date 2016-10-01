package FilaEncadeada;

public class No<T> {

	No<T> proximo;
	T item;
	
	public No(T item){
		
		proximo = null;
		this.item = item;
	}
	
}
