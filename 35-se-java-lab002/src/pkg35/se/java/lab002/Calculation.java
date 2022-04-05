/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg35.se.java.lab002;


/**
 *
 * @author Win7
 */
public class Calculation {
    public static void KineticEnergy(String MassTela, String SkorostTela)
{
        
        int m = Integer.parseInt(MassTela);//присвоим целому значению, значение строки
        int v = Integer.parseInt(SkorostTela);
        int KEnergy = (m * (v*v))/2;
        System.out.println("Кинетическая энергия тела равна:" +KEnergy);
                System.out.println("Число " + KEnergy + " в двоичной форме: " + 
                                    Integer.toBinaryString(KEnergy));
        
}}