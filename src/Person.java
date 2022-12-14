public class Person
{
    private String name;
    private String sex;
    private Division division;
    private String Salary;
    private String birthday;
    private String ID;

    public Person(Division division) {
        this.division = division;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDivisionID() {
        return division.getID();
    }

    public void setDivisionID(String ID) { this.division.setID(ID); }

    public String getDivisionName() {
        return division.getName();
    }

    public void setDivisionName(String name) { this.division.setName(name); }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }
}
