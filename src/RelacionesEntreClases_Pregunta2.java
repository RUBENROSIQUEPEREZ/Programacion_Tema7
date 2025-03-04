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
        Automovil miAuto = new Automovil();

        //2. Intentamos apagar el motor
        miAuto.apagarMotor();
        // Intentamos encender el motor
        miAuto.encenderMotor();
        // Intentamos encender el motor
        miAuto.encenderMotor();
        // Intentamos apagar el motor
        miAuto.apagarMotor();
    }
}
class Motor{
    private boolean encendido;

    Motor(){
        this.encendido = false; //1. Motor apagado por defecto
    }

    public void encenderMotor(){
        this.encendido =true;
        System.out.println("Motor encendido.");
    }

    public void apagarMotor(){
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

    public void encenderMotor(){
        if (!motor.estaEncendido()){
            motor.encenderMotor();
        } else {
            System.out.println("El motor ya está encendido.");
        }
    }

    public void apagarMotor(){
        if (motor.estaEncendido()){
            motor.apagarMotor();
        } else {
            System.out.println("El motor ya está apagado.");
        }
    }
}
