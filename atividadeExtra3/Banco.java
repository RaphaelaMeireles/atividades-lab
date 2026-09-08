public class Banco {

    private int numero;
    private int ag_numero;
    private String ag_nome;
    private int tipo;
    private double saldo;

    public Banco(int numero, int ag_numero, String ag_nome, int tipo, double saldo) {
        this.numero = numero;
        this.ag_numero = ag_numero;
        this.ag_nome = ag_nome;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public Banco(int numero, int ag_numero, String ag_nome, int tipo) {
        this.numero = numero;
        this.ag_numero = ag_numero;
        this.ag_nome = ag_nome;
        this.tipo = tipo;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public int getAg_numero() {
        return ag_numero;
    }

    public String getAg_nome() {
        return ag_nome;
    }

    public int getTipo() {
        return tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void creditar(double valor) {
        if (tipo != 4) {
            saldo += valor;
        } else {
            System.out.println("Operacao invalida: conta encerrada.");
        }
    }

    public void debitar(double valor) {
        if (tipo != 4) {
            saldo -= valor;
        } else {
            System.out.println("Operacao invalida: conta encerrada.");
        }
    }

    public String consultarSaldo() {
        return "Conta no " + numero + " - Saldo atual: R$ " + saldo;
    }

    public int encerrarConta() {
        this.tipo = 4;
        int contaEncerrada = this.numero;
        return contaEncerrada;
    }

    public String textoEncerrar() {
        return "Conta no " + numero + " encerrada. Tipo: " + tipo + " - Saldo final: R$ " + saldo;
    }
}
