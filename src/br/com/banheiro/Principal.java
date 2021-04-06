package br.com.banheiro;

public class Principal {
    public static void main(String[] args) {

        Banheiro banheiro = new Banheiro();

        Thread convidado1 = new Thread(new TarefaNumero1(banheiro),"João");
        Thread convidado2 = new Thread(new TarefaNumero2(banheiro),"Pedro");
        Thread convidado3 = new Thread(new TarefaNumero1(banheiro),"Cleide");
        Thread convidado4 = new Thread(new TarefaNumero2(banheiro),"Cleiton");

        convidade1.start();
        convidade2.start();
        convidade3.start();
        convidade4.start();
    }
}
