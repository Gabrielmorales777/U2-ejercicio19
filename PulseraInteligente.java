
public class PulseraInteligente {

    private PerfilUsuario perfil;
    private final int META_DIARIA = 10000;

    public PulseraInteligente(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public void registrarPasos(int cantidad) {

        if (cantidad <= 0) {
            System.out.println("La cantidad de pasos debe ser positiva.");
            return;
        }


        perfil.registrarPasos(cantidad);

        System.out.println("Pasos registrados: " + cantidad);
        System.out.println("Total acumulado: " +
                perfil.getPasosAcumulados());


        if (perfil.getPasosAcumulados() >= META_DIARIA) {

            perfil.otorgarInsignia("Meta de 10.000 pasos");
        }
    }
}
