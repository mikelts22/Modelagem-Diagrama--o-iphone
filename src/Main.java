public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone ();

        // Usando funcionalidades de Reprodutor Musical
        meuIphone.selecionarMusica("Bohemian Rhapsody - Queen");
        meuIphone.tocar();
        meuIphone.pausar();

        // Usando funcionalidades de Aparelho Telefônico
        meuIphone.ligar("1234-5678");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Usando funcionalidades de Navegador Internet
        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}