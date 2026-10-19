import java.util.function.Function;

public class Fila<E> {
    private Celula<E> inicio;
    private Celula<E> fim;

    public Fila(){
    
        Celula<E> sentinela = new Celula<E>();
        fim = sentinela;
		inicio = sentinela;
    }
    
    public boolean vazio(){
        return fim == inicio;
    }

    public void enfileirar(E item){
        Celula nova = new Celula<E>(item);
        fim.setProximo(nova);
        fim = nova;
    }

    public E desenfileirar() {
        if (!vazio()) {
            Celula<E> primeira = inicio.getProximo();
            E item = primeira.getItem();

            inicio.setProximo(primeira.getProximo());

           /*  if (primeira == fim) {
                fim = inicio;
            }*/

            return item;
        }
        return null;
    }
    public double calcularValorMedio(Function<E> extrator, int
quantidade){
        
    }
}



