import java.io.Serializable;

class Student implements Serializable {
    private static final long serialVersionUID = 1L; 
    private String name;
    private int id;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String toString() {
        return "Student [name=" + name + ", id=" + id + "]";
    }
}
