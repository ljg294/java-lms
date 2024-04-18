package nextstep.courses.domain.code;

public enum EnrollStatus {

    READY,
    OPEN,
    CLOSED;

    public boolean isOpen() {
        return this.equals(OPEN);
    }
}
