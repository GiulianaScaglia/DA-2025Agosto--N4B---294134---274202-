 public class Trabajadora extends Bonificacion {
     public Trabajadora() {
         super("Trabajadora");
     }   
    
    public double calcularDescuento(double monto) {
          return monto * 0.85; // Aplica un descuento del 15%
      } 
     
}
