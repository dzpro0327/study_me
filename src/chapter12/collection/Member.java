package chapter12.collection;

public class Member implements Comparable<Member> {
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (this.memberId == member.memberId) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Member member) {
        // 오름차순으로 정렬됨
        return (this.memberId - member.memberId);

        // 내림차순으로 정렬됨
        //return (this.memberId - member.memberId) * (-1);

        // 회원 이름순으로 정렬됨
        //return memberName.compareTo(member.memberName);

        //return this.memberName.compareTo(member.memberName);
        //String 클래스에 compareTo() 가 정의되어 있으므로 활용
    }
}
