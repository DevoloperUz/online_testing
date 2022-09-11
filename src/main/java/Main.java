import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static User[] users = new User[10];
    public static Subject[] subjects = new Subject[10];
    public static Question[] questions = new Question[10];
    public static Answer[] answers = new Answer[10];
    public static Result[] results = new Result[10];
    public static List<Question> physics = new ArrayList<>();
    public static List<Question> programming = new ArrayList<>();
    public static User currentUser;
    // public static List<User> userList = new ArrayList<>();

    public static void main(String[] args) {



        //physics.add(1,);

        users[0] = new User("Giyosbek", "giyosbek@mail.ru", "123", "admin");
        users[1] = new User("Botir", "botir@mail.ru", "123", "user");

       // subjects[0] = new Subject(1, "Fizika", )
/*

        userList.add(0, new User("Giyosbek", "giyosbek@mail.ru", "123", "admin"));  // listlar bn ishlashda muammo?
        userList.add(1, new User("Muhiddin", "muhiddin@mail.ru", "123", "user"));
        Iterator<User> iterator = userList.iterator();

*/

        boolean a = true;
        while (a) {
            System.out.println(" ========== Welcome ========== \n 1. Login \n 2. Sign In \n 0. Exit");
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    login();
                    break;
                case 2:
                    signIn();
                    break;
                case 0:
                    a = false;
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
                users[count] = new User(name, email, password, "user");   // ??? arrayga joylashda yangi userni muammo bor
            }
            count++;
        }
        System.out.println("Ro'yxatdan muvaffaqiyatli o'tdingiz!");
    }

    private static void login() {
        boolean a = true;
        while (a) {
            scanner = new Scanner(System.in);
            System.out.print("Email: ");
            String email = scanner.nextLine();
            for (User user : users) {
                if (user.getEmail().equals(email)) {
                    currentUser = user;
                    boolean b = true;
                    while (b) {
                        System.out.print("Password: ");
                        String password = scanner.nextLine();
                        if (password.equals(currentUser.getPassword())) {
                            menu();
                        } else {
                            System.out.println("Parol noto'g'ri kiritildi! Qaytadan kiriting! ");
                        }
                        b = false;
                    }
                } else {
                    System.out.println("Email noto'g'ri kiritldi! Qaytadan kiriting! "); // Exit qilishda shu yerda muammo bor?
                    break;
                }
            }
            a = false;
        }
    }

    private static void menu() {
        System.out.println("Hurmatli " + currentUser.getName() + " online test tizimiga xush kelibsiz!");
        boolean a = true;
        while (a) {
            System.out.println("----------------------------------------------------- \n 1. Test topshirish \n 2. Natijalarni ko'rish \n 0. Chiqish");
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    boolean b = true;
                    while (b) {
                        System.out.println(" Qaysi fandan test topshirmoqchisiz? \n 1. Fizika \n 2. Dasturlash \n 0. Exit");
                        int n = scanner.nextInt();
                        switch (n) {
                            case 1:
                               // passTestPhysics();
                                break;
                            case 2:
                               // passTestProgramming();
                                break;
                            case 0:
                                b = false;
                        }
                    }
                    break;
                case 2:
                    System.out.println("bala bla bla");
                    //viewResults();
                    break;
                case 0:
                    a = false;
            }
        }
    }
}
