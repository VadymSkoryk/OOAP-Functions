package function;

/**
 * Created by Лизаза on 23.04.2019.
 */
public final class Shoto {
    private Shoto() {
    }

    public static double Dotuchni(function f, double a, double b, double eps) {
        double x;
        if (f.Calc(a) * f.Calc(f.diff().diff().Calc(a)) < 0) {
            x = a;
        } else {
            x = b;
        }
        while (Math.abs(x) > eps) {
            x = x - (f.Calc(x) / f.Calc(f.diff().Calc(x)));
        }
        return x;
    }

    public static double Newton(function f, double a, double b, int Degree, int Ndivisions) {

        int koef[][] = {{1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 4, 1, 0, 0, 0, 0, 0, 0, 0},
                {1, 3, 3, 1, 0, 0, 0, 0, 0, 0},
                {7, 32, 12, 32, 7, 0, 0, 0, 0, 0},
                {19, 75, 50, 50, 75, 19, 0, 0, 0, 0},
                {41, 216, 27, 272, 27, 216, 41, 0, 0, 0},
                {751, 3577, 1323, 2989, 2989, 1323, 3577, 751, 0, 0},
                {989, 5888, -928, 10496, -4540, 10496, -928, 5888, 989, 0},
                {2857, 15741, 1080, 19344, 5778, 5778, 19344, 1080, 15741, 2857}
        };
        double mltp[] = {1, 1.0 / 2, 1.0 / 3, 3.0 / 8, 2.0 / 45, 5.0 / 288, 1.0 / 140, 7.0 / 17280, 4.0 / 14175, 9.0 / 89600};

        if ((Degree < 0) || (Degree > 9)) System.out.println("Wrong degree");
        if (a >= b) System.out.println("Wrong segment");
        if (Ndivisions < 1) Ndivisions = 1;

        double Sum, PartSum;
        double h = (b - a) / (Degree * Ndivisions);

        Sum = 0;
        for (int j = 0; j < Ndivisions; j++) {
            PartSum = 0;
            for (int i = 0; i <= Degree; i++)
                PartSum += koef[Degree][i] * f.Calc(a + (i + j * Degree) * h);
            Sum += mltp[Degree] * PartSum * h;
        }

        return Sum;

    }
}
