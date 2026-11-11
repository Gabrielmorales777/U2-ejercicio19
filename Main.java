
public class Main {

    public static void main(String[] args) {

   
        PerfilUsuario usuario = new PerfilUsuario("Gabriel");


        PulseraInteligente pulsera = new PulseraInteligente(usuario);


        System.out.println("REGISTRO DE ACTIVIDAD");

        pulsera.registrarPasos(6000);
        pulsera.registrarPasos(5000);


        usuario.mostrarPerfil();
    }
}

