package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int j = 0;
        while (j < chars.length) {
            System.out.print(chars[j]);
            j++;
        }

    }
}
