package hello.core.member;

public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository; // memorymemberrepository를 가져오면 x
    // 인터페이스만으로는 안됨. 구현 객체를 불러와야함. 언제든 바꿀 수 있음

    public MemberServiceImpl(MemberRepository memberRepository) { // 생성자를 통해 구현체를 고른다.
        this.memberRepository = memberRepository;
    }

    public void join (Member member){
        memberRepository.save(member);
    }

    public Member findMember(Long memberId){
        return memberRepository.findById(memberId);
    }
}
