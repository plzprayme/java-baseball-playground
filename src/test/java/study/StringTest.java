package study;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split1() {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1", "2");
    }

    @Test
    void split2() {
        String[] actual = "1".split(",");
        assertThat(actual).containsExactly("1");
    }

    @Test
    void substring() {
        String s = "(1,2)";
        String actual = s.substring(1, s.length()-1);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    void chatAt1() {
        char actual = "abc".charAt(0);
        assertThat(actual).isEqualTo('a');
    }

    @DisplayName("charAt은 문자열의 길이보다 긴 인덱스를 참조할 수 없다.")
    @Test
    void chatAt2() {
        String s = "abc";
        assertThatThrownBy(() -> {
            s.charAt(s.length());
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
            .hasMessageContaining("String index out of range:");
    }

}
