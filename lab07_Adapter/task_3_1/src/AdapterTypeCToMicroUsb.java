import com.mobile.Legacy.MicroUsbCharger;
import static java.lang.Math.sqrt;

public class AdapterTypeCToMicroUsb implements MicroUsbCharger {

    final TypeCCharger typeCCharger;

    public AdapterTypeCToMicroUsb(TypeCCharger typeCCharger) {
        this.typeCCharger = typeCCharger;
    }

    @Override
    public float getOutputAmperage() {
        return (float) sqrt(typeCCharger.getOutputPower()); //resistance == 0
    }

    @Override
    public float getOutputVoltage() {
        return (float) sqrt(typeCCharger.getOutputPower());//typeCCharger.getOutputPower()/this.getOutputAmperage();
    }
}
