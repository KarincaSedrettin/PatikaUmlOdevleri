// Base class
abstract class Hayvan {
    protected String turAdi;
    protected double agirlik;
    protected int yas;

    public Hayvan(String turAdi, double agirlik, int yas) {
        this.turAdi = turAdi;
        this.agirlik = agirlik;
        this.yas = yas;
    }

    // Abstract methods to be overridden by subclasses
    public abstract double getDosage();
    public abstract String getFeedSchedule();
}

// Subclass for At
class At extends Hayvan {
    public At(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public double getDosage() {
        // Specific dosage calculation for horses
        return agirlik * 0.05; // Örnek: Ağırlığın %5'i
    }

    @Override
    public String getFeedSchedule() {
        // Specific feed schedule for horses
        return "08:00, 12:00, 18:00";
    }
}

// Subclass for Kedigil
class Kedigil extends Hayvan {
    public Kedigil(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public double getDosage() {
        // Specific dosage calculation for felines
        return agirlik * 0.1; // Örnek: Ağırlığın %10'u
    }

    @Override
    public String getFeedSchedule() {
        // Specific feed schedule for felines
        return "09:00, 15:00, 21:00";
    }
}

// Subclass for Kemirgen
class Kemirgen extends Hayvan {
    public Kemirgen(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public double getDosage() {
        // Specific dosage calculation for rodents
        return agirlik * 0.02; // Örnek: Ağırlığın %2'si
    }

    @Override
    public String getFeedSchedule() {
        // Specific feed schedule for rodents
        return "07:00, 13:00, 19:00";
    }
}

// Main class to test the system
public class HayvanatBahcesi {
    public static void main(String[] args) {
        Hayvan at = new At("At", 500, 5);
        Hayvan kaplan = new Kedigil("Kaplan", 200, 3);
        Hayvan kunduz = new Kemirgen("Kunduz", 10, 2);

        System.out.println("At Dozaj: " + at.getDosage() + " mg");
        System.out.println("At Yem Zamanı: " + at.getFeedSchedule());

        System.out.println("Kaplan Dozaj: " + kaplan.getDosage() + " mg");
        System.out.println("Kaplan Yem Zamanı: " + kaplan.getFeedSchedule());

        System.out.println("Kunduz Dozaj: " + kunduz.getDosage() + " mg");
        System.out.println("Kunduz Yem Zamanı: " + kunduz.getFeedSchedule());
    }
}
