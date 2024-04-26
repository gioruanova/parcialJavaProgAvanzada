public class Adoptante {

    private String nombre;
    private String dni;
    private String email;
    private Mascota mascotaAdoptada;
    private String fechaDeAdopcion;

    public Adoptante(String nombre, String dni, String email, String fechaDeAdopcion) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
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

    @Override
    public String toString() {
        return "Adoptante [nombre=" + nombre + ", dni=" + dni + ", email=" + email + ", mascotaAdoptada="
                + mascotaAdoptada + ", fechaDeAdopcion=" + fechaDeAdopcion + "]";
    }

    public boolean test(Veterinaria v, String nombre, Raza raza, String fechaAdopcion) {
        Mascota mascotaEncontrada = v.buscarMascota(nombre, raza);
        if (mascotaEncontrada != null && v.diferenciaMayor60Dias(mascotaEncontrada.getFechaNac(), fechaDeAdopcion)) {
            this.mascotaAdoptada = mascotaEncontrada;
            this.fechaDeAdopcion = fechaAdopcion;

            System.out.println("ERROR");
            return true;

        }
        System.out.println("ERROR");
        return false;
    }

    public boolean adoptar(Veterinaria v, String nombre, Raza raza, String fechaAdopcion) {
        Mascota mascotaEncontrada = v.buscarMascota(nombre, raza);
        if (mascotaEncontrada == null) {
            System.out.println("La mascota no se encontra o ha sido adoptada");
            return false;
        } else if (!(v.diferenciaMayor60Dias(mascotaEncontrada.getFechaNac(), fechaDeAdopcion))) {
            System.out.println("Las fechas no permiten realizar la adopcion");
            return false;
        } else {
            this.mascotaAdoptada = mascotaEncontrada;
            this.fechaDeAdopcion = fechaAdopcion;
            return true;
        }

    }

}
