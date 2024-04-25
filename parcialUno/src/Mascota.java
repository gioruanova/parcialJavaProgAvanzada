import java.util.Objects;

public abstract class Mascota  {

    private String nombre;
    private String fechaNac;
    private double peso;
    private boolean vacunado;
    private Raza raza;
    // Completar

    public Mascota(String nombre, String fechaNac, double peso, boolean vacunado, Raza raza) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.peso = peso;
        this.vacunado = vacunado;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public double getPeso() {
        return peso;
    }

    public Raza getRaza() {
        return raza;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public abstract String cuidadosATenerEnCuenta();

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Mascota mascota = (Mascota) o;
        return this.nombre == mascota.getNombre() && this.raza == mascota.getRaza();
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, raza);
    }

    @Override
    public String toString() {
        return "Mascota [nombre=" + nombre + ", fechaNac=" + fechaNac + ", peso=" + peso + ", vacunado=" + vacunado
                + ", raza=" + raza + "]";
    }

    

}
