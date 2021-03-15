package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemeberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();
    // concurrency hash map 동시성때문에 사용해야함

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);

    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
