package function;

/**
 * Created by Лизаза on 28.03.2019.
 */
public class multipli extends binar {

    public multipli(function left, function right) {
        super(left, right);
        symbol = "*";
    }


    @Override
    public function diff() {
        return new sum(new multipli(left.diff(), right), new multipli(right.diff(), left));

    }
}
