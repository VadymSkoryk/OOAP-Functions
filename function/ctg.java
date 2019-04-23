package function;

import java.io.FileOutputStream;

/**
 * Created by Лизаза on 26.03.2019.
 */
public class ctg extends unar {
    public ctg(function arg) {
        super(arg);
    }

    @Override
    public function diff() {
        return new multipli(new devision(new constanta(1),new multipli(new sin(arg),new sin(arg))),arg.diff());

    }
}
