package function;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Лизаза on 28.03.2019.
 */
public abstract class binar extends function {
    function left =null;
    function right = null;
    String symbol = null;

    public binar(function left, function right) {
        this.left = left;
        this.right = right;

    }

    @Override
    public String toString() {
        return "("+left.toString()+")"+symbol+"("+right.toString()+")";
    }

    @Override
    public double Calc(double x) {
        switch (symbol.toString())
        {
            case "+": return left.Calc(x) + right.Calc(x);

            case "-": return left.Calc(x) - right.Calc(x);

            case "*": return left.Calc(x) * right.Calc(x);

            case "/": return left.Calc(x) / right.Calc(x);

            default: return 0;
        }
    }

    @Override
    public String toXML() {
        String res="<function><name>";
        res+=getClass().getSimpleName();
        res+= "</name><arglist><arg>";
        res+= left.toXML()+ "</arg><arg>";
        res+=right.toXML()+ "</arg></arglist>";
        res+="</function>";
        try
        {
            BufferedWriter wr = new BufferedWriter(new FileWriter(left.getClass().getSimpleName().toString()+this.getClass().getSimpleName()+
                    right.getClass().getSimpleName().toString()+".xml"));
            wr.write(res);
            wr.close();
            return "Output to file succeed!!!";
        } catch (IOException e) {
            e.printStackTrace();
            return "something going wrong...";
        }

    }
}
