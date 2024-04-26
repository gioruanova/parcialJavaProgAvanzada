import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Veterinaria implements Mostrable {

    private static Veterinaria vetInstance;
    private String nombre = "Pet love";
    private final String CUIT = "30-12345678-9";
    private List<Mascota> mascotas;
    private List<Adoptante> adoptantes;

    // Completar atributos faltantes

    private Veterinaria() {
        this.mascotas = new ArrayList<>();
        this.adoptantes = new ArrayList<>();

    }

    public static Veterinaria getInstance() {
        if (vetInstance == null) {
            vetInstance = new Veterinaria();
        }
        return vetInstance;
    }

    @Override
    public void mostrarTicketAdopcion(Mascota m, Adoptante a) {

        if(m != null){
            Adoptante adoptante = this.buscarAdoptante(a.getDni());
            Mascota mascota = this.buscarMascota(m.getNombre(), m.getRaza());

            System.out.println("-----------------------------------------------------");
            System.out.println("\t\tTICKET DE ADOPCION");
            System.out.println("-----------------------------------------------------");
            System.out.println("Fecha de adopcion: " + a.getFechaDeAdopcion() + "\n");
            System.out.println("Datos del Adoptante:");
            System.out.println("Nombre: " + adoptante.getNombre());
            System.out.println("DNI: " + adoptante.getDni());
            System.out.println("Email: " + adoptante.getEmail() + "\n");
            System.out.println("Datos de la Mascota:");
            System.out.println("Nombre: " + mascota.getNombre());
            System.out.println("Fecha de nacimiento: " + mascota.getFechaNac());
            System.out.println("Tipo: " + mascota.getClass().getSimpleName());
            System.out.println("Raza: " + mascota.getRaza());
            System.out.println("Peso: " + mascota.getPeso());
            System.out.println("Recomendaciones: " + mascota.cuidadosATenerEnCuenta() + "\n");
            System.out.println("Datos de la Veterinaria: ");
            System.out.println("Nombre: " + this.getNombre());
            System.out.println("Cuit: " + CUIT);
            System.out.println("-----------------------------------------------------");
            System.out.println("\tGRACIAS POR ADOPTAR A UNA MASCOTA!! :)");
            System.out.println("-----------------------------------------------------");
        }



        /*
         * Muestro todo lo relacionado al ticker de adopcion
         */

    }

    public String getNombre() {
        return nombre;
    }

    // METODOS PARA LAS MASCOTAS
    private boolean validadorMascota(Mascota masc) {
        if (mascotas.size() == 0) {
            this.mascotas.add(masc);
            return true;
        } else {
            boolean mascotaEncontrada = false;

            for (Mascota m : mascotas) {
                if (m.getNombre().equals(masc.getNombre()) && m.getRaza().equals(masc.getRaza())) {
                    mascotaEncontrada = true;
                    break;
                }
            }

            if (!mascotaEncontrada) {
                this.mascotas.add(masc);
                return true;
            } else {
                return false;
            }
        }
    }

    public void registrarMascota(Mascota mascota) {
        if (validadorMascota(mascota)) {
            System.out.println("La mascota " + mascota.getNombre() + " se agrego a la veterinaria.");
        } else {
            System.out.println("La mascota " + mascota.getNombre() + " ya estaba registrada.");
        }
    }

    public Mascota buscarMascota(String nombre, Raza raza) {
        for (Mascota mascota : mascotas) {
            if (mascota.getNombre().equals(nombre) && mascota.getRaza().equals(raza)) {
                return mascota;
            }
        }
        return null;
    }

    // Metodo para mostrar mascotas registradas
    public void mostrarMascotasRegistradas() {
        for (Mascota mascota : mascotas) {
            System.out.println(mascota.toString());
        }
    }

    // =======================================================
    // METODOS PARA EL ADOPTANTE
    private boolean validadorAdoptante(Adoptante adoptanteNuevo) {
        if (adoptantes.size() == 0) {
            this.adoptantes.add(adoptanteNuevo);
            return true;
        } else {
            boolean adoptanteEncontrado = false;

            for (Adoptante a : adoptantes) {
                if (a.getDni().equals(adoptanteNuevo.getDni())) {
                    adoptanteEncontrado = true;
                    break;
                }
            }

            if (!adoptanteEncontrado) {
                this.adoptantes.add(adoptanteNuevo);
                return true;
            } else {
                return false;
            }
        }
    }

    public void registrarAdoptante(Adoptante adoptanteNuevo) {
        if (validadorAdoptante(adoptanteNuevo)) {
            System.out.println("El adoptante " + adoptanteNuevo.getNombre() + " se agrego a la veterinaria.");
        } else {
            System.out.println("El adoptante " + adoptanteNuevo.getNombre() + " ya estaba registrado en la veterinaria.");
        }
    }

    private Adoptante buscarAdoptante(String dni) {

        for (Adoptante adoptante : adoptantes) {
            if (adoptante.getDni().equals(dni)) {
                return adoptante;
            }
        }
        return null;
    }

    // Metodo para mostrar adoptantes registradas
    public void mostrarAdoptantesRegistradas() {
        for (Adoptante adoptante : adoptantes) {
            System.out.println(adoptante.toString());
        }
    }

    // ===============================================
    // METODOS VARIOS

    public boolean diferenciaMayor60Dias(String fechaString1, String fechaString2) {
        LocalDate fecha1 = LocalDate.parse(fechaString1, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate fecha2 = LocalDate.parse(fechaString2, DateTimeFormatter.ISO_LOCAL_DATE);

        long diferenciaEnDias = ChronoUnit.DAYS.between(fecha1, fecha2);

        return diferenciaEnDias > 60;
    }

    public void cambiarEstadoMascota(Mascota mascota) {
        for (Adoptante adoptante : adoptantes) {
            System.out.println(adoptante.toString());
        }
    }

}
