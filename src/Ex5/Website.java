package Ex5;

import java.util.ArrayList;
import java.util.List;

public class Website implements Subject{
    private String URL;
    private List<Observer> observers = new ArrayList<>();

    Website(String URL) {
        this.URL = URL;
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
