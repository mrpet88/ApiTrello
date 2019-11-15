package trelloTestApi;

public enum TrelloEndPoints {
    BOARD("https://api.trello.com/1/members/me/boards");

    private final String url;

    TrelloEndPoints(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
}
