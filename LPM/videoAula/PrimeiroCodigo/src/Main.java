import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!4");
        
        Scanner scan = new Scanner(System.in);//erro pq não foi importado, então tem que importar, use quick fix para importar
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name);
        scan.close();
    }
}
