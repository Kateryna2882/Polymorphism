public class Main {
    public static void main(String[] args) {
        MusicStyles popGroup = new PopMusic();
        MusicStyles rockGroup = new RockMusic();
        MusicStyles classicGroup = new ClassicMusic();


        MusicStyles[] musicGroups = {popGroup, rockGroup, classicGroup};
        for (MusicStyles group : musicGroups) {
            group.playMusic();
        }
    }
}