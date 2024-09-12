public class Main {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("Filipe Cnadido", "123.456.789.78");
        Cliente cliente2 = new Cliente("Maria das Graças", "789.456.123.12");

        ContaCorrente cc1 = new ContaCorrente(01, cliente1, 1500.0);
        ContaPoupanca cp1 = new ContaPoupanca(13, cliente2, 0.05);

        banco.adicionarConta(cc1);
        banco.adicionarConta(cp1);

        cc1.depositar(2000.0);
        cc1.sacar(500.0);
        cp1.aplicarRendimento();
        cc1.transferir(cp1, 700.0);
    }
}
