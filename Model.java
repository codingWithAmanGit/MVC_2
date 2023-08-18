package TempChange;

public class Model {
    
    private double celcius;
    private double farheneit;


    public Model() {
        celcius = 0;
        farheneit = 0;
    }


    public double getCelcius() {
        return celcius;
    }


    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }


    public double getFarheneit() {
        return farheneit;
    }


    public void setFarheneit(double farheneit) {
        this.farheneit = farheneit;
    }

    public double changeCelcius(){
        return (celcius* 9/5) + 32;
    }

    public double changeFarheneit(){

        return (farheneit - 32) * 5/9;
    }

    
}
