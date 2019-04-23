package function;

import java.io.FileOutputStream;

/**
 * Created by Лизаза on 26.03.2019.
 */
public class tg extends unar {
    public tg(function arg) {
        super(arg);
    }

    @Override
    public function diff() {
        return new multipli(new devision(new constanta(1),new multipli(new cos(arg),new cos(arg))),arg.diff());
    }

}
