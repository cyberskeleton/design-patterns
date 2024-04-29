
public class Client {

    public static void main(String[] a) {
        TV tv = new TV();
        Remote remote = new Remote(tv);
        tv.deviceInfo();
        remote.togglePower();
        remote.channelUp();
        remote.volumeUp();
        tv.deviceInfo();

        Radio radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        radio.deviceInfo();
        advancedRemote.mute();
        radio.deviceInfo();

        FlatScreenTV flatTV = new FlatScreenTV();
        Remote remote1 = new Remote(flatTV);
        flatTV.deviceInfo();
        remote1.channelDown();
        remote1.volumeDown();
        remote1.togglePower();
        flatTV.deviceInfo();

        AdvancedRemote advancedRemote1 = new AdvancedRemote(flatTV);
        advancedRemote1.togglePower();
        advancedRemote1.mute();
        flatTV.deviceInfo();

    }


}
