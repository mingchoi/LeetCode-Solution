package io.github.mingchoi.leetcodesolutionjava.solution.q56_merge_intervals;

import io.github.mingchoi.leetcodesolutionjava.datastructure.Interval;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void merge() {
        class TestCase {
            public List<Interval> expected;
            public List<Interval> s;

            public TestCase(List<Interval> ex, List<Interval> s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(
                        Arrays.asList(new Interval(1, 6), new Interval(8, 10), new Interval(15, 18)),
                        Arrays.asList(new Interval(1, 3), new Interval(2, 6), new Interval(8, 10), new Interval(15, 18))
                ),
                new TestCase(
                        Arrays.asList(new Interval(1, 5)),
                        Arrays.asList(new Interval(1, 4), new Interval(4, 5))
                ),
                new TestCase(
                        Arrays.asList(),
                        Arrays.asList()
                ),
                new TestCase(
                        Arrays.asList(new Interval(0, 4)),
                        Arrays.asList(new Interval(1, 4), new Interval(0, 1))
                ),
                new TestCase(
                        Arrays.asList(new Interval(1, 10)),
                        Arrays.asList(
                                new Interval(2, 3),
                                new Interval(4, 5),
                                new Interval(6, 7),
                                new Interval(8, 9),
                                new Interval(1, 10)
                        )
                ),
        };

        for (TestCase c : cases) {
            List<Interval> r = new Solution().merge(c.s);
            assertEquals(c.expected.size(), r.size());

            for (int i = 0; i < c.expected.size(); i++) {
                assertEquals(c.expected.get(i).start, r.get(i).start);
                assertEquals(c.expected.get(i).end, r.get(i).end);
            }
        }
    }

    @Test
    public void union() {
        class TestCase {
            public List<Interval> expected;
            public Interval a;
            public Interval b;

            public TestCase(List<Interval> ex, Interval a, Interval b) {
                this.expected = ex;
                this.a = a;
                this.b = b;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(Arrays.asList(new Interval(1, 5)), new Interval(1, 4), new Interval(4, 5)),
                new TestCase(Arrays.asList(new Interval(1, 2), new Interval(3, 4)), new Interval(1, 2), new Interval(3, 4)),
                new TestCase(Arrays.asList(new Interval(0, 4)), new Interval(1, 4), new Interval(0, 1))
        };

        for (TestCase c : cases) {
            List<Interval> r = new Solution().union(c.a, c.b);
            assertEquals(c.expected.size(), r.size());

            for (int i = 0; i < c.expected.size(); i++) {
                assertEquals(c.expected.get(i).start, r.get(i).start);
                assertEquals(c.expected.get(i).end, r.get(i).end);
            }
        }
    }
}