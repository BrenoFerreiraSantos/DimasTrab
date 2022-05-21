package fatec.poo.model;

import java.util.ArrayList;





public class Vendedor extends Pessoa{
    
    private double salarioBase,taxaComissao;
    private ArrayList <Pedido> Pedidos = new ArrayList<Pedido>();


    public Vendedor(double salarioBase, String cpf, String nome) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
    }

    //SETTERS
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    public void setPedidos(ArrayList Pedidos){
        this.Pedidos = Pedidos;
    }
    //GETTERS

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }
    
    public void adicPedido(Pedido p){
       Pedidos.add(p);
       p.setVendedor(this);
   }
}
