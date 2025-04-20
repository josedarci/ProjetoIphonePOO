import iphone.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();


        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();


        meuIphone.ligar("11999998888");
        meuIphone.atender();
        meuIphone.iniciarConversaVoz();


        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
