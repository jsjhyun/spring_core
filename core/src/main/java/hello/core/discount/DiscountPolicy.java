package hello.core.discount;
import hello.core.member.Member;

// 역할 - 할인정책
public interface DiscountPolicy {
    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price); // 회원 - 등급, 가격 필요
}
