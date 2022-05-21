
package fatec.poo.model;

import java.util.ArrayList;



public class Cliente extends Pessoa{
    
  private double limiteDisp,limiteCred;
  private ArrayList <Pedido> Pedidos = new ArrayList<Pedido>();


  //CONSTRUCTOR

    public Cliente(double LimiteCred, String cpf, String nome) {
        super(cpf, nome);
        this.limiteCred = LimiteCred;
    }

         
    //SETTERS
    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
    }
    
    public void setLimiteDisp(double limiteDisp) {
        this.limiteDisp = limiteDisp;
    }
    //GETTERS
    public double getLimiteDisp() {
        return limiteDisp;
    }

    public double getLimiteCred() {
        return limiteCred;
    }
    
   public void adicPedido(Pedido p){
       Pedidos.add(p);
       p.setCliente(this);
   }

}
