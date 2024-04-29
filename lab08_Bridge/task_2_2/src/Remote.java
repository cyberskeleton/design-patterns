public class Remote {
    public Remote(Device device) {
        this.device = device;
    }

    protected Device device;

    public void togglePower(){
        if (device.isEnabled()){ device.disable();}
        else device.enable();
    }

    public void volumeUp() {
        if (device.getVolume() < 100) {
            device.setVolume(device.getVolume() + 5);
        }
    }

    public void volumeDown() {
        if (device.getVolume() > 0){
            device.setVolume(device.getVolume() - 5);
        }
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }

    public void channelDown() {
        if (device.getChannel() > 1) {
            device.setChannel(device.getChannel() - 1);
        }
    }

}
