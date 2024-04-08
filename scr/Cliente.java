public class Cliente {
    String nome;
    String cpf;
    String adress;
    int idade;
    char sexo;

    void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Endereço: "+adress);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
        System.out.println();
    }
}