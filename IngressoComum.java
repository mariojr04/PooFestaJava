public class IngressoComum extends Ingresso {

    
    public IngressoComum(String nome, boolean ehMeia, double preco, int lote){
        super(nome, ehMeia, preco, lote);
    }

    @Override
    public double CalculaReembolso(double preco, boolean ehMeia){
        if (ehMeia = false || lote == 1){
            return preco * 0.05;
        }else {
            return preco * 0.03;
        }
    }

}
