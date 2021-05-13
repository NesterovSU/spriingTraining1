public class PopMusic implements Music{
    private String[] songs = new String[]{"Toxic", "My humps", "One horse road"};

    @Override
    public String[] getSongs() {
        System.out.println(this.toString());
        return songs;
    }
}
