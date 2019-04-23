package function;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Лизаза on 26.03.2019.
 */
public abstract class unar extends function {
    protected function arg = null;

    public unar(function arg) {
        this.arg = arg;
    }

    @Override
    public String toString() {
        return arg.getClass().getSimpleName()+"("+arg.toString()+")";
    }

    @Override
    public double Calc(double x) {
        switch (arg.getClass().getSimpleName())
        {
            case "cos": return  Math.cos(arg.Calc(x));
            case "sin": return Math.sin(arg.Calc(x));
            case "ctg": return 1/Math.tan(arg.Calc(x));
            case "tg": return Math.tan(arg.Calc(x));
            case "ln": return Math.log(arg.Calc(x));
            case "exp": return Math.exp(arg.Calc(x));

            default: return 0;
        }
    }

    @Override
    public String toXML() {

        String res = "<function><name>";
        res+= arg.getClass().getSimpleName();
        res+="</name><arglist><arg>";
        res+=arg.toXML()+"</arg></arglist>";
        res+="</function>";
        try
        {
            BufferedWriter wr = new BufferedWriter(new FileWriter(arg.getClass().getSimpleName().toString()+".xml"));
            wr.write(res);
            wr.close();
            return "Output to file succeed!!!";
        } catch (IOException e) {
            e.printStackTrace();
            return "something going wrong...";
        }
    }

}
