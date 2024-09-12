import java.util.ArrayList;
import java.util.List;

class Banco {
    private List<Conta> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
        System.out.println("Conta adicionada com sucesso");
    }

    public Conta buscarConta(int numero){
        for(Conta conta : contas){
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }
}
