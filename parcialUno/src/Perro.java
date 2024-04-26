public class Perro extends Mascota {

    public Perro(String nombre, String fechaNac, double peso, boolean vacunado, Raza raza) {
        super(nombre, fechaNac, peso, vacunado, raza);
    }

    @Override
    public String cuidadosATenerEnCuenta() {
        return "Necesito mucha atencion y cuidado, alimento balanceado y vacunas cada 12 meses.";
    }

    @Override
    public String toString() {
        return "Perro [" + super.toString() + "]";
    }

}
