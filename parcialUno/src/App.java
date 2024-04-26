public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n------ARRANCA PROGRAMA------");

        Veterinaria v1 = Veterinaria.getInstance();
        Adoptante adoptante1 = new Adoptante("Fernando", "33444888", "email123@davinci.edu.ar", "2024-01-15");
        Adoptante adoptante2 = new Adoptante("Jorge", "30456456", "jorge@davinci.edu.ar", "2024-01-15");

        Mascota mascota1 = new Perro("Max", "2023-07-22", 10.5, true, Raza.PASTOR_ALEMAN);
        Mascota mascota2 = new Perro("Coco", "2023-04-25", 15, false, Raza.GOLDEN_RETRIEVER);
        Mascota mascota3 = new Perro("Lulu", "2024-08-07", 7.0, true, Raza.LABRADOR_RETRIEVER);
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

        v1.registrarAdoptante(adoptante1);
        v1.registrarAdoptante(adoptante2);
        v1.registrarAdoptante(adoptante1);

        System.out.println("\n-----------\n");

        // Adopcion primer mascota con un adoptante
        adoptar(v1, adoptante1, mascota1);
        v1.mostrarTicketAdopcion(adoptante1.getMascotaAdoptada(), adoptante1);

        // Adopcion mascota cuyas fechas no lo permiten
        adoptar(v1, adoptante2, mascota3);
        v1.mostrarTicketAdopcion(adoptante2.getMascotaAdoptada(), adoptante2);

    }

    public static void adoptar(Veterinaria v, Adoptante adoptante, Mascota mascota) {
        adoptante.adoptar(v, mascota.getNombre(), mascota.getRaza(), adoptante.getFechaDeAdopcion());
    }
}
