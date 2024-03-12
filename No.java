public class No{
    private int info;
    private No proximo;


    public No (int info){
        setInfo(info);
        proximo = null; //por clareza
    }

    public int getInfo() {
        return info;
    }

    public No getProximo() {
        return proximo;
    }

    public void setInfo(int info){ //as manutencões, excecoes e regras de negocio ficam aqui! por isso usamos ele no construtor
        this.info = info; //this.info é o atributo da classe; só info é o parâmetro
    }

    public void setProximo(No proximo){
        this.proximo = proximo;
    }

    @Override
    public String toString(){ //fazemos esse método porque na verdade um objeto nó guarda só um pesço na memória no qual as suas informações/atributos estão alocados
        return "|" + info + "|->";
    }
}

// quanto mais operações, maior a memória e o processamento, mas também pode facilitar algumas operações
//tipo de lista por trás de um carrossel: lista circular dupla (a ultima liga à primeira e você pode ir para frente e para trás)
//usamos a definição recursiva de tipos para alocar atributos do tipo No;