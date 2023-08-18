package TempChange;

import java.util.Scanner;

public class View {
    private Scanner scn;

    public View(){
        scn = new Scanner(System.in);
    }

    

    public void information(){
        System.out.println("You want to choose celcius or farheneit?");
    }

    public String ans(){

        return scn.next();
    }

    public double getTemp(){
        System.out.println("Enter Temp: ");
        return scn.nextDouble();
    }

    public void result(double res){
        System.out.println("The ans is " + res);
    }
}
