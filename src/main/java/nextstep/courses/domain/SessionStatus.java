package nextstep.courses.domain;

public enum SessionStatus {

    WAITING("준비중"),
    OPEN("모집중"),
    CLOSE("종료");

    private String name;

    SessionStatus(String name) {
        this.name = name;
    }
}
