package hello.core.member;

import java.util.HashMap;
import java.util.Map;

// 메모리 저장소

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>(); // 저장소

    @Override
    public void save(Member member) {
        store.put(member.getId(), member); // key, value
    }

    @Override
    public Member findById(long memberId) {
        return store.get(memberId);
    }
}
