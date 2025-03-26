public class T_PHEV extends T_VehiculoElectrificado{
    private int potenciaCombinada;

    public T_PHEV (String marca, String modelo, int anyo, int idVehiculo, T_TipoEV tipoEV, int potenciaCombinada){
        super(marca, modelo, anyo, idVehiculo, tipoEV);
        this.potenciaCombinada = potenciaCombinada;
    }

    public int getPotenciaCombinada (){
        return potenciaCombinada;
    }

    public void setPotenciaCombinada(int potenciaCombinada){
        this.potenciaCombinada = potenciaCombinada;
    }


    @Override
    public String toString(){
        return super.toString() + ", Potencia Combinada: " + potenciaCombinada + " KW";
    }
}
