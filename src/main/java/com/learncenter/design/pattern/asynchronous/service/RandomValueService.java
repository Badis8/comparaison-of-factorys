package com.learncenter.design.pattern.service;




import com.learncenter.design.pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class RandomValueService {
    private List<Observer<Part>> observers = new ArrayList<>();
    private Random random = new Random();
    private ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);

    public void subscribe(Observer<Part> observer) {
        observers.add(observer);
    }

    public void generateRandomValueAsync() {
        String[] types = {"head", "legs", "home"};
        String chosenType = types[random.nextInt(types.length)];

        Object value;
        switch (chosenType) {
            case "head" -> value = random.nextInt(5);
            case "legs" -> value = random.nextInt(8);
            default -> value = random.nextBoolean() ? "shell" : "pond";
        }

        int delay = random.nextInt(2000) + 500;

        scheduler.schedule(() -> notifyObservers(new Part(chosenType, value)), delay, TimeUnit.MILLISECONDS);
    }

    private void notifyObservers(Part part) {
        for (Observer<Part> obs : observers) {
            obs.update(part);
        }
    }

    public void shutdown() {
        scheduler.shutdown();
    }

    public static class Part {
        public final String type;
        public final Object value;

        public Part(String type, Object value) {
            this.type = type;
            this.value = value;
        }
    }
}
