public class test {
    
    public static void main(String[] args)
    {
        PianoAcusticAdapter pianoAcusticAdapter = new PianoAcusticAdapter(new PianoAcusic());
        pianoAcusticAdapter.encender();
        pianoAcusticAdapter.apagar();
        PianoElectric pianoElectric = new PianoElectric();
        pianoElectric.encender();
        pianoElectric.apagar();
    }
    
}
