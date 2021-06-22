package baseball;

import org.junit.jupiter.api.Test;

public class BaseballTest {
    @Test
    public void 시작() {
        BaseballService service = new BaseballService();
        service.run();
    }
}
