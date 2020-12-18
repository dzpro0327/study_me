package chapter12.treeset;

import chapter12.collection.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTestSet {
    private TreeSet<Member> treeSet;

    public MemberTestSet() {
        treeSet = new TreeSet<>();
    }

    public TreeSet<Member> getTreeSet() {
        return treeSet;
    }

    public void setTreeSet(TreeSet<Member> treeSet) {
        this.treeSet = treeSet;
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> ir = treeSet.iterator();

        while (ir.hasNext()) {
            Member member = ir.next();
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member member : treeSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
