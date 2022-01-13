public class calculaimposto {

        private double totalImposto;

        public void registra(tributavel trib){
            double valor = trib.getValorImposto();
            this.totalImposto += valor;
        }

        public double getTotalImposto(){
            return totalImposto;
        }

        public void setTotalImposto(double totalImposto) {
            this.totalImposto = totalImposto;
    }
}
