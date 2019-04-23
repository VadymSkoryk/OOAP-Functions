package function;

import java.io.FileOutputStream;

/**
 * Created by Лизаза on 26.03.2019.
 */
public class sin extends unar {

    public sin(function arg) {
        super(arg);
    }

    @Override
    public function diff() {
        return new multipli(arg.diff(),new cos(arg));
    }


}
