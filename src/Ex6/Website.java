package Ex6;

import java.util.ArrayList;
import java.util.List;

public class Website implements Subject{
    private String URL;
    private List<Observer> observers = new ArrayList<>();
    private Strategy compStrat;


    Website(String URL) {
        this.URL = URL;
    }

    public void setCompStrat (Strategy compStrat) {
        this.compStrat = compStrat;
    }

    @Override
    public void attachObserver(Observer o) {

    }

    @Override
    public void detachObserver(Observer o) {

    }

    @Override
    public void notifyObservers() {

    }
}
