public class TesteLista{
    public static void main(String[] args) {
        Lista lista = new Lista();
        System.out.println("lista foi contruida\n" + lista); //quando colocamos uma variavel de referencia num contexto de strig, estamos chamando o método toString dela

        for (int i = 0; i<6; i++){
            lista.insereInicio(i);
            System.out.println(lista);
        }

        for (int i = 1; i<6; i++){
            lista.insereFim(i*10 + 5);
            System.out.println(lista);
        }
        if (!lista.estaVazio()){
            System.out.println(lista.removeInicio() + "foi removido do inicio com sucesso.");
            System.out.println(lista);
        }else{
            System.out.println(lista);
        }
        if (!lista.estaVazio()){
            System.out.println(lista.removeFim() + "foi removido do fim com sucesso.");
            System.out.println(lista);
        }else{
            System.out.println(lista);while(!lista.estaVazio()){ //vamos ver se ele retira todos os elementos da lista sem tomarmos exceções ou perdermos algum ponteiro
            System.out.println(lista.removeInicio() + " saiu da lista");
            System.out.println(lista);

        }
        }

        // while(!lista.estaVazio()){ //vamos ver se ele retira todos os elementos da lista sem tomarmos exceções ou perdermos algum ponteiro
        //     System.out.println(lista.removeInicio() + " saiu da lista");
        //     System.out.println(lista);

        // }

        while(!lista.estaVazio()){ //vamos ver se ele retira todos os elementos da lista sem tomarmos exceções ou perdermos algum ponteiro
            System.out.println(lista.removeFim() + " saiu da lista");
            System.out.println(lista);

        }
    }
}

// exercicio : implementar os outros métodos com a listacomultimo