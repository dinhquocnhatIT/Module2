package AbstarctDemo.Machine;

public abstract class Machine {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void start();
}
