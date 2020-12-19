package chapter14.exception;

public class IDFormatTest {
    private String userID;
    private String userPW;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) throws IDFormatException {
        if (userID == null) {
            // 강제예외
            throw new IDFormatException("아이디는 null일 수 없습니다.");
        } else if (userID.length() < 8 || userID.length() > 20) {
            // 강제예외
            throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
        }
        this.userID = userID;
    }

    public String getUserPW() {
        return userPW;
    }

    public void setUserPW(String userPW) throws PasswordException {
        if (userPW == null) {
            throw new PasswordException("비밀번호는 null일 수 없습니다.");
        } else if (userPW.matches("[a-zA-Z]+")) {
            throw new PasswordException("비밀번호는 문자 숫자 혼합으로 사용하세요.");
        } else if (userPW.length() <= 5) {
            throw new PasswordException("비밀번호는 6자 이상으로 사용하세요.");
        }
        this.userPW = userPW;
    }

    public static void main(String[] args) {
        IDFormatTest idFormatTest = new IDFormatTest();

        String userID = null;
        try {
            idFormatTest.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }

        userID = "1234567";
        try {
            idFormatTest.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }

        String userPW = "abc11234";
        try {
            idFormatTest.setUserPW(userPW);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
