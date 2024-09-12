abstract class Conta {

    private int numero;
    private Double saldo;
    private Cliente cliente;

    public Conta(int numero, Cliente cliente){
        this.numero = numero;
        this.cliente =cliente;
        this.saldo =0.0;


    }
    public int getNumero(){
        return numero;
    }
    public Double getSaldo(){
        return saldo;
    }


    public Cliente getCliente(){
        return cliente;
    }
    public void depositar(double valor){

        if (valor> 0){
            saldo += valor;
            System.out.println("Deposito realzizado, saldo atual:"+saldo);
        }else{
            System.out.println("Valor de deposito invalido");
        }
    }

    public void sacar(double valor){
        if(valor > 0 && valor <=saldo){
            saldo -=valor;
            System.out.println("Saque realizdo, saldo atual:");
        }else{
            System.out.println("Saldo insuficiente");
        }

    }

    public void transferir(Conta destino, double valor){
        if (valor > 0 && valor <= saldo) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferencia realizada");

        }else{
            System.out.println("saldo insuficiente");
        }
    }
}

