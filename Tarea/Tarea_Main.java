public class Tarea_Main {
    public static void main (String []args){
        Tarea_VehiculoElectrificado vehiculo1 = new Tarea_VehiculoElectrificado(2021, "Tesla", "Model S", Tarea_TipoEV.PHEV);
        Tarea_VehiculoElectrificado vehiculo2 = new Tarea_VehiculoElectrificado(vehiculo1);
        System.out.println(vehiculo1 + "\n" + vehiculo2);

        System.out.println(vehiculo1.equals(vehiculo2));
    }
}
