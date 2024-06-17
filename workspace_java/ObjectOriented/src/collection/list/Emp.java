package collection.list;

public class Emp {
    private int en;
    private String name;
    private String depart;
    private String phone;
    private int salary;

    public Emp(int en, String name, String depart, String phone, int salary) {
        this.en = en;
        this.name = name;
        this.depart = depart;
        this.phone = phone;
        this.salary = salary;
    }

    public int getEn() {
        return en;
    }

    //사원의 연락처 마지막 4자리값 리턴 1111-"1111"
    public String getPhone(){
        return phone.substring(5);
    }

    public String getName() {
        return name;
    }

    public String getDepart() {
        return depart;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
