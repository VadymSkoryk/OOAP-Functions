package function;

import java.io.FileOutputStream;

/**
 * Created by Лизаза on 28.03.2019.
 */
public class Arg extends function {
    @Override
    public String toString() {
        return "x";
    }

    @Override
    public double Calc(double x) {
        return x;
    }

    @Override
    public function diff() {
        return new constanta(1);
    }

    @Override
    public String toXML() {
        return "xml";
    }
}
