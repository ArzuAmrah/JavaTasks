package OOP;

public class MainOOP {
    public static void main(String[] args) {
        Student s = new Student();
        s.telephone.setMemory(45);
        s.telephone.setPhoneNumber("+99499999999");
        s.setName("Arzu");
        s.setSurname("Amrah");
        System.out.println(s.telephone.getMemory());
        System.out.println(s.telephone.getPhoneNumber());
    }

}
