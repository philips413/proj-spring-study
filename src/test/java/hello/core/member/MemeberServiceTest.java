package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemeberServiceTest {

    MemberService memeberService;
    @BeforeEach
    void beforeEach() {
        AppConfig appConfig = new AppConfig();
        this.memeberService = appConfig.memberService();
    }

    @Test
    void join() {
        // given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memeberService.join(member);
        Member findMember = memeberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);

    }


}
