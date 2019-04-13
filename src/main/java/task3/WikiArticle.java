package task3;

import java.io.*;
import java.util.Scanner;

public class WikiArticle implements Article {
    private String elvisArticle = "src/main/java/task3/articles/elvis.txt";
    private String teslaArticle = "src/main/java/task3/articles/tesla.txt";
    private String intelArticle = "src/main/java/task3/articles/intel.txt";
    private WikiArticle reset = this;

    public WikiArticle getReset() {
        return reset;
    }

    public WikiArticle(String elvisArticle, String teslaArticle, String intelArticle) {
        this.elvisArticle = elvisArticle;
        this.teslaArticle = teslaArticle;
        this.intelArticle = intelArticle;
    }

    public WikiArticle() {
    }

    @Override
    public Article copy(String elvisArticle, String teslaArticlem, String intelArticle) {
        return new WikiArticle(elvisArticle, teslaArticlem, intelArticle);
    }

    @Override
    public void showArticle(String article) throws NoSuchFieldException, IOException {
        BufferedReader buffer = new BufferedReader(new FileReader(chooseArticle(article)));
        while(true){
            String tmp = buffer.readLine();
            if (tmp == null) break;
            System.out.println(tmp);
        }
    }

    @Override
    public void redactArticle(String article) throws IOException, NoSuchFieldException {
        String filePath = "src/main/java/task3/articles/";
        String fileName;
        switch(article.toUpperCase()){
            case "ELVIS": fileName = filePath + "elvis1.txt";
            copy(fileName, teslaArticle, intelArticle); break;
            case "TESLA": fileName = filePath + "tesla1.txt";
            copy(elvisArticle, fileName, intelArticle); break;
            case "INTEL": fileName = filePath + "intel1.txt";
            copy(elvisArticle, teslaArticle, fileName); break;
            default: throw new NoSuchFieldException("No such article");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something to put in file:");
        String newString = scanner.nextLine();

        FileWriter fr = new FileWriter(new File(fileName), false);
        BufferedWriter br = new BufferedWriter(fr);
        PrintWriter pr = new PrintWriter(br);

        pr.println(newString);

        pr.close();
        br.close();
        fr.close();
    }

    private String chooseArticle(String article) throws NoSuchFieldException {
        String filePath;
        switch(article.toUpperCase()){
            case "ELVIS": filePath = elvisArticle; break;
            case "TESLA": filePath = teslaArticle; break;
            case "INTEL": filePath = intelArticle; break;
            default: throw new NoSuchFieldException("No such article");
        }
        return filePath;
    }
}
