import static java.util.Arrays.asList;
import static org.junit.Assert.assertTrue;

import junitparams.JUnitParamsRunner;
import junitparams.NamedParameters;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Collection;

@RunWith(JUnitParamsRunner.class)
public class ParametrizedTest {

    @Test
    @Parameters(named = "param")
    public void test(int param) {
        assertTrue(param > 0);
    }

    @NamedParameters("param")
    private static Collection<Integer> params() {
        return asList(1, 2, 3);
    }
}
