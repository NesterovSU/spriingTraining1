enum MusicEnum {
      CLASSICALMUSIC(new ClassicalMusic()),
      POPMUSIC(new PopMusic());

      private Music music;
      MusicEnum(Music music){
            this.music = music;
      }

      public Music getMusic() {
            return music;
      }
}
