public class Soda extends Napoje{
    public Soda(String nazwa) {
        super(nazwa);
    }

    @Override
    public String pij() {
        return "Pije Sodę";
    }
}
