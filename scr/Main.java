import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static Conta[] inicializarContas(int nContas) {
        Conta[] aux = new Conta[nContas];
        for (int i = 0; i <  nContas; ++i) {
            aux[i] = new Conta();
        }
        return aux;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta[] contas = inicializarContas(2);

        contas[0].setDono("pedro");
        contas[1].setDono("pedro");

        contas[0].setSaldo(1000);
        contas[1].setSaldo(1000);

        contas[0].setLimite(1000);
        contas[1].setLimite(1000);

        contas[0].sacar(200);
        contas[0].sacar(200);
        contas[1].sacar(200);

        System.out.println("Total de Operações: "+Operacao.getTotalOperacoes());
    }
}
