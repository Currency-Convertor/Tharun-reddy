package cConverter;

public class CcurrencyCov {

    double er = 0;

public CcurrencyCov(double todayRate) {
    er = todayRate;
}
    public double EurToYen(double Eury){
        double yen = 0;
        yen = Eury*er;
        return yen;
    }
    public double EurToPound(double Eurp){
        double pound = 0;
        pound = Eurp/er;
        return pound;
    }
    public double EurToCad(double Eurc){
        double cad = 0;
        cad = Eurc*er;
        return cad;
    }
    public double YenToDollar(double Yend){
        double dollar = 0;
        dollar = Yend*er;
        return dollar;
    }
    public double YenToInr(double Yeni){
        double inr = 0;
        inr = Yeni*er;
        return inr;
    }
    public double YenToEuro(double Yene){
        double euro = 0;
        euro = Yene*er;
        return euro;
    }
}






