package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
    /**
     *
     * @return 할인 정책
     */
    int discoint(Member member, int price);

}
