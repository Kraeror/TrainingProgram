public class StrengthDecorator extends TrainingProgramDecorator {
    public StrengthDecorator(TrainingMode decoratedProgram) {
        super(decoratedProgram);
    }

    @Override
    public String createProgram() {
        return decoratedProgram.createProgram() + " + Силови упражнения";
    }
}
