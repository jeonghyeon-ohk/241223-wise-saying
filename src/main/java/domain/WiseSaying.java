package domain;

public class WiseSaying {
    static int lastNo = 0;
    int id;
    private String content;
    private String author;

    public WiseSaying(String author, String content) {
        this.author = author;
        this.content = content;
        id = ++lastNo; // 데이터 생성 시 id 번호 갱신
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }
}