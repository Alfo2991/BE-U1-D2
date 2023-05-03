public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double getArea() {
        return altezza * larghezza;
    }

    public double getPerimetro() {
        return 2 * (altezza + larghezza);
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Rettangolo 1: Area = " + r1.getArea() + ", Perimetro = " + r1.getPerimetro());
        System.out.println("Rettangolo 2: Area = " + r2.getArea() + ", Perimetro = " + r2.getPerimetro());
        double areaTotale = r1.getArea() + r2.getArea();
        double perimetroTotale = r1.getPerimetro() + r2.getPerimetro();
        System.out.println("Area totale = " + areaTotale + ", Perimetro totale = " + perimetroTotale);
    }

   
}
