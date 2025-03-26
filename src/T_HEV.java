public class T_HEV extends T_VehiculoElectrificado {
    private int voltaje;

    public T_HEV (int anyo, String marca, String modelo, int idVehiculo, T_TipoEV tipoEV, int voltaje) {
        super(marca, modelo, anyo, idVehiculo, tipoEV);
        setVoltaje(voltaje);
    }
    T_HEV (T_HEV copia) {
        super(copia);
        this.voltaje = copia.voltaje;
    }
    //Constructor por defecto
    T_HEV () {
        super();
        this.voltaje = 12 ;
    }

    //getters
    public int getVoltaje () {
        return voltaje;
    }

    //setters
    public void setVoltaje (int voltaje) {
        if (voltaje == 12 || voltaje == 48 ){
            this.voltaje = voltaje;
        }else {
            System.out.println("El voltaje introducido no es correcto");
        }
    }

    @Override

    public String toString(){
        return super.toString() + "voltaje=" + voltaje ;
    }
}
