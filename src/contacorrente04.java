public class contacorrente04 extends conta04 implements tributavel{

    public contacorrente04( int agencia, int conta ) {

        super( agencia, conta );
    }

    @Override
    public void deposita(double valor) {
        //super.getSaldo() += valor;
    }

    @Override
    public boolean saca( double valor ) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);

    }

    @Override
    public double getValorImposto() {
        return super.getSaldo()*0.01;
    }



}
