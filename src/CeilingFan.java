
// participant: ConcreteImplementor1

public class CeilingFan implements ApplianceImplementor {
    
    private final String name;
    
    public CeilingFan(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is running.");
    }

    @Override
    public void stop() {
        System.out.println(name + " stopped.");
    }
    
}
