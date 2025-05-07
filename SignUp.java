import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro
        Scanner scanner = new Scanner(System.in);
        //Los datos que debes pedir al usuario son:
        //1. Nombre
        System.out.println("Hola, ¿Cómo te llamas?");
        String name = scanner.nextLine();

        //2. Apellido
        System.out.println("¿Su apellido?");
        String lastName = scanner.nextLine();

        //3. Nombre de usuario
        System.out.println("¿Su nombre de usuario?");
        String username = scanner.nextLine();

        //4. Contraseña
        System.out.println("¿Su contraseña?");
        String password = scanner.nextLine();
        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta

        System.out.println("Hola " + name + " " + lastName + ", tu nombre de usuario es " + username + " y tu contraseña es " + password + ", gracias por registrarte.");
        scanner.close();
    }
}