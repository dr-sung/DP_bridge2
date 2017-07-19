
// This example is based on the code presented at:
// http://www.codeproject.com/Articles/183655/Bridge-Design-Pattern

public class Main {
    
    public static void main(String[] args) {
        
        ApplianceImplementor fan = new CeilingFan("Ceiling Fan");
        ApplianceImplementor vacuum = new VacuumCleaner("Vacuum Cleaner");
        
        SwitchAbstraction s1 = new RemoteControlSwitch(fan);
        SwitchAbstraction s2 = new RemoteControlSwitch(vacuum);
        
        // client code works only with the abstraction,
        // not the implementation objects
        
        s1.turnOn();
        s2.turnOn();
        s2.turnOff();
        s1.turnOff();
    }
    
}
