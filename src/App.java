public class App {
    public static void main(String[] args) {
        CursoDev curso = new CursoDev();

        curso.bancoDeDados.create ="CREATE TABLE clientes ();";
        curso.setFrontEnd("react");
        curso.setBackEnd("node");
        System.out.println(curso.getBackEnd());
        System.out.println(curso.getFrontEnd());
        System.out.println(curso.bancoDeDados.create);
    }
}
