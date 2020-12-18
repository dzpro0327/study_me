package chapter12.treemap;

import chapter12.collection.Member;
import chapter12.hashmap.MemberHashMap;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member member1 = new Member(1001, "이동주1");
        Member member2 = new Member(1002, "이동주2");
        Member member3 = new Member(1003, "이동주3");
        Member member4 = new Member(1004, "이동주4");

        memberTreeMap.addMember(member1);
        memberTreeMap.addMember(member2);
        memberTreeMap.addMember(member3);
        memberTreeMap.addMember(member4);

        memberTreeMap.showAllMember();

        memberTreeMap.removeMember(1001);

        memberTreeMap.showAllMember();
    }
}
