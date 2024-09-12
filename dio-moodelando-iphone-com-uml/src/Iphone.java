public class Iphone implements ReprodutorMusical{

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica();
        iphone.fazerChamada();
        iphone.encerrarChamada();
        iphone.iniciarCorreioVoz();
        iphone.abrirPagina();
        iphone.fecharPagina();
        iphone.atualizarPagina();
    }

    public void tocarMusica(){

        System.out.println("Reproduzindo");

    }
    public void pausarMusica(){
        System.out.println("Música pausada");
    }
    public void selecionarMusica(){
        System.out.println("Música selecionada");
    }
    public void fazerChamada(){

        System.out.println("Chamando...");

    }
    public void encerrarChamada(){
        System.out.println("Chamada finalizada");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
    }
    public void abrirPagina(){

        System.out.println("Carregando Página Internet...");

    }
    public void fecharPagina(){
        System.out.println("Página fechada");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando Página Internet...");
    }



}
