package function;

/**
 * Created by Лизаза on 28.03.2019.
 */
public class devision extends binar {
    public devision(function left, function right) {
        super(left, right);
        symbol="/";
    }

    @Override
    public function diff() {

        return new devision(new minus(new multipli(left.diff(),right),new multipli(right.diff(),left)),new multipli(right,left));
    }
}
