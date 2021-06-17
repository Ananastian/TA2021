package tsyganova.exam.ta;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Formula {

    public List<Double> args; //список
    public static List<Double> results; //список

    public Formula() {
        results = new LinkedList<>();
        args = new LinkedList<>();
    }

    public Formula(int length) {
        results = new LinkedList<>();
        args = new LinkedList<>();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            args.add((double) random.nextInt(100)); //вибираєм числа до 100
        }
    }

    public void SetArgs(double[] args) {
        this.args.clear();
        for (int i = 0; i < args.length; i++) {
            this.args.add(args[i]);
        }
    }

    public String Calculate() {
        results.clear();
        int length = args.size();
        for (int i = 0; i < length; i++) {
            results.add(Calc.Calculate(args.get(i)));
        }
        return results.toString();
    }

    public String GetArgs() {
        return args.toString();
    }

}
