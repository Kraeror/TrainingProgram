public class GymMember extends Trainee {
    private String name;
    private String trainingProgram;

    public GymMember(String name) {
        this.name = name;
    }

    @Override
    public void update(TrainingMode trainingMode) {
        this.trainingProgram = trainingMode.createProgram();
        System.out.println(name + " беше уведомен/а за новия тренировъчен режим и получи обновената програма: " + trainingProgram);
    }
}