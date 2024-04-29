public class FlatScreenTV implements Device {
    private boolean enabled = false;
    private int volume = 35;
    private int channel = 41;


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
    public void setVolume(int percent) {
        volume = percent;
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
        System.out.println("Flat Screen TV is " + (enabled ? "on":"off") + " with volume at " + volume + " and channel " + channel);
    }
}
