
// participant: ConcreteImplementor2

public class VacuumCleaner implements ApplianceImplementor {
    
    private final String name;
    
    public VacuumCleaner(String name) {
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
