import com.mobile.Legacy.Charger;
import com.mobile.Legacy.MobilePhone;

public class Main {

    public static void main(String[] args) {
        Charger charger = new Charger(5.0f, 1.0f);

        System.out.println("\n============= MicroUsb ==============\n");
        MobilePhone phone = new MobilePhone();
        phone.charge(20);
        phone.pluginCharger(charger);
        phone.charge(20);
        phone.unplugCharger();
        System.out.printf("Current power status = %s%n", phone.getChargingPercent());

        System.out.println("\n============= Type-C ==============\n");
        FastCharge fastCharge = new FastCharge(18);

        SamsungS samsung = new SamsungS();
        samsung.makeCall();
        samsung.pluginCharger(fastCharge);
        samsung.charge(30);
        samsung.unplugCharger();
        printBatteryStatus(samsung);
        samsung.makeCall();
        printBatteryStatus(samsung);
        samsung.charge(10);
        samsung.unplugCharger();
        printBatteryStatus(samsung);

        System.out.println("\nCharging through adapter");
        TypeCCharger adapterMicroUsbToTypeC = new AdapterMicroUsbToTypeC(charger);  // адаптер через агрегацію
//        TypeCCharger adapterMicroUsbToTypeCInheritance = new AdapterMicroUsbToTypeCInheritance(5.0f, 1.0f);  // адаптер через наслідування
        samsung.pluginCharger(adapterMicroUsbToTypeC);
        samsung.charge(10);
        samsung.unplugCharger();
        printBatteryStatus(samsung);


        System.out.println("\nMaintaining legacy charging");
        phone.pluginCharger(new AdapterTypeCToMicroUsb(fastCharge));
        phone.charge(20);
        phone.unplugCharger();
        System.out.printf("Current power status = %s%n", phone.getChargingPercent());


        System.out.println("\nCharging a Type C device with a two-sided adapter");
        samsung.pluginCharger(new AdapterToTwoSided(charger));
        samsung.charge(20);
        samsung.unplugCharger();
        printBatteryStatus(samsung);


        System.out.println("\nCharging a MicroUsb device with a two-sided adapter");
        phone.pluginCharger(new AdapterToTwoSided(fastCharge));
        phone.charge(20);
        phone.unplugCharger();
        System.out.printf("Current power status = %s%n", phone.getChargingPercent());

    }

    private static void printBatteryStatus(SamsungS phone){
        System.out.printf("Current battery status = %s%n", phone.getChargingPercent());
    }

}
