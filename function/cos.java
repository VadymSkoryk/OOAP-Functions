package function;

import java.io.FileOutputStream;

/**
 * Created by Лизаза on 26.03.2019.
 */
public class cos extends unar {
    public cos(function arg) {
        super(arg);
    }

    @Override
    public function diff() {
        return new multipli(arg.diff(),new sin(arg.diff()));
    }


}
