public class Kawa extends Napoje{
    String jaka;

    public Kawa(String nazwa,String jaka) {
        super(nazwa);
        this.jaka = jaka;
    }

    @Override
    public String pij() {
        return "Pije Kawę";
    }
}
