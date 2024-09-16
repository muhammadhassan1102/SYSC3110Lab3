import java.util.ArrayList;

public class AddressBook {

    public ArrayList<BuddyInfo> Buddies;

    public AddressBook(ArrayList<BuddyInfo> buddies) {
        this.Buddies = buddies;
    }

    public void addBuddy(BuddyInfo buddy) {
        Buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        Buddies.remove(buddy);
    }

    public void printBuddies() {
        for (BuddyInfo buddy : Buddies) {
            System.out.println(("Name:" + buddy.getName()) + " Age:" + buddy.getAge());
        }
    }

    public static void main(String[] args) {

        ArrayList<BuddyInfo> buddies = new ArrayList<>();
        AddressBook addressBook = new AddressBook(buddies);

        BuddyInfo buddy1 = new BuddyInfo("Homer", 25);
        BuddyInfo buddy2 = new BuddyInfo("Mike", 21);
        BuddyInfo buddy3 = new BuddyInfo("John", 20);

        addressBook.addBuddy(buddy1);
        addressBook.addBuddy(buddy2);
        addressBook.addBuddy(buddy3);

        addressBook.removeBuddy(buddy1);

        addressBook.printBuddies();

        System.out.println("Address Book:");
    }
}
