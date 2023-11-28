package nextstep.qna.domain;

import nextstep.qna.CannotDeleteException;
import nextstep.users.domain.NsUser;
import nextstep.users.domain.NsUserTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class AnswersTest {

    @DisplayName("모든 답변은 자기 자신이 쓴 것이 아니라면 삭제시 예외가 발생한다.")
    @Test
    void if_answers_does_not_deleted_by_owner_then_throw_exception() {
        Answers answers = new Answers(AnswerTest.A1, AnswerTest.A1, AnswerTest.A2);
        NsUser loginUser = NsUserTest.SANJIGI;

        assertThatThrownBy(() -> answers.delete(loginUser))
                .isInstanceOf(CannotDeleteException.class);
    }

}