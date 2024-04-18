package nextstep.courses.domain;

import nextstep.users.domain.NsUser;

public class SessionDetail {

    private String title;

    private NsUser instructor;


    public SessionDetail(String title,
                         NsUser instructor) {
        this.title = title;
        this.instructor = instructor;
    }
}
