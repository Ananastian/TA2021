/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsyganova.exam.ta;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class FormulaResults {
    public List<Double> args; //тримаэ в собі масивий список який зберігає ці параметри.
    public static List<Double> results; //паралельно створюваємо список результатів, для того щоб мати доступ при подальшій обработкі, буть то пошук або серверовка
    //статичний - щоб мати доступ дло них в статичних матодах, 

    public FormulaResults() { //конструтор
        args = new LinkedList<Double>();
        results = new LinkedList<Double>();
    }

    public FormulaResults(int length) //конструтор Обов'язково ініціюємо кожне поле класу, для цього конструктори створені
    {
        args = new LinkedList<Double>();
        results = new LinkedList<Double>();
        Random random = new Random(); //окремий метод, але можна і так

        for (int i = 0; i < length; i++) {
            args.add((double) random.nextInt(100));
        }
    }

    //створили два щоб можна було створювати методи, для тестів
    public void SetArgs(double[] args) //метод сугубо для тестів, на екзамені не потрібно тому що там рандомно, а тут з заданих параметрів
    {
        this.args.clear();
        for (int i = 0; i < args.length; i++) {
            this.args.add(args[i]);
        }
    }

    public String Calculate() {
        results.clear();
        int length = args.size();

        for (int i = 0; i < length; i++) {
            results.add(Calculator.Calculate(args.get(i)));
        }

        return results.toString();
    }

    public String GetArgs() {
        return args.toString(); //виводимо аргумент на екран
    }

}
