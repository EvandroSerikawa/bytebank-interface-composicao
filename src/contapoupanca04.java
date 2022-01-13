public class contapoupanca04 extends conta04 implements tributavel {

    public contapoupanca04(int agencia, int conta) {

        super(agencia, conta);
    }

    @Override
    public void deposita(double valor) {

    }

    @Override
    public boolean saca(double valor) {
        return super.saca(valor);
    }

    @Override
    public double getValorImposto() {
        return 0;
    }
}

