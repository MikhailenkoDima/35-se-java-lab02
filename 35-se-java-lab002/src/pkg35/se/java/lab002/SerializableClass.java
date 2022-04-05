/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg35.se.java.lab002;

import java.io.Serializable;

/**
 *
 * @author Win7
 */
public class SerializableClass implements Serializable {

    private static final long serialVersionUID = 1L;

    private String MassTela;
    private transient String SkorostTela;//transient поле используется для исключения обькта, который не должен быть сохранён
    
public SerializableClass(String MassTela, String SkorostTela) {
        this.MassTela = MassTela;
        this.SkorostTela = SkorostTela;
    }  


    public String getMassTela() {
        return MassTela;
    }

    public void getMassTela(String MassTela) {
        this.MassTela = MassTela;
    }

    public String getSkorostTela() {
        return SkorostTela;
    }

    public void getSkorostTela(String SkorostTela) {
        this.SkorostTela = SkorostTela;
    }
    @Override
    public String toString() {
        return "Прошлые данные{"
                + "Маса тела= " + (MassTela)
                + ", скорость тела= " + (SkorostTela)
                + '}';
    }
}
