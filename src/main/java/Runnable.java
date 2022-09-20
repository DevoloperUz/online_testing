import model.Answer;
import model.Question;
import model.User;
import model.enums.RoleEnum;
import repository.UserRepository;
import service.UserService;
import service.impl.UserServiceImpl;

import java.util.*;

public class Runnable {
    public static Scanner scanner = new Scanner(System.in);
    public static User currentUser;
    public UserRepository userRepository = new UserRepository();

    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        userService.create(new User("G'iyosbek", "giyos@mail.ru", "123", RoleEnum.ADMIN));
        userService.create(new User("Botir", "botir@mail.ru", "123", RoleEnum.STUDENT));
        userService.create(new User("Bobur", "bobur@mail.ru", "123", RoleEnum.TEACHER));
        userService.create(new User("Muhiddin", "muhiddin@mail.ru", "123", RoleEnum.MODERATOR));
        userService.create(new User("Hamza", "hamza@mail.ru", "123", RoleEnum.DIRECTOR));

        boolean a = true;
        while (a) {
            System.out.println(" ========== Welcome ========== \n 1. Login \n 2. Register \n 0. Exit");
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    //login();
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
    // Ro'yxatdan o'tish
    private static void register() {
        UserService userService = new UserServiceImpl();

        scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        userService.create(new User(name, email, password, RoleEnum.STUDENT));
    }
    // Kirish
   /* private static void login() {
        boolean a = true;
        while (a) {
            scanner = new Scanner(System.in);
            System.out.print("Email: ");
            String email = scanner.nextLine();
            for (User user : userRe) {
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
    }*/
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
                    System.out.println("bla bla bla");
                    //viewResults();
                    break;
                case 0:
                    a = false;
            }
        }
    }

}
