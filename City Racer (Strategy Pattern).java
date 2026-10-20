interface MovementStrategy {
    String move();
}

class WalkingStrategy implements MovementStrategy {
    public String move() {
        return "Walking at 5 km/h";
    }
}

class SkateboardingStrategy implements MovementStrategy {
    public String move() {
        return "Skateboarding at 15 km/h";
    }
}

class JetpackStrategy implements MovementStrategy {
    public String move() {
        return "Flying with Jetpack at 60 km/h";
    }
}

class Player {
    private MovementStrategy strategy;

    public Player(MovementStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(MovementStrategy strategy) {
        this.strategy = strategy; 
    }

    public void move() {
        System.out.println(strategy.move());
    }
}

public class Main {
    public static void main(String[] args) {
        Player player = new Player(new WalkingStrategy());
        player.move(); // Output: Walking at 5 km/h

        player.setStrategy(new JetpackStrategy());
        player.move(); // Output: Flying with Jetpack at 60 km/h
    }
}