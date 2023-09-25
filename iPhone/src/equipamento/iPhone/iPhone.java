package equipamento.iPhone;

import equipamento.aplicativos.musical.ReprodutorMusical;
import equipamento.aplicativos.navegador.NavegadorNaInternet;
import equipamento.aplicativos.telefone.AparelhoTelefonico;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    @Override
    public void ligar() {
       System.out.println("TELEFONE LIGANDO....");
    }

    @Override
    public void atender() {
       System.out.println("ATENDENDO O TELEFONE....");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO O CORREIO DE VÓZ....");
    }

    @Override
    public void tocar() {
       System.out.println("INICIANDO APP DE MÚSICAS, TOCANDO MÚSICA ....");
    }

    @Override
    public void pausar() {
       System.out.println("MÚSICA PAUSADA, CLIQUE EM PLAY PARA RETOMAR....");
    }

    @Override
    public void selecionarMusica() {
      System.out.println("SELECIONANDO MÚSICAS....");
    }

   @Override
   public void exibirPagina() {
      System.out.println("EXIBINDO PÁGINA NA INTERNET ....");
   }

   @Override
   public void adicionarNovaAba() {
      System.out.println("ADICIONANDO NOVA ABA NO NAVEGADOR....");
   }

   @Override
   public void atualizarPagina() {
     System.out.println("ATUALIZANDO A PÁGINA DO NAVEGADOR....");
   }
    
}
