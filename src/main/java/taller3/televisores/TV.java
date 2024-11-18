package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV = 0;

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        TV.numTV+=1;
    }

    public Marca getMarca(){
        return this.marca;
    }

    public void setMarca(Marca marca){
        this.marca = marca;
    }

    public int getCanal(){
        return this.canal;
    }

    public void setCanal(int canal){
        this.canal = canal;
    }

    public int getPrecio(){
        return this.precio;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public int getVolumen(){
        return this.volumen;
    }

    public void setVolumen(int volumen){
        this.volumen = volumen;
    }

    public Control getControl(){
        return this.control;
    }

    public void setControl(Control control){
        this.control = control;
    }

    static public int getNumTV(){
        return TV.numTV;
    }

    static public void setNumTV(int numTV){
        TV.numTV = numTV;
    }

    public void turnOn(){
        estado = true;
    }

    public void turnOff(){
        estado = false;
    }

    public boolean getEstado(){
        return this.estado;
    }

    public void canalUp(){
        if (canal<120 && estado){
            this.canal +=1;
        }
    }

    public void canalDown(){
        if (this.canal > 1 && this.estado){
            this.canal-=1;
        }
    }

    public void volumenUp(){
        if (this.volumen < 7 && estado){
            this.volumen+=1;
        }
    }

    public void volumenDown(){
        if (volumen > 0 && estado){
            this.volumen-=1;
        }
    }

}
