public class Lista {
    private No primeiro;

    //construtor padrão
    public No getPrimeiro(){
        return primeiro;
    }

    public boolean estaVazio(){
        return primeiro==null;
    }

    public void insereInicio(int i){
        No novo = new No(i);
        if (!estaVazio()) {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
}
