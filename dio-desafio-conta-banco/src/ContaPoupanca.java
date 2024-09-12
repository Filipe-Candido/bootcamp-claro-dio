class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(int numero, Cliente cliente, double taxaRendimento){
        super(numero, cliente);
        this.taxaRendimento =taxaRendimento;
    }
    public void aplicarRendimento(){
        double saldo = getSaldo();
        double rendimento = saldo*taxaRendimento;
        System.out.println("Rendimento da aplicação"+rendimento);
    }
}


