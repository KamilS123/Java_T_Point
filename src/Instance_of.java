class Park {
    void park() {
        System.out.println("park");
    }
}
class Animals extends Park{
    void dod() {
        System.out.println("co");
    }
}
public class Instance_of {
    public static void main(String[] args) {
        Instance_of io  = new Instance_of();
        System.out.println(io instanceof Instance_of);

        Park p = new Park();
        System.out.println(p instanceof Park);

        Park pa = new Animals();
        System.out.println(pa instanceof Animals);

        Animals ani = new Animals();
        System.out.println(ani instanceof Park
        );
    }
}
//instanceof sprawdza czy obiekt jest nstancją danej klasy tzn czy nalezy do niej