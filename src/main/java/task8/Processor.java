package task8;

public abstract class Processor {

    public Processor nextProcessor;

    public Processor(Processor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }
}
