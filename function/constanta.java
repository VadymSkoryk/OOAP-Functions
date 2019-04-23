package function;

import java.io.FileOutputStream;

/**
 * Created by Лизаза on 28.03.2019.
 */
public class constanta extends function {
    double value;
    public constanta(){value =1;};
    public constanta(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "const("+value+")";
    }

    @Override
    public double Calc(double x) {
        return x;
    }

    @Override
    public function diff() {
        return new constanta(0);
    }

    @Override
    public String toXML() {
        return "constanta";
    }
}
