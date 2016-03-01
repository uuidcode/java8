package etc;

import org.junit.Test;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StreamTest {
    static class Block {
        private Color color;
        private int weight;

        public int getWeight() {
            return this.weight;
        }

        public Block setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Color getColor() {
            return this.color;
        }

        public Block setColor(Color color) {
            this.color = color;
            return this;
        }
    }

    @Test
    public void test() {
        List<Block> list = new ArrayList<Block>();
        list.add(new Block().setColor(Color.BLUE).setWeight(100));
        list.add(new Block().setColor(Color.BLUE).setWeight(10));
        list.add(new Block().setColor(Color.RED).setWeight(50));

        assertThat(
            list.stream()
                .filter(x -> x.getColor().equals(Color.BLUE))
                .mapToInt(x -> x.getWeight())
                .sum()
                , is(110));
    }
}
