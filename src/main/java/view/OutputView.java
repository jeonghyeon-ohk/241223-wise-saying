package view;

import domain.WiseSaying;
import java.util.List;

public class OutputView {
    public static void printId(WiseSaying wiseSaying) {
        System.out.println(wiseSaying.getId() + "번 명언이 등록되었습니다.");
    }
    public static void printWiseSayings(List<WiseSaying> wiseSayings) {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("----------------------");

        for(int i=wiseSayings.size()-1; i>=0; i--){
            WiseSaying wiseSaying = wiseSayings.get(i);

            System.out.println(wiseSaying.getId() + " / "
                    + wiseSaying.getAuthor() + " / " + wiseSaying.getContent());
        }
    }
}
