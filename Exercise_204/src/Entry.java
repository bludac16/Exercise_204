
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwimm
 */
public class Entry {
    private String name;
    private int ak;
    private LocalDate in;
    private double nd;
    private double ndBis;
    private double afaBisher;
    private double wertAfa;
    private double afaDJ;
    private double wert;

    public Entry(String name, int ak, LocalDate in, double nd, double ndBis, double afaBisher, double wertAfa, double afaDJ, double wert) {
        this.name = name;
        this.ak = ak;
        this.in = in;
        this.nd = nd;
        this.ndBis = ndBis;
        this.afaBisher = afaBisher;
        this.wertAfa = wertAfa;
        this.afaDJ = afaDJ;
        this.wert = wert;
    }

    public String getName() {
        return name;
    }

    public int getAk() {
        return ak;
    }

    public LocalDate getIn() {
        return in;
    }

    public double getNd() {
        return nd;
    }

    public double getNdBis() {
        return ndBis;
    }

    public double getAfaBisher() {
        return afaBisher;
    }

    public double getWertAfa() {
        return wertAfa;
    }

    public double getAfaDJ() {
        return afaDJ;
    }

    public double getWert() {
        return wert;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAk(int ak) {
        this.ak = ak;
    }

    public void setIn(LocalDate in) {
        this.in = in;
    }

    public void setNd(double nd) {
        this.nd = nd;
    }

    public void setNdBis(double ndBis) {
        this.ndBis = ndBis;
    }

    public void setAfaBisher(double afaBisher) {
        this.afaBisher = afaBisher;
    }

    public void setWertAfa(double wertAfa) {
        this.wertAfa = wertAfa;
    }

    public void setAfaDJ(double afaDJ) {
        this.afaDJ = afaDJ;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }
    
    
}
