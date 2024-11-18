package taller3.televisores;

public class Control {
    private TV tv;
    public void turnOn(){
        tv.turnOn();
    }
    public void turnOff(){
        tv.turnOff();
    }
    public void canalUp(){
        tv.canalUp();
    }
    public void canalDown(){
        tv.canalDown();
    }
    public void volumenUp(){
        tv.canalUp();
    }
    public void volumenDown(){
        tv.canalDown();
    }

    public void setCanal(int canal){
        if (canal>=1 && canal<=120){
            while (tv.getCanal()!=canal){
                if (tv.getCanal()>canal){
                    tv.canalDown();
                }
                if (tv.getCanal()<canal){
                    tv.canalUp();
                }
            }
        }
    }

    public void enlazar(TV tvObjetivo){
        this.tv = tvObjetivo;
        tvObjetivo.setControl(this);
    }

    public void setTv(TV tv){
        this.tv = tv;
    }

    public TV getTv(){
        return this.tv;
    }
}
