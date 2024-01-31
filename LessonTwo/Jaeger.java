public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int strength;
    private int armor;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int upgradeArmor() {
        return armor + 2;
    }

    public int loseStrength() {
        return strength - 3;
    }

    public Jaeger () {
    modelName = "";
    mark = "";
    origin = "";
    height = 0.0f;
    weight = 0.0f;
    strength = 0;
    armor = 0;
}

    public Jaeger (String modelName, String mark, String origin, float height, float weight, 
            int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
    }

    @Override
    public String toString() {
        return String.format("modelName: %s \nmark: %s \norigin: %s\nheight : %f\nweight : %f + "
            + "\nstrength : %d\narmor : %d",modelName, mark, origin, height, weight, 
            strength,armor);
    }
}