import model.Answer;
import model.Question;
import model.User;
import service.UserService;
import service.impl.UserServiceImpl;

import java.util.*;

public class Runnable {

    public static Scanner scanner = new Scanner(System.in);
    public static List<User> userList = new LinkedList<>();
    public static List<Question> physicsQuestionList = new LinkedList<>();
    public static List<Answer> physicsAnswerList = new LinkedList<>();
    public static User currentUser;

    public static void main(String[] args) {

        initUsers();

        userList.add(new User("Giyosbek", "giyosbek@mail.ru", "123", "admin"));
        userList.add(new User("Botir", "botir@mail.ru", "123", "user"));

        physicsQuestionList.add(new Question(1, "Assalommu aleykum", physicsAnswerList, true, "A"));

        physicsAnswerList.add(new Answer("1", "A, B, C, D", true));
        System.out.println(physicsAnswerList);
        System.out.println(physicsQuestionList);

        boolean a = true;
        while (a) {
            System.out.println(" ========== Welcome ========== \n 1. Login \n 2. Sign In \n 0. Exit");
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 0:
                    a = false;
                    break;
            }
        }
    }

    private static void initUsers() {
        UserService userService = new UserServiceImpl();

        /// TODO: 9/18/2022 Yangi user register qilishda shu service ishlatilsin
        userService.create(new User());

    }

    // Ro'yxatdan o'tish
    private static void register() {
        scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        int count = 0;
        Iterator<User> iterator = userList.iterator();
        // yangi userni listga joylash?

    }

    // Kirish
    private static void login() {
        boolean a = true;
        while (a) {
            scanner = new Scanner(System.in);
            System.out.print("Email: ");
            String email = scanner.nextLine();
            for (User user : userList) {
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

    // Menu
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
                                passTestPhysics();
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

    private static void passTestPhysics() {

    }
}
