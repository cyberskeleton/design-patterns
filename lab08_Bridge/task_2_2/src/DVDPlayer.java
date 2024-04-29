public class DVDPlayer implements Device {
    private boolean enabled = false;
    private int volume = 75;
    private int channel = 3;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        enabled = true;
    }

    @Override
    public void disable() {
        enabled = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) { this.volume = percent;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void deviceInfo(){
        System.out.println("DVD Player is " + (enabled ? "on":"off") + " with volume at " + volume + " and channel " + channel);
    }

}
