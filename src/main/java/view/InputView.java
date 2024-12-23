package view;

import domain.WiseSaying;

import java.util.Scanner;

public class InputView {
    public static String getCommand() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("명령) ");
        return scanner.nextLine();
    }

    public static WiseSaying getWiseSaying() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("명언 : ");
        String content = scanner.nextLine();

        System.out.print("작가 : ");
        String author = scanner.nextLine();

        return new WiseSaying(author, content);
    }
}
