package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discointFixAmount = 1000;

    @Override
    public int discoint(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discointFixAmount;
        }
        return 0;
    }
}
