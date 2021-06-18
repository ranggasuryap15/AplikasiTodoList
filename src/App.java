public class App {
    public static String[] model = new String[10]; // ini adalah data si todolist, dan diberi nilai default 10

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        TampilTodoList tampilTodoList = new TampilTodoList();
        tampilTodoList.viewShowTodoList();
    }

    public String input(String info) {
        System.out.print(info + ": ");
        String data = scanner.nextLine(); // apa yang kita ketikkan di input nanti, maka akan masuk ke variable ini
        return data;
    }
}
