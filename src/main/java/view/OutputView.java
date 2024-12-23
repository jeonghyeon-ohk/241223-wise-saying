package view;

import domain.WiseSaying;
import java.util.List;

public class OutputView {
    public static void printId(WiseSaying wiseSaying) {
        System.out.println(wiseSaying.getId() + "번 명언이 등록되었습니다.");
    }


}
