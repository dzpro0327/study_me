package chapter12.collection.arraylist;

import chapter12.collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();
        // 맴버 생성
        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서훤");
        Member memberHong = new Member(1004, "홍길동");
        Member memberKim = new Member(1005, "김두한");
        
        // 맴버 추가
        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberSon);
        memberArrayList.addMember(memberPark);
        memberArrayList.addMember(memberHong);
        
        // 맴버 출력
        memberArrayList.showAllMember();
        
        // 맴버 삭제, 출력
        memberArrayList.removeMember(memberHong.getMemberId());
        memberArrayList.showAllMember();

        // 맴버 특정위치에 추가
        memberArrayList.insertMember(memberKim,1);
        memberArrayList.showAllMember();
        
    }
}
