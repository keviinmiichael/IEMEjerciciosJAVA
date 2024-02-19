package anexo9;

import java.util.Random;

public class SuscripcionGimnasio {

    private String name;
    private int age;
    private Boolean state;
    private String subscriptionCode;

    public SuscripcionGimnasio(String name, int age, Boolean state) {
        this.name = name;
        this.age = age;
        this.state = state;
        this.subscriptionCode = generarCodigoSuscripcion();
    }

    private String generarCodigoSuscripcion() {
        Random random = new Random();
        return "SUS" + random.nextInt(1000);
    }

    public void renovarSuscripcion() {
        System.out.println("Suscripción renovada para " + name);
        state = true;  
    }

    public void revocarSuscripcion() {
        System.out.println("Suscripción revocada para " + name);
        state = false;
    }

    public boolean verificarAccesoGimnasio() {
        return state;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSubscriptionCode() {
        return subscriptionCode;
    }

    public static void main(String[] args) {
        // Ejemplo de uso en el programa principal
        SuscripcionGimnasio suscripcion = new SuscripcionGimnasio("Cliente1", 25, true);

        // Renovar suscripción
        suscripcion.renovarSuscripcion();

        // Verificar acceso al gimnasio
        if (suscripcion.verificarAccesoGimnasio()) {
            System.out.println(suscripcion.getName() + " tiene acceso al gimnasio");
        } else {
            System.out.println(suscripcion.getName() + " no tiene acceso al gimnasio");
        }
    }
}
