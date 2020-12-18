package chapter12.treeset;

import chapter12.collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTestSet memberTestSet = new MemberTestSet();

        Member member1 = new Member(1001, "이동주6");
        Member member2 = new Member(1002, "이동주8");
        Member member3 = new Member(1003, "이동주7");

        memberTestSet.addMember(member1);
        memberTestSet.addMember(member2);
        memberTestSet.addMember(member3);
        memberTestSet.showAllMember();

        Member memberHong = new Member(1003, "홍길동");
        memberTestSet.addMember(memberHong);
        memberTestSet.showAllMember();
    }
}
