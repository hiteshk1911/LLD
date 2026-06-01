class ChronologicalSortStrategy implements FeedSortingStrategy {
    @Override
    public List<Post> sort(List<Post> posts) {
        List<Post> result = new ArrayList<>();
        posts.stream()
                .sorted(Comparator.comparing(Post::getCreatedAt).reversed())
                .forEach(result::add);
        return result;
    }
}