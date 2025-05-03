package iphone.apps;

import iphone.interfaces.AparelhoTelefonico;
import iphone.interfaces.NavegadorInternet;
import iphone.interfaces.ReprodutorMusical;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{

    private String musica;

    @Override
    public void ligar(String numero) {
        System.out.println("ligando para "+numero);
    }

    @Override
    public void atender() {
        System.out.println("atendendo a ligação");
    }

    @Override
    public void acessarCorreioDeVoz() {
        System.out.println("acessando o correio de voz");
    }

    
    @Override
    public void escolherMusica(String musica) {
        System.out.printf("tocando musica...(%s)\n",musica);
        this.musica=musica;
    }

    @Override
    public void pausar() {
        System.out.println("musica pausada!");
    }

    @Override
    public void tocar() {
        if(musica==null)
            System.out.println("selecione uma musica");
        else
            System.out.printf("tocando musica...(%s)\n",musica);
    }

    @Override
    public void exbirPagina(String url) {
        System.out.printf("exibindo a seguinte...(%s)\n",url);
    }

    @Override
    public void fecharPagina(String url) {
        System.out.printf("fechando a seguinte pagina...(%s)\n",url);
    }

    @Override
    public void atualizarPagina() {
        System.out.printf("Recarregando a pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova guia");
    }
}
