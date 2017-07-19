
// participant: RefinedAbstraction

public class RemoteControlSwitch extends SwitchAbstraction {
    
    public RemoteControlSwitch(ApplianceImplementor appliance) {
        super.appliance = appliance;
    }

    @Override
    public void turnOn() {
        appliance.run();
    }

    @Override
    public void turnOff() {
        appliance.stop();
    }
    
}
