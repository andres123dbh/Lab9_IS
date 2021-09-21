public class PianoAcusticAdapter implements Guitar{

    private PianoAcusic pianoAcusic;

    public PianoAcusticAdapter(PianoAcusic pianoAcusic){
        this.pianoAcusic = pianoAcusic;
    }

    @Override
    public void encender(){
        this.pianoAcusic.tocar();
    }

    @Override
    public void apagar(){
        this.pianoAcusic.parar();
    }
}
