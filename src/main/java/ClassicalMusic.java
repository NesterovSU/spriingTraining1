public class ClassicalMusic implements Music{
    private String[] songs = new String[]{"The seasons. June", "Schelkunchick", "5 Sonata of Beethoven"};

    @Override
    public String[] getSongs() {
        System.out.println(this.toString());
        return songs;
    }
}
