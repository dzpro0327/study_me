package chapter12.hashset;

import chapter12.collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        Member member1 = new Member(1001, "이동주1");
        Member member2 = new Member(1002, "이동주2");
        Member member3 = new Member(1003, "이동주3");
        Member member4 = new Member(1004, "이동주4");
        Member member5 = new Member(1001, "이동주5");

        MemberHashSet memberHashSet = new MemberHashSet();
        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);
        memberHashSet.addMember(member4);
        memberHashSet.addMember(member5);

        System.out.println("============================================");
        memberHashSet.showAllMember();

        System.out.println("============================================");
        System.out.println();

        System.out.println("============================================");
        memberHashSet.showAllMember();
    }
}
