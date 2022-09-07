import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static User[] users = new User[10];
    public static User currentUser;

    public static void main(String[] args) {
        users[0] = new User("Giyosbek", "giyosbek@mail.ru", "123", "admin");
        users[1] = new User("Botir", "botir@mail.ru", "123", "user");

        boolean a = true;
        while (a) {
            System.out.println(" ========== Welcome ========== \n 1. Login \n 2. Sign In \n 3. Exit");
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    login();
                    break;
                case 2:
                    signIn();
                    break;
                case 3:
                    a = false;
                    break;
                default:
                    System.out.println("Bunday tartib raqamli buyruq yo'q! Qaytadan kiriting!");
                    break;
            }
        }
    }

    private static void signIn() {
        scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        int count = 0;
        for (User user : users) {
            if (user == null) {
                users[count] = new User(name, email, password, "user");
            }
            count++;
        }
        System.out.println("Ro'yxatdan muvaffaqiyatli o'tdingiz!");
    }

    private static void login() {
        while (true) {
            scanner = new Scanner(System.in);
            System.out.print("Email: ");
            String email = scanner.nextLine();
            for (User user : users) {
                if (user.getEmail().equals(email)) {
                    currentUser = user;
                    while (true) {
                        System.out.println("Password: ");
                        String password = scanner.nextLine();
                        if (password.equals(currentUser.getPassword())) {
                            menu();
                        } else {
                            System.out.println("Parol noto'g'ri kiritildi! Qaytadan kiriting! ");
                        }
                    }
                } else {
                    System.out.println("Email noto'g'ri kiritldi! Qaytadan kiriting! ");
                    break;
                }
            }
        }
    }

    private static void menu() {
        System.out.println("Hurmatli " + currentUser.getName() + " online test tizimiga xush kelibsiz!");
        boolean a = true;
        while (a) {
            System.out.println(" ---------------------------------------------------- \n 1. Test topshirish \n 2. Natijalarni ko'rish \n 3. Chiqish");
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    //passTest();
                    break;
                case 2:
                    //viewResults();
                    break;
                case 3:
                    a = false;
            }
        }
    }
}
