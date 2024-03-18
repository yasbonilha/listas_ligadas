public class Lista {
    private No primeiro;

    //construtor padrão
    public No getPrimeiro(){
        return primeiro;
    }

    public void setPrimeiro(No primeiro){
        this.primeiro = primeiro;
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

    @Override
    public String toString() {
        String s = "lista: ";
        if(estaVazio()){
            s += "vazia";
        }else{
            No aux = primeiro;
            while(aux!=null){ // varre a lista até o final dela, mas não chega no último (para depois dele)
                s = s + aux;
                aux = aux.getProximo();
            }
            s = s + "\\";
        }
        return s;
    }

    public void insereFim(int i){ // quanto maior fica a lista, mais cara sai essa operação de fim, porque o método tem que passar pela lista toda para chegar no final e adicionar um novo elemento.
        No novo = new No(i);
        if (estaVazio()){
            primeiro = novo;
        }else{
            No aux = primeiro;
            while (aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }

    public int removeInicio(){
        int temp = primeiro.getInfo(); //é responsabilidade da aplicação (no nosso caso, do nosso teste) ver se a lista está vazia
        primeiro = primeiro.getProximo(); // aqui estamos ajustando o ponteiro
        return temp;
    }

    public int removeFim(){
        int temp;
        //caso especial: lista com um elemento só
        if(primeiro.getProximo() == null){
            temp = primeiro.getInfo();
            primeiro = null;
        }else{
            //percorrer até encontrar o penultimo
            No aux = primeiro;
            while(aux.getProximo().getProximo() != null){ // a leitura é de trás para frente
                aux = aux.getProximo();
            }
            temp = aux.getProximo().getInfo();
            aux.setProximo(null);
        }
        return temp;
    }
}

// toda variável de objeto é uma variável de referencia que guarda uma referencia à uma classe
