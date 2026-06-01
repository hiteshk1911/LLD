interface RecommendationStrategy {
    List<Song> recommend(List<Song> allSongs);
}