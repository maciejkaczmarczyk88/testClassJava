package task.Zada95;

public class Part {
    private int number;
    private String nameProducer;
    private String model;
    private int seriaNumber;

    public Part(int number, String nameProducer, String model, int seriaNumber) {
        this.number = number;
        this.nameProducer = nameProducer;
        this.model = model;
        this.seriaNumber = seriaNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNameProducer() {
        return nameProducer;
    }

    public void setNameProducer(String nameProducer) {
        this.nameProducer = nameProducer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeriaNumber() {
        return seriaNumber;
    }

    public void setSeriaNumber(int seriaNumber) {
        this.seriaNumber = seriaNumber;
    }

    @Override
    public String toString() {
        return "Part{" +
                "number=" + number +
                ", nameProducer='" + nameProducer + '\'' +
                ", model='" + model + '\'' +
                ", seriaNumber=" + seriaNumber +
                '}';
    }
}
