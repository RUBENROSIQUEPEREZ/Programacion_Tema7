import java.util.Objects;

public class Tarea_VehiculoElectrificado {
    static int idVehiculo;
    private String modelo;
    //int ids?
    private String marca;
    private int anyo;
    private Tarea_TipoEV tipoEV;


    Tarea_VehiculoElectrificado(int anyo, String marca, String modelo, Tarea_TipoEV tipoEV) {
        this.anyo = anyo;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoEV = tipoEV;
        idVehiculo++;
    }

    Tarea_VehiculoElectrificado(Tarea_VehiculoElectrificado vehiculo){
        anyo = vehiculo.anyo;
        marca = vehiculo.marca;
        modelo = vehiculo.modelo;
        tipoEV = vehiculo.tipoEV;
        idVehiculo++;
    }
    Tarea_VehiculoElectrificado(){
        anyo = 2001;
        marca = "Lexus";
        modelo = "IS200";
        tipoEV = Tarea_TipoEV.EV;
        idVehiculo++;
    }
    public static int getIdVehiculo() {
        return idVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public boolean equals(Object o){
        if (o == null || getClass() != o.getClass()) return false;
        if (this == o) return true;
        Tarea_VehiculoElectrificado vehiculo = (Tarea_VehiculoElectrificado) o;
        return anyo == vehiculo.anyo && marca.equals(vehiculo.marca) && modelo.equals(vehiculo.modelo) && tipoEV == vehiculo.tipoEV;
    }

    public void setAnyo (int anyo){
        this.anyo = anyo;
    }

    public void setIdVehiculo(int idVehiculo) {
        Tarea_VehiculoElectrificado.idVehiculo = idVehiculo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, anyo, tipoEV);
    }

    public Tarea_TipoEV getTipoEV() {
        return tipoEV;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setTipoEV(Tarea_TipoEV tipoEV) {
        this.tipoEV = tipoEV;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnyo() {
        return anyo;
    }

    @Override
    public String toString(){
        return "Vehiculo Electrificado{marca="+marca+", modelo="+modelo+", anyo="+anyo+", tipoEV="+tipoEV+"}";
    }
}
