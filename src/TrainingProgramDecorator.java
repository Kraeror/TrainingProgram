public abstract class TrainingProgramDecorator implements TrainingMode {
    protected TrainingMode decoratedProgram;

    public TrainingProgramDecorator(TrainingMode decoratedProgram) {
        this.decoratedProgram = decoratedProgram;
    }

    @Override
    public String createProgram() {
        return decoratedProgram.createProgram();
    }
}