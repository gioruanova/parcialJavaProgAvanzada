public class Adoptante {

    private String nombre;
    private String dni;
    private String email;
    private Mascota mascotaAdoptada;
    private String fechaDeAdopcion;

    public Adoptante(String nombre, String dni, String email, Mascota mascotaAdoptada, String fechaDeAdopcion) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.mascotaAdoptada = mascotaAdoptada;
        this.fechaDeAdopcion = fechaDeAdopcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaDeAdopcion() {
        return fechaDeAdopcion;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public Mascota getMascotaAdoptada() {
        return mascotaAdoptada;
    }

    public boolean adoptar(Veterinaria v, String nombre, Raza raza, String fechaAdopcion) {
        // Completar
        System.out.println("funcion adoptar return true >>> ACTUALIZAR <<<");
        return true;
    }

}
