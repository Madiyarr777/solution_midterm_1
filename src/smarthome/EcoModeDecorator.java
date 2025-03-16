public class EcoModeDecorator implements SmartModule {
    private SmartModule module;
    private double energySave;

    public EcoModeDecorator(SmartModule module, double energySave) {
        this.module = module;
        this.energySave = energySave;
    }

    @Override
    public void enable() {
        System.out.println("Eco mode activated (" + energySave + "% saved)");
        module.enable();
    }

    @Override
    public void disable() {
        module.disable();
    }

    @Override
    public String id() {
        return module.id() + "-eco";
    }
}