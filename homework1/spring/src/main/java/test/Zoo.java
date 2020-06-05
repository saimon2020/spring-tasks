package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
    private Animal dog;
    private Animal cat;
    private Animal duck;

    @Autowired
    public Zoo(Animal dog, Animal cat, Animal duck) {
        this.dog = dog;
        this.cat = cat;
        this.duck = duck;
    }

    public Animal getDog() {
        return dog;
    }

    public Animal getCat() {
        return cat;
    }

    public Animal getDuck() { return duck; }

    public void setDog(Animal dog) {
        this.dog = dog;
    }

    public void setCat(Animal cat) {
        this.cat = cat;
    }

    public void setDuck(Animal duck) { this.duck = duck; }
}
