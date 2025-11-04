public class Exonerada extends Bonificacion {
    public Exonerada() {
        super("Exonerada");
    }       

    public double calcularDescuento(double monto) {
        return monto; // No aplica descuento, se exonera el monto total
    }
}
