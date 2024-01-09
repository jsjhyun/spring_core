package hello.core.member;
// 회원 Entity
public class Member {
// 회원 id, 아름, 등급
    private Long id;
    private String name;
    private Grade grade; // BASIC, VIP

    public Member(Long id, String name, Grade grade) { // 생성자
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    // getter(꺼내기) setter(넣기)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
