public class CardioDecorator extends TrainingProgramDecorator {
    public CardioDecorator(TrainingMode decoratedProgram) {
        super(decoratedProgram);
    }

    @Override
    public String createProgram() {
        return decoratedProgram.createProgram() + " + Кардио упражнения";
    }
}