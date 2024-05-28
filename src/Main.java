class Main {
    public static void main(String[] args) {
        // Създаване на инстанцията на фитнес залата (Singleton)
        Gym gym = Gym.getInstance();

        // Създаване на някои трениращи (Observers)
        GymMember john = new GymMember("John");
        GymMember anna = new GymMember("Anna");

        // Регистриране на трениращите за известия от фитнес залата
        gym.subscribe(john);
        gym.subscribe(anna);

        // Настройване на базов тренировъчен режим (Strategy)
        TrainingMode basicMode = new BasicTrainingMode();
        gym.setTrainingMode(basicMode);

        // Обновяване към напреднал тренировъчен режим с декоратори
        TrainingMode advancedMode = new AdvancedTrainingMode();
        TrainingMode advancedWithCardio = new CardioDecorator(advancedMode);
        TrainingMode advancedWithCardioStrength = new StrengthDecorator(advancedWithCardio);

        // Настройване на новия тренировъчен режим
        gym.setTrainingMode(advancedWithCardioStrength);
    }
}