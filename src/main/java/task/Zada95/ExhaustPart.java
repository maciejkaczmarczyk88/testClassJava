package task.Zada95;

public class ExhaustPart extends Tire{

    private boolean isCertificate;

    public ExhaustPart(int number, String nameProducer, String model, int seriaNumber, int size, int width, boolean isCertificate) {
        super(number, nameProducer, model, seriaNumber, size, width);
        this.isCertificate = isCertificate;
    }

    public boolean isCertificate() {
        return isCertificate;
    }

    public void setCertificate(boolean certificate) {
        isCertificate = certificate;
    }

    @Override
    public String toString() {
        return "ExhaustPart{" +
                "isCertificate=" + isCertificate +
                '}';
    }
}
