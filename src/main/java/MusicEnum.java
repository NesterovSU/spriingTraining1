enum MusicGenre {
      CLASSICALMUSIC(new ClassicalMusic()),
      POPMUSIC(new PopMusic());

      private Music music;
      MusicGenre(Music music){
            this.music = music;
      }

      public Music getMusic() {
            return music;
      }
}
