import java.util.ArrayList;

public class SIM {
    private String numeroTelefono;
    private double credito;
    private ArrayList<Chiamata> ultimeChiamate;

    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0;
        this.ultimeChiamate = new ArrayList<Chiamata>();
    }

    public void stampaDati() {
        System.out.println("Numero di telefono: " + this.numeroTelefono);
        System.out.println("Credito disponibile: " + this.credito + " euro");

        if (this.ultimeChiamate.isEmpty()) {
            System.out.println("Nessuna chiamata effettuata");
        } else {
            System.out.println("Ultime chiamate effettuate:");
            for (Chiamata chiamata : this.ultimeChiamate) {
                System.out.println("- Numero chiamato: " + chiamata.getNumeroChiamato() +
                                   ", durata: " + chiamata.getDurata() + " minuti");
            }
        }
    }

    public static void main(String[] args) {
        SIM sim = new SIM("1234567890");
        sim.stampaDati();
    }
    public class Chiamata {
        private String numeroChiamato;
        private double durata;

        public Chiamata(String numeroChiamato, double durata) {
            this.numeroChiamato = numeroChiamato;
            this.durata = durata;
        }

        public String getNumeroChiamato() {
            return this.numeroChiamato;
        }

        public double getDurata() {
            return this.durata;
        }
    }
}
