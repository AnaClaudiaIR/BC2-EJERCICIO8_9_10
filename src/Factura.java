public class Factura implements Imprimible{
    private double costeTotal;

    public Factura(double costeTotal) {
        this.costeTotal = costeTotal;
    }

    public double getCosteTotal() {
        return costeTotal;
    }

    public void setCosteTotal(double costeTotal) {
        this.costeTotal = costeTotal;
    }

    @Override
    public void imprimir() {
        System.out.println("Total: " + getCosteTotal());
    }
}
