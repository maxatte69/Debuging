import java.util.Scanner;

public class Principal {
    static Scanner sc;
    static MZFecha f1;
    static MZFecha f2;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        f1 = new MZFecha();
        f2 = new MZFecha();

        menu();
    }

    public static void menu() {
        boolean salir = false;

        while (salir != true) {
            System.out.print("\n-Introduce un numero-\n"+
                    "1.Set Data\n"+
                    "2.Print Data\n"+
                    "3.Compara Fecha\n"+
                    "4.Salir\n"+
                    "Enter: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    setData();
                    break;
                case 2:
                    printData();
                    break;
                case 3:
                    comparaFecha();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }

    public static void setData() {
        System.out.print("Introduce el dia: ");
        int dia = sc.nextInt();

        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();

        System.out.print("Introduce el año: ");
        int any = sc.nextInt();

        f1.setFecha(dia, mes, any);
    }

    public static void printData() {
        f1.imprime();
    }

    public static void comparaFecha() {
        System.out.print("Introduce el dia: ");
        int dia = sc.nextInt();

        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();

        System.out.print("Introduce el año: ");
        int any = sc.nextInt();

        f2.setFecha(dia, mes, any);

        System.out.println("Hi ha " + f1.diferenciaDias(f2) + " de diferencia");
    }
}


