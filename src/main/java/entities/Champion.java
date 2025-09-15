package entities;

public class Champion {
    private String name;
    private int life, attack, armor;
    private static final int ALWAYS_DAMAGE = 1;

    public Champion(String name, int life, int damage, int armor) {
        this.name = name;
        this.life = life;
        this.attack = damage;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void takeDamage(Champion other) {
        if(armor > other.attack) {
            life -= ALWAYS_DAMAGE;
        } else {
            life -= other.attack - armor;
        }
    }

    public String status(){
        if(life <= 0) {
            return name + ": "
                    + 0
                    + " de vida (morreu)";
        } else {
            return name + ": "
                    + life
                    + " de vida";
        }
    }
}
