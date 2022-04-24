public class Teacher extends Human{
    private String name;
    private String surname;
    private String position;
    public Teacher(String name, String surname, String position){
        super(name, surname);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String
    toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
