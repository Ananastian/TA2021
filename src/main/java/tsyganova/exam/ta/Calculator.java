/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsyganova.exam.ta;

import static java.lang.Math.pow;

/**
 *
 * @author Admin
 */
public class Calculator {
    
    public static double Calculate(double x)
    {
        return pow(x,3)+(3*pow(x,2))-(72*x)+90; //Сюди вставлять свою формувалу
    }
}
