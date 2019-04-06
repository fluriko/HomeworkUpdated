package mate.academy.hw7.handler;

import mate.academy.hw7.dao.ClientDao;
import mate.academy.hw7.dao.HumanDao;
import mate.academy.hw7.di.Inject;
import mate.academy.hw7.di.Injector;
import mate.academy.hw7.model.Client;
import mate.academy.hw7.model.Human;

import java.util.Scanner;

public class ConsoleHandler {
    @Inject
    private static ClientDao clientDao;

    @Inject
    private static HumanDao humanDao;

    public static void start() throws IllegalAccessException {
        Injector.injectDependency();
        handle();
    }

    private static void handle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - для работы с клиентами, 2 - для работы с людьми, 3 - для выхода");
        int consoleChoice = scanner.nextInt();
        switch (consoleChoice) {
            case 1:
                handleClient(scanner);
                break;
            case 2:
                handleHuman(scanner);
                break;
            case 3:
                System.exit(0);
        }
    }

    private static void handleClient(Scanner scanner) {
        while (true) {
            System.out.println("1 - если вносите клиента, 2 - если получаете клиента, 3 - для выхода");
            int consoleChoice = scanner.nextInt();
            switch (consoleChoice) {
                case 1:
                    addClientInfo(scanner);
                    break;
                case 2:
                    System.out.println(clientDao.get());
                    break;
                case 3:
                    handle();
                    break;
            }
        }
    }

    private static void handleHuman(Scanner scanner) {
        while (true) {
            System.out.println("1 - если вносите человека, 2 - если получаете человека, 3 - для выхода");
            int consoleChoice = scanner.nextInt();
            switch (consoleChoice) {
                case 1:
                    addHumanInfo(scanner);
                    break;
                case 2:
                    System.out.println(humanDao.get());
                    break;
                case 3:
                    handle();
                    break;
            }
        }
    }

    private static void addClientInfo(Scanner scanner) {
        System.out.println("Введите информацию о клиенте");
        System.out.println("Введите имя");
        String name = scanner.next();
        System.out.println("Введите телефон");
        String phone = scanner.next();
        Client client = new Client(name, phone);
        clientDao.save(client);
    }

    private static void addHumanInfo(Scanner scanner) {
        System.out.println("Введите информацию о человеке");
        System.out.println("Введите имя");
        String name = scanner.next();
        System.out.println("Введите возраст");
        String age = scanner.next();
        Human human = new Human(name, age);
        humanDao.save(human);
    }


}

