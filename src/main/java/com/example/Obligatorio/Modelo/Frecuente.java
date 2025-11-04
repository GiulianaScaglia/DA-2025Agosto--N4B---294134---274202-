public class Frecuente extends Bonificacion {
    public Frecuente() {
        super("Frecuente");
    }   

    public double calcularDescuento(double monto) {
          return monto * 0.90; // Aplica un descuento del 10%
    }

    @Override
    public void validar() {
        // Implementación de la validación para bonificación frecuente
    }
}
