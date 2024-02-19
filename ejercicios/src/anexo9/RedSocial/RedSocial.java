package anexo9.RedSocial;

import java.util.Arrays;

public class RedSocial {

    private Perfil[] perfiles;
    private Publicacion[] publicaciones;
    private int contadorPerfiles;
    private int contadorPublicaciones;

    public RedSocial() {
        this.perfiles = new Perfil[100];
        this.publicaciones = new Publicacion[100]; 
        this.contadorPerfiles = 0;
        this.contadorPublicaciones = 0;
    }

    public void agregarPerfil(Perfil perfil) {
        if (contadorPerfiles < perfiles.length) {
            perfiles[contadorPerfiles++] = perfil;
            System.out.println("Perfil agregado con éxito: " + perfil.getNombre());
        } else {
            System.out.println("No se puede agregar más perfiles, la lista está llena.");
        }
    }

    public void realizarPublicacion(Perfil perfil, String contenido) {
        if (contadorPublicaciones < publicaciones.length) {
            Publicacion nuevaPublicacion = new Publicacion(perfil, contenido);
            publicaciones[contadorPublicaciones++] = nuevaPublicacion;
            System.out.println("Publicación realizada con éxito por " + perfil.getNombre());
        } else {
            System.out.println("No se puede realizar más publicaciones, la lista está llena.");
        }
    }

    public void imprimirInformacion() {
        System.out.println("----- Información de la Red Social -----");
        System.out.println("Perfiles:");
        for (int i = 0; i < contadorPerfiles; i++) {
            System.out.println(perfiles[i]);
        }
        System.out.println("\nPublicaciones:");
        for (int i = 0; i < contadorPublicaciones; i++) {
            System.out.println(publicaciones[i]);
        }
        System.out.println("--------------------------------------");
    }


    public static void main(String[] args) {
        System.out.println();
        RedSocial redSocial = new RedSocial();

        System.out.println();

        Perfil perfil1 = new Perfil("Usuario1", "NombreReal1");
        System.out.println();

        Perfil perfil2 = new Perfil("Usuario2", "NombreReal2");

        redSocial.agregarPerfil(perfil1);
        System.out.println();

        redSocial.agregarPerfil(perfil2);
        System.out.println();


        redSocial.realizarPublicacion(perfil1, "¡Hola a todos!");
        System.out.println();

        redSocial.realizarPublicacion(perfil2, "Saludos desde la red social.");
        System.out.println();


        redSocial.imprimirInformacion();
    }
}