public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();




        System.out.println("TV está ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: "+ smartTv.canal);
        System.out.println("Volume Atual: "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada );

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? "+smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume Atual: "+ smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        System.out.println("Canal Atual: "+smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Canal Atual: "+smartTv.canal);

    }

}
