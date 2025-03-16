public record SmartWatchAdapter(String id) implements SmartModule {

    @Override
    public void enable() {
        System.out.println("[SmartHome] Unlocking via SmartWatch: " + id);
    }

    @Override
    public void disable() {
        System.out.println("[SmartHome] Locking via SmartWatch: " + id);
    }
}