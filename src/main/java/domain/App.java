package domain;

import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public void run() {
        List<WiseSaying> wiseSayings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("==명언 앱==");

        A : while (true) {
            String command = InputView.getCommand();

            switch (command) {
                case "등록" :
                    WiseSaying wiseSaying = InputView.getWiseSaying();
                    wiseSayings.add(wiseSaying);
                    OutputView.printId(wiseSaying);
                    break;
                case "목록" :
                    OutputView.printWiseSayings(wiseSayings);
                    break;
                case "삭제" :
                    break;
                case "수정" :
                    break;
                case "종료" :
                    System.out.print("명언 앱을 종료합니다.");
                    break A;
                default :
                    System.out.println("잘못된 명령어가 입력되었습니다.");
            }
        }
    }
}