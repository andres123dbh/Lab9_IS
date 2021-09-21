public class PianoElectric implements Guitar{
    @Override
    public void encender(){
        System.out.println("Encendido piano electrico");
    }

    @Override
    public void apagar(){
        System.out.println("Apagado piano electrico");
    }
}
