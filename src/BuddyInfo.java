public class BuddyInfo {

    private String name;
    private int age;

    public static void main(String[] args) {
        BuddyInfo i = new BuddyInfo("Homer", 25);
        System.out.println("Hello "+i.getName());
    }

    public BuddyInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
