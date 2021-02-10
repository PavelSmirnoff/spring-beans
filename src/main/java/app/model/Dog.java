package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal{
    @Override
    public String toString() {
        return "Im not a Cat, Gav... Gav...";
    }
}
