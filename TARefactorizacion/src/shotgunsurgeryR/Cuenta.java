/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shotgunsurgeryR;

/**
 *
 * @author nicoleagila
 */
public class Cuenta {
    private String tipo;
       private String numeroCuenta;
       private int cantidad;
       
       public Cuenta(String tipo,String numero,int cantidad){
              this.cantidad=cantidad;
              this.tipo=tipo;
              this.numeroCuenta=numero;
       }
       public void debit(int debit){
              if(saldoMenorRequerido()){
                  System.out.println("Saldo minimo debe ser de 500");
              }else {
               cantidad = cantidad-debit;
               System.out.println("Ahora la cantidad es" + Integer.toString(cantidad));   
              }
       }
       
       public void transfer(Cuenta from,Cuenta to,int credito) {
              if(saldoMenorRequerido()){
                     System.out.println("Saldo minimo debe ser de 500");
              } else{
               to.cantidad = cantidad+credito;   
              }
       }

       
       private boolean saldoMenorRequerido()
       {
             return cantidad<=500;
       }
}
