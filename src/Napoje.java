public abstract class Napoje {
   private String nazwa;

    public Napoje(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String pij(){
       return "napój";
   }
}
