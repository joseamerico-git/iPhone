import equipamento.iPhone.iPhone;

public class DeviceIphone {
    public static void main(String[] args) throws Exception {

        System.out.println("iPhone iniciando serviços!\n");
        iPhone device = new iPhone();

        System.out.println("\nAbrindo app Reprodutor Músical!\n");
        device.tocar();
        device.pausar();
        device.selecionarMusica();

        System.out.println("\nAbrindo app telefônico!\n");

        device.ligar();
        device.atender();
        device.iniciarCorreioVoz();

        System.out.println("\nAbrindo o navegador!\n");
       
        device.exibirPagina();
        device.adicionarNovaAba();
        device.atualizarPagina();


    }
}
