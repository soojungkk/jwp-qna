package qna.exception;

public enum ErrorMessages {
    OTHER_USER_CANNOT_DELETE("질문을 삭제할 권한이 없습니다."),
    ANSWER_OTHER_USER_CANNOT_DELETE("다른 사람이 쓴 답변이 있어 삭제할 수 없습니다.");

    private String values;

    ErrorMessages(String values) {
        this.values = values;
    }

    public String getValues() {
        return values;
    }
}