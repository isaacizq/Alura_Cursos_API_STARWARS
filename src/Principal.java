import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura  = new Scanner(System.in);
        while (true) {
            ConsultaPelicula consulta = new ConsultaPelicula();
            try {
                System.out.println("Escribe el numero de la pelicula de Star wars que quieres: ");
                System.out.println("Si desea salir oprima '0' (cero)");
                var numero = Integer.parseInt(lectura.nextLine());
                if (numero==0){
                    break;
                }
                Pelicula pelicula = consulta.buscarPelicula(numero);
                System.out.println(pelicula);
                GeneradorArchivo archivo = new GeneradorArchivo();
                archivo.GuardarJson(pelicula);
            } catch (NumberFormatException e) {
                System.out.println("Número no encontrado " + e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Finish program");

            }
        }
    }
}
