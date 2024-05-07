import com.mobile.Legacy.MicroUsbCharger;

import static java.lang.Math.sqrt;

public class AdapterToTwoSided implements TwoSidedCharger{

    TypeCCharger typeCCharger;
    MicroUsbCharger microUsbCharger;

    public AdapterToTwoSided(TypeCCharger typeCCharger) {
        this.typeCCharger = typeCCharger;
    }

    public AdapterToTwoSided(MicroUsbCharger microUsbCharger) {
        this.microUsbCharger = microUsbCharger;
    }

    @Override
    public float getOutputPower() {
        if (microUsbCharger == null) {
            return typeCCharger.getOutputPower(); }
        else {
            return microUsbCharger.getOutputAmperage() * microUsbCharger.getOutputVoltage();
        }
    }

    @Override
    public float getOutputVoltage() {
        if (microUsbCharger == null) {
            return (float) sqrt(typeCCharger.getOutputPower());} //typeCCharger.getOutputPower()/this.getOutputAmperage(); }
        else {
            return microUsbCharger.getOutputVoltage();
        }
    }

    @Override
    public float getOutputAmperage() {
        if (microUsbCharger == null) {
            return (float) sqrt(typeCCharger.getOutputPower()); }
        else {
            return microUsbCharger.getOutputAmperage();
        }
    }
}
