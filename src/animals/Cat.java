package animals;

public class Cat implements Animal {
    private String colour;
    private int weight;
    private String name;
    public static final String defaultName = "Not assigned yet";
    private boolean isAlive;
    public Cat() {
        this.isAlive = true;
    }
    public String getName() {
        if (name == null) {
            return defaultName;
        } else {
            return name;
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isAlive(){
        return this.isAlive;
    }
    public void kill() {
        this.isAlive = false;
    }
}
