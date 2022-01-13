public abstract class conta04 {

    private double saldo;
    private int agencia;
    private int conta;
    private cliente04 titular;
    private static int total;

    public conta04( int agencia , int conta ){
        conta04.total++;
        System.out.println("O total de contas criadas é : " + total);

        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 100;
        System.out.println("Seguem os dados da conta criada: " + this.agencia + this.conta);

    }

    public boolean saca ( double valor){
        if( this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public abstract void deposita( double valor );

    public boolean transfere(double valor, conta04 destino){
        if( this.saca(valor)){
            destino.deposita(valor);
            return true;
        }else{
            return false;
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public cliente04 getTitular() {
        return titular;
    }

    public void setTitular(cliente04 titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        conta04.total = total;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
