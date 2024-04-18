package nextstep.courses.domain;

import nextstep.courses.domain.code.EnrollStatus;
import nextstep.courses.exception.AlreadyEnrolledException;
import nextstep.users.domain.NsUser;

public class Enrollment {

    private EnrollStatus status;
    private Students students;
    private int capacity;


    public Enrollment(int capacity) {
        this(EnrollStatus.READY, new Students(), capacity);
    }

    public Enrollment(EnrollStatus status,
                      Students students,
                      int capacity) {
        this.status = status;
        this.students = students;
        this.capacity = capacity;
    }

    public void enroll(NsUser student) throws AlreadyEnrolledException {

        validateSessionOpen();
        validateSessionFull();

        students.add(student);

        if(full()) {
            close();
        }
    }

    private void validateSessionOpen() {
        if(!status.isOpen()) {
            throw new IllegalArgumentException("강의가 모집중인 상태가 아닙니다.");
        }
    }

    private void validateSessionFull() {
        if(full()) {
            throw new IllegalArgumentException("강의 제한인원이 초과 되었습니다.");
        }
    }

    public void open() {
        status = EnrollStatus.OPEN;
    }

    public void close() {
        status = EnrollStatus.CLOSED;
    }

    public EnrollStatus status() {
        return status;
    }

    public int capacity() {
        return capacity;
    }

    public Students students() {
        return students;
    }

    private boolean full() {
        return students.count() == capacity;
    }
}
