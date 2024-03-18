public class ListaComUltimo extends Lista {
    private No ultimo;
    
    //construtor padrão
    public No getUltimo(){
        return ultimo;
    }

    @Override
    public void insereFim(int i){
        No novo = new No(i);
        if (estaVazio()){
            setPrimeiro(novo);
        }//se a lista estiver vazia, o primeiro será o novo (e o ultimo, consequentemente). se não, só setamos o novo como ultimo, já que já existe o primeiro elemento
        ultimo = novo;
    }
}//vamos herdar todos os métodos da classe lista - menos alguns, que vão dar problema, como por ex. o setPrimeiro, que antes não existia
