class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(int numero, Cliente cliente, double limite){
        super(numero, cliente);
        this.limite =limite;
    }


    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= (getSaldo()+limite)) {
            double saldo =getSaldo();
            if (valor <= saldo) {
                super.sacar(valor);
            }else{
                double restante = valor -saldo;
                super.sacar(saldo);
                System.out.println("limite "+ restante);
            }

        }else{
            System.out.println("Valor invalido");
        }

    }


}
