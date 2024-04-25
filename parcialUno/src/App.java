public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n------ARRANCA PROGRAMA------");

        Veterinaria v1 = Veterinaria.getInstance();
        Adoptante adoptante1 = new Adoptante("Fernando", "33444888", "email123@davinci.edu.ar", "2024-01-15");

        Mascota mascota1 = new Perro("Max", "2023-07-22", 10.5, true, Raza.PASTOR_ALEMAN);
        Mascota mascota2 = new Perro("Coco", "2023-09-09", 15, false, Raza.GOLDEN_RETRIEVER);
        Mascota mascota3 = new Perro("Lulu", "2023-08-07", 7.0, true, Raza.LABRADOR_RETRIEVER);
        Mascota mascota4 = new Perro("Lulu", "2023-08-07", 7.0, true, Raza.LABRADOR_RETRIEVER);
        Mascota mascota5 = new Gato("Garfield", "2023-10-25", 6.0, true, Raza.PERSA);
        Mascota mascota6 = new Gato("Chimi", "2023-12-01", 4.0, false, Raza.SIAMES);
        Mascota mascota7 = new Gato("Chimi", "2023-12-01", 4.0, false, Raza.SIAMES);

        v1.registrarMascota(mascota1);
        v1.registrarMascota(mascota2);
        v1.registrarMascota(mascota3);
        v1.registrarMascota(mascota4);
        v1.registrarMascota(mascota5);
        v1.registrarMascota(mascota6);
        v1.registrarMascota(mascota7);
        System.out.println("\n-----------\n");
        System.out.println("\n-----------\n");
        v1.registrarAdoptante(adoptante1);
        v1.registrarAdoptante(adoptante1);
        System.out.println(adoptante1.getNombre());
        System.out.println("\n-----------\n");
        System.out.println("\n-----------\n");

        // v1.registrarAdoptante(adoptante1);

        // adoptar(v1, adoptante1, mascota2);

        // v1.mostrarTickerAdopcion(adoptante1.getMascotaAdoptada(), adoptante1);

        v1.mostrarMascotasRegistradas();

        System.out.println("\n------FIN PROGRAMA------\n");
    }

    public static void adoptar(Veterinaria v, Adoptante adoptante, Mascota mascota) {
        adoptante.adoptar(v, mascota.getNombre(), mascota.getRaza(), adoptante.getFechaDeAdopcion());
    }
}
