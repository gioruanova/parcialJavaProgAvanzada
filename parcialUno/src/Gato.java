public class Gato extends Mascota {

    public Gato(String nombre, String fechaNac, double peso, boolean vacunado, Raza raza) {
        super(nombre, fechaNac, peso, vacunado, raza);
    }

    @Override
    public String cuidadosATenerEnCuenta() {
        return "Necesito poca atencion, alimento especial vacunas cada 1 año.";
    }

    @Override
    public String toString() {
        return "Gato [" + super.toString() + "]";
    }

}
