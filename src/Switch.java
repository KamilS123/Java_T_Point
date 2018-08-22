public class Switch {
    public static void main(String[] args) {
        String name = "Jan";
        switch(name) {
            case "Kamil":
                System.out.println("Podałes kamil");
                break;
            case "Jan":
                System.out.println("Podales Jan");
                break;
                default:
                    System.out.println("Podales cos innego");
        }
    }
}
