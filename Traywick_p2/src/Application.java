
import java.io.IOException;
public class Application {

        public static void main(String[] args) throws IOException {
            DuplicateCounter remover = new DuplicateCounter();

            DuplicateCounter.count("problem2.txt");
            remover.Write("unique_word_counts.txt");

        }
}
