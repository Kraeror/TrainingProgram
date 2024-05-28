import java.util.ArrayList;
import java.util.List;

public class Gym {
    private static Gym instance;
    private final List<Trainee> observers;
    private TrainingMode trainingMode;

    private Gym() {
        observers = new ArrayList<>();
    }

    public static Gym getInstance() {
        if (instance == null) {
            instance = new Gym();
        }
        return instance;
    }

    public void subscribe(Trainee observer) {
        observers.add(observer);
    }

    public void unsubscribe(Trainee observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Trainee observer : observers) {
            observer.update(trainingMode);
        }
    }

    public void setTrainingMode(TrainingMode mode) {
        this.trainingMode = mode;
        notifyObservers();
    }

    public TrainingMode getTrainingMode() {
        return trainingMode;
    }
}