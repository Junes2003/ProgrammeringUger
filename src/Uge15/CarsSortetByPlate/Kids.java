package Uge15.CarsSortetByPlate;

public class Kids implements Comparable<Kids> {
    private String numberPlate;

    public Kids(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    @Override
    public int compareTo(Kids other) {
        return this.numberPlate.compareTo(other.numberPlate);
    }

    @Override
    public String toString() {
        return numberPlate;
    }
}