package function;

import java.io.FileOutputStream;

/**
 * Created by Лизаза on 25.03.2019.
 */
public abstract class function {
    @Override
    public String toString() {
        return "function";
    }
    public abstract  double Calc(double x);
    public abstract function diff();
    public abstract String toXML();

}
