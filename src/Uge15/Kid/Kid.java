package Uge15.Kid;

public class Kid implements Comparable {
    private int heightlnCm;
    private String name;

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public Kid(int heightlnCm, String name) {
        this.heightlnCm = heightlnCm;
        this.name = name;
    }

    public int getHeightlnCm() {
        return heightlnCm;
    }

    public void setHeightlnCm(int heightlnCm) {
        this.heightlnCm = heightlnCm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kid{" +
                "heightlnCm=" + heightlnCm +
                ", name='" + name + '\'' +
                '}';
    }

    public int getHeightInCm() {
        return 0;
    }
}
