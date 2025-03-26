public abstract class Tarea_Concesionario {
    private String nombre;
    private String localizacion;
    private Tarea_VehiculoElectrificado[] coches;
    private int indice;

    Tarea_Concesionario(String nombre, String localizacion){
        this.nombre = nombre;
        this.localizacion = localizacion;
        coches = new Tarea_VehiculoElectrificado[10];
        indice = 0;
    }

    Tarea_Concesionario (Tarea_Concesionario concesionario){
        nombre = concesionario.nombre;
        localizacion = concesionario.localizacion;
        coches = concesionario.coches;
        indice = concesionario.indice;
    }

    Tarea_Concesionario (){
        nombre = "Concesionario";
        localizacion = "Localizacion";
        coches = new Tarea_VehiculoElectrificado[10];
        indice = 0;
    }
/*
    public String toString(){

    }*/

    void setNombre (String nombre){
        this.nombre = nombre;
    }
    //hascode

    String getNombre (){
        return nombre;
    }

    void añadirCoches (Tarea_VehiculoElectrificado coche){
        if (indice < coches.length){
            coches[indice] = coche;
            indice++;
        }
    }

    public Tarea_VehiculoElectrificado[] mostrarCoches() {
        return coches;
    }

    //equals


    public String getLocalizacion() {
        return localizacion;
    }

    public int getIndice() {
        return indice;
    } //numero de coches?

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
}
