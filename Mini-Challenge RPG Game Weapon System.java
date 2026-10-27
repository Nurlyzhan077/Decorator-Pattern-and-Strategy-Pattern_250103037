public interface Weapon {
    void use();
}

public class Sword implements Weapon {
    public void use() {
        System.out.println("Slash! Dealing 20 physical damage.");
    }
}

public class MagicWand implements Weapon {
    public void use() {
        System.out.println("Zap! Dealing 35 magic damage.");
    }
}

public abstract class Hero {
    protected Weapon weapon;
    
    public Hero(Weapon weapon) {
        this.weapon = weapon;
    }
    
    public abstract void attack();
}

public class Knight extends Hero {
    public Knight(Weapon weapon) {
        super(weapon);
    }
    
    public void attack() {
        weapon.use();
    }
}

public class Wizard extends Hero {
    public Wizard(Weapon weapon) {
        super(weapon);
    }
    
    public void attack() {
        weapon.use();
    }
}