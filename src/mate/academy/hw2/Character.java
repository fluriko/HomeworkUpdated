package mate.academy.hw2;

// задание 2.1
public class Character {
    private String name;
    private String kind;
    private int lvl;
    private double power;
    private double health;

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public int getLvl() {
        return lvl;
    }

    public double getHealth() {
        return health;
    }

    public double getPower() {
        return power;
    }

    public static class Builder {
        private Character character;

        public Builder() {
            character = new Character();
        }

        public Builder withName(String name) {
            character.name = name;
            return this;
        }

        public Builder withKind(String kind) {
            character.kind = kind;
            return this;
        }

        public Builder withLvl(int lvl) {
            character.lvl = lvl;
            return this;
        }

        public Builder withPower(double power) {
            character.power = power;
            return this;
        }

        public Builder withHealth(double health) {
            character.health = health;
            return this;
        }

        public Character build() {
            return character;
        }
    }

    public static void main(String[] args) {
        Character mage = new Character.Builder()
                .withName("Artemis")
                .withKind("Hunter")
                .withLvl(1)
                .withPower(5)
                .withHealth(15)
                .build();
    }
}
