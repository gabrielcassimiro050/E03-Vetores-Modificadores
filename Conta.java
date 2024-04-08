public class Conta {
    private String dono;
    private int nConta;
    private double saldo;
    private double limite;
    private String agencia;
    private int nOperacoes;
    private Operacao[] operacoes;

    private int totalContas;

    public Conta() {
        this.nOperacoes = 0;
        this.operacoes = new Operacao[1000];
        this.operacoes[nOperacoes] = new Operacao();
    }

    void imprimir() {
        System.out.println("Dono: " + this.dono);
        System.out.println("Número da Conta: " + this.nConta);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
        System.out.println();
    }

    public boolean sacar(double valor) {
        if (this.saldo - valor > 0 && valor <= this.limite) {

            if (this.nOperacoes != 0) {
                this.operacoes[this.nOperacoes] = new Operacao();
                this.operacoes[this.nOperacoes].Operar('s', valor);
                this.operacoes[this.nOperacoes].setTotalOperacoes(this.operacoes[this.nOperacoes - 1].getTotalOperacoes() + 1);
                this.nOperacoes++;
            } else {
                this.operacoes[this.nOperacoes] = new Operacao();
                this.operacoes[this.nOperacoes].Operar('s', valor);
                this.operacoes[this.nOperacoes].setTotalOperacoes(1);
                this.nOperacoes++;
            }

            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        if (valor > 0) {

            if (this.nOperacoes != 0) {
                this.operacoes[this.nOperacoes] = new Operacao();
                this.operacoes[this.nOperacoes].Operar('d', valor);
                this.operacoes[this.nOperacoes].setTotalOperacoes(this.operacoes[this.nOperacoes - 1].getTotalOperacoes() + 1);
                this.nOperacoes++;
            } else {
                this.operacoes[this.nOperacoes] = new Operacao();
                this.operacoes[this.nOperacoes].Operar('d', valor);
                this.operacoes[this.nOperacoes].setTotalOperacoes(1);
                this.nOperacoes++;
            }

            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(Conta destino, double valor) {
        if (valor > 0) {
            boolean saqueRealizado = this.sacar(valor);
            if (saqueRealizado) {
                return destino.depositar(valor);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void setDono(String nome) {
        this.dono = nome;
    }

    public void setSaldo(double valor) {
        this.saldo = valor;
    }

    public void setNConta(int n) {
        this.nConta = n;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNOperacoes(int valor) {
        this.nOperacoes = valor;
    }

    public void setOperacao(int valor) {
        this.operacoes = new Operacao[valor];
    }

    public void setTotalContas(int valor) {
        this.totalContas = valor;
    }

    public String getDono() {
        return this.dono;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNConta() {
        return this.nConta;
    }

    public double getLimite() {
        return this.limite;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public int getNOperacoes() {
        return this.nOperacoes;
    }

    public Operacao[] getOperacoes() {
        return this.operacoes;
    }

    public Operacao getOperacao(int i) {
        return this.operacoes[i];
    }

    public int getTotalContas() {
        return this.totalContas;
    }
}