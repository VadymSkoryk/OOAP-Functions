package function;

import java.io.FileOutputStream;

/**
 * Created by Лизаза on 26.03.2019.
 */
public class exp extends unar {
    public exp(function arg) {
        super(arg);
    }

    @Override
    public function diff() {
        return new multipli(new exp(arg),arg.diff());
    }


}
