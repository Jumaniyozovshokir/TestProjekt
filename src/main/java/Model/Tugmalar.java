package Model;

public class Tugmalar {
    private int liks=0;
    private int desLiks=0;

    public Tugmalar() {
    }

    public Tugmalar(int liks, int desLiks) {
        this.liks = liks;
        this.desLiks = desLiks;
    }

    public int getLiks() {
        return liks;
    }

    public void setLiks(int liks) {
        this.liks = liks;
    }

    public int getDesLiks() {
        return desLiks;
    }

    public void setDesLiks(int desLiks) {
        this.desLiks = desLiks;
    }
}
