package function;

/**
 * Created by Лизаза on 28.03.2019.
 */
public class sum extends binar {
    //public sum() {left = null;right = null;}


    public sum(function left, function right) {
        super(left, right);
        symbol="+";
    }


    @Override
    public function diff() {
        return new sum(left.diff(),right.diff());
    }

}
