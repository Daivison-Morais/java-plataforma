public class CursoDev {
    private String frontEnd;
    private String backEnd;
    BancoDeDados bancoDeDados = new BancoDeDados();

    public void setBackEnd(String backEnd) {
        this.backEnd = backEnd;
    }

    public String getBackEnd() {
        return this.backEnd;
    }

    public String getFrontEnd() {
        return this.frontEnd;
    }

    public void setFrontEnd(String frontEnd) {
        this.frontEnd = frontEnd;
    }
}
