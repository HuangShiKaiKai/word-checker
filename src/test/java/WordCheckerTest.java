import com.github.houbb.word.checker.util.WordCheckerHelper;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @author: huangshikai
 * @Date: 2024/6/413:29
 * @Description:
 */
public class WordCheckerTest {

    @Test
    public void test() {
        String text = "路威轩";
        String correct = WordCheckerHelper.correct(text);
        System.out.println(correct);
    }
}
