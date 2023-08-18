package TempChange;

public class Controller {
    
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public void update(){
        view.information();
        String a = view.ans();
        double temp = view.getTemp();


        if(a.equals("celcius")){
            model.setCelcius(temp);
            double ans = model.changeCelcius();
            view.result(ans);

        }else if(a.equals("farheneit")){
            model.setFarheneit(temp);
            double ans = model.changeFarheneit();
            view.result(ans);
        }else{
            System.out.println("Kindly write it correctly");
        }

    }

    
}
