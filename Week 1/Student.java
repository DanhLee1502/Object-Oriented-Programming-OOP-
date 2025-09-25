/*
Viết chương trình quản lý Student với yêu cầu sau:
1. Tạo class Student có:
        Thuộc tính name (String, tên sinh viên).
        Thuộc tính age (int, tuổi).
        Constructor để khởi tạo name và age.
        Getter và Setter cho name và age.
        Phương thức displayInfo() để in ra thông tin sinh viên.
2.  Trong main():
        Tạo 2 đối tượng Student.
        In ra thông tin 2 sinh viên bằng displayInfo().
        Dùng setter để thay đổi tuổi của 1 sinh viên rồi in lại thông tin. 
*/

public class Student {
    private String name;
    private int age;

    //Constructor
    public Student(){

    }
    public Student (String name, int age){
        this.name=name;
        this.age=age;
    }
    //Getter cho name
    public String getName(){
        return name;
    }
    //Setter cho name
    public void setName(String name){
        this.name=name;
    }
    //Getter cho age
    public int getAge(){
        return age;
    }
    //Setter cho age
    public void setAge(int age){
        this.age=age;
    }
    //In thông tin
    public void displauInfo(){
        System.out.println("Ten: " + name + ", Tuoi: " + age);
    }
    //Hàm main
    public static void main(String[] args){
        Student s1 = new Student("An", 20);
        Student s2 = new Student("Binh",22);
        
        System.out.println("==Thong tin ban dau==");
        s1.displauInfo();
        s2.displauInfo();

        //Thay đổi tuổi người 1
        s1.setAge(21);

        System.out.println("==Thong tin sau khi thay doi==");
        s1.displauInfo();
    }
}

