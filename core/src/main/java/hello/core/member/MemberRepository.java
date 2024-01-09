package hello.core.member;

public interface MemberRepository {

    void save(Member member); // 회원 저장

    Member findById(long memberId); // id로 회원 찾기
}
