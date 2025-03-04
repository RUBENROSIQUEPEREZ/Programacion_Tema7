/*
Sistema de Control de Automóvil en Java
Objetivo: Desarrollar un programa en Java que modele un automóvil y su motor utilizando la relación de composición, demostrando así la dependencia fuerte entre ambos componentes.

Requisitos:

Clase Motor:

Atributos: encendido (boolean) para indicar el estado del motor (encendido/apagado).
Constructor que inicialice el motor como apagado.
Métodos:
encender(): Cambia el estado del motor a encendido y muestra un mensaje.
apagar(): Cambia el estado del motor a apagado y muestra un mensaje.
estaEncendido(): Retorna el estado actual del motor (encendido/apagado).

Clase Automovil:

Atributo: Un objeto de la clase Motor.
Constructor que inicializa el objeto Motor.
Métodos:
encenderMotor(): Enciende el motor si está apagado; de lo contrario, muestra un mensaje indicando que el motor ya está encendido.
apagarMotor(): Apaga el motor si está encendido; de lo contrario, muestra un mensaje indicando que el motor ya está apagado.
Consideraciones:

La relación entre las clases Motor y Automovil debe ser de composición.
Asegúrate de que el código esté bien organizado, comentado adecuadamente y siga las buenas prácticas de la programación orientada a objetos.
 */

public class RelacionesEntreClases_Pregunta2 {
    public static void main (String []args){
        Automovil miAuto = new Automovil(); //Llamamos a los metodos de la clase Automovil

        //2. Intentamos apagar el motor
        miAuto.apagarMotor();
        //4. Intentamos encender el motor
        miAuto.encenderMotor();
        //6. Intentamos encender el motor
        miAuto.encenderMotor();
        //8. Intentamos apagar el motor
        miAuto.apagarMotor();
    }
}
class Motor{
    private boolean encendido;

    Motor(){
        this.encendido = false; //1. Motor apagado por defecto
    }

    public void encender(){
        this.encendido =true;
        System.out.println("Motor encendido.");
    }

    public void apagar(){
        this.encendido = false;
        System.out.println("Motor apagado.");
    }
    public boolean estaEncendido(){

        return this.encendido;
    }
}
class Automovil{
    private Motor motor;

    Automovil(){
        this.motor = new Motor();
    }

    //5. motor.estaEncendido() retorna false, por lo que se ejecuta el if
    //7. motor.estaEncendido() retorna true, por lo que se ejecuta el else
    public void encenderMotor(){
        if (!motor.estaEncendido()){
            motor.encender();
        } else {
            System.out.println("El motor ya está encendido.");
        }
    }

    //3. motor.estaEncendido() retorna true, pero como este devuelve un false (Ya que está apagado), se ejecuta el else
    //9. motor.estaEncendido() retorna false, por lo que se ejecuta el if
    public void apagarMotor(){
        if (motor.estaEncendido()){
            motor.apagar();
        } else {
            System.out.println("El motor ya está apagado.");
        }
    }
}
