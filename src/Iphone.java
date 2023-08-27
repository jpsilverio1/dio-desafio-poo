public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDaInternet {
    @Override
    public void tocar() {
        System.out.println("Tocar música no Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar música no Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar música no Iphone");
    }

    @Override
    public void ligar() {
        System.out.println("Realizar ligação no Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atender ligação no Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz no Iphone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir página web no Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba no Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página web no Iphone");
    }
}
