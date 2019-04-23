package function;

import java.io.FileOutputStream;

/**
 * Created by Лизаза on 28.03.2019.
 */
public class ln extends unar {
    public ln(function arg) {
        super(arg);
    }

    @Override
    public function diff() {

        return new multipli(new devision(new constanta(1),arg),arg.diff());
    }
}
