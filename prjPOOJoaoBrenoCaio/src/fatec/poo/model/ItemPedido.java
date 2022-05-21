package fatec.poo.model;
import fatec.poo.model.Produto;


public class ItemPedido {
    private int sequencia;
    private double qtdeVendida;
    
    public ItemPedido(int sequencia, double qtdeVendida){
        this.sequencia = sequencia;
        this.qtdeVendida = qtdeVendida;
    }
    //SETTERS
    public void setSequencia(int sequencia){
        this.sequencia = sequencia;
    }
    public void setqtdeVendida(double qtdeVendida){
        this.qtdeVendida = qtdeVendida;
    }
    //GETTERS
    public int getSequencia(){
        return sequencia;
    }
    public double getQtdeVendida(){
        return qtdeVendida;
    }
}
