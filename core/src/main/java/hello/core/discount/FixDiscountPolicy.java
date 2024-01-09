package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

// 구현 - 정액제
public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; // 고정 금액 1000원 할인
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){       // enum은 == 사용.
            return discountFixAmount; // VIP면 할인 적용
        } else { // 아니면 할인 x
            return 0;
        }
    }
}
