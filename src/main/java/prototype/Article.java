package prototype;

import java.io.IOException;

public interface Article {
    Article copy(String elvisArticle, String teslaArticlem, String intelArticle);
    void showArticle(String article) throws NoSuchFieldException, IOException;
    void redactArticle(String article) throws IOException, NoSuchFieldException;
}
