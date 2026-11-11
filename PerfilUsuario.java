
import java.util.ArrayList;
import java.util.List;

public class PerfilUsuario {

    private String nombre;
    private int pasosAcumulados;
    private List<String> insigniasObtenidas;

    public PerfilUsuario(String nombre) {
        this.nombre = nombre;
        this.pasosAcumulados = 0;
        this.insigniasObtenidas = new ArrayList<>();
    }

    public void registrarPasos(int cantidad) {
        pasosAcumulados += cantidad;
    }

    public void otorgarInsignia(String nombreInsignia) {
        if (!insigniasObtenidas.contains(nombreInsignia)) {
            insigniasObtenidas.add(nombreInsignia);
            System.out.println("¡Nueva insignia obtenida: " + nombreInsignia + "!");
        }
    }

    public int getPasosAcumulados() {
        return pasosAcumulados;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getInsigniasObtenidas() {
        return insigniasObtenidas;
    }

    public void mostrarPerfil() {
        System.out.println("\n--- PERFIL DEL USUARIO ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Pasos acumulados: " + pasosAcumulados);
        System.out.println("Insignias obtenidas: " + insigniasObtenidas);
    }
}
