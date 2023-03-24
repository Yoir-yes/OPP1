import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        ArrayList<Napoje> napojes = new ArrayList<>();
        napojes.add(new Soda("Pepsi"));
        napojes.add(new Kawa("Espresso","Normalna"));
        napojes.add(new Sok("Rivna","Pomarańcz"));
        for(Napoje x: napojes){
            System.out.println(x.pij());
        }
        System.out.println(" ");

        KochajacyProgramowac programowac = new KochajacyProgramowac() {
            @Override
            public String programuj() {
                return "Programuje";
            }
        };

        ArrayList<Napoje> nowalista = napojes;
        Comparator<Napoje> nazwa = (o1, o2) -> o1.getNazwa().compareTo(o2.getNazwa());
        Comparator<Napoje> klasa = (o1, o2) -> o1.getClass().getName().compareTo(o2.getClass().getName());

        System.out.println("Posortowanie po nazwie");
        nowalista.sort(nazwa);
        for(Napoje x: nowalista){
            System.out.println(x.getNazwa());
        }
        System.out.println(" ");
        System.out.println("Posortowanie po nazwie klasy");
        nowalista.sort(klasa);
        for(Napoje x: nowalista){
            System.out.println(x.getClass().getName());
        }


        System.out.println(" ");
        Function<String,Integer> dlugosc = (String tekst) -> tekst.length();
        System.out.println("Długość: " + dlugosc.apply("O takk to powinno dzialac"));

        Consumer<Integer> ocena = (Integer oc) -> System.out.println("Dostanę ocenę: "+ oc);
        ocena.accept(4);

        BiFunction<Integer,Integer,Integer> iloczyn = (Integer a, Integer b) -> a*b;
        System.out.println("Iloczyn: " + iloczyn.apply(5,4));
    }
}