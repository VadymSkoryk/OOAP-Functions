package function;

/**
 * Created by Лизаза on 28.03.2019.
 */
public class minus extends binar {

    public minus(function left, function right) {
        super(left, right);
        symbol="-";
    }

    @Override
    public function diff() {
        return new minus(left.diff(),right.diff());
    }

}
