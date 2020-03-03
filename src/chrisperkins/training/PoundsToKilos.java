package chrisperkins.training;

public class PoundsToKilos {

    private static double KILOS_IN_A_POUND = 0.45359237;

    private int pounds;

    private double kilos;

    public PoundsToKilos(int pounds) {
        this.pounds = pounds;
        this.setKilos(pounds);
    }

    public int getPounds() {
        return pounds;
    }

    public void setPounds(int pounds) {
        this.pounds = pounds;
    }

    public double getKilos() {
        return kilos;
    }

    public void setKilos(int pounds) {
        this.kilos = (pounds * KILOS_IN_A_POUND);
    }

    public void printPoundsToKilos() {
        System.out.println( this.getPounds() + " pounds = " + this.getKilos() + " Kilos.");
    }

    @Override
    public String toString() {
        return "PoundsToKilos{" +
                pounds + " pounds = " +
                kilos + " kilos" +
                '}';
    }
}
