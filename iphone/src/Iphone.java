public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private boolean chamadaEmAndamento = false;
    private boolean correioDeVozAtivo = false;
    private boolean musicaTocando = false;

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
        musicaTocando = true;
    }

    @Override
    public void pausar() {
        if (musicaTocando) {
            System.out.println("Música pausada.");
            musicaTocando = false;
        } else {
            System.out.println("Nenhuma música tocando para pausar.");
        }
    }

    @Override
    public void selecionarMusica() {
        if (musicaTocando) {
            System.out.println("Selecionando música...");
        } else {
            System.out.println("Nenhuma música tocando para selecionar.");
        }
    }

    @Override
    public void ligar() {
        System.out.println("Telefone ligado.");
    }

    @Override
    public void atender() {
        if (chamadaEmAndamento) {
            System.out.println("Chamada atendida.");
            chamadaEmAndamento = false;
        } else {
            System.out.println("Nenhuma chamada em andamento para atender.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        if (!correioDeVozAtivo) {
            System.out.println("Correio de voz ativado. Agora você pode receber mensagens de voz.");
            correioDeVozAtivo = true;
        } else {
            System.out.println("O correio de voz já está ativado.");
        }
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página na internet...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    public void receberChamada() {
        chamadaEmAndamento = true;
        System.out.println("Chamada recebida. Para atender, use o método 'atender()'.");
    }
}
