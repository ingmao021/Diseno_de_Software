import Model.Disco;
import Model.Libro;

public class Main {
    public static void main(String[] args) {
        Disco disco = new Disco();

        disco.setTitulo("Thriller");
        disco.setDuracionMinutos(42.19f);
        disco.setPrecio(25.000);
        System.out.println(disco);


        Libro libro = new Libro();

        libro.setTitulo("El Quijote");
        libro.setAnioPublicacion(1605);
        libro.setNumeroPaginas(863);
        libro.setPrecio(15.000);
        System.out.println(libro);
    }
}