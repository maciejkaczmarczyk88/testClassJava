package task.Zada95;

public class Tire extends Part{
    private int size;
    private int width;

    public Tire(int number, String nameProducer, String model, int seriaNumber, int size, int width) {
        super(number, nameProducer, model, seriaNumber);
        this.size = size;
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Tire{} " + super.toString();
    }
}
