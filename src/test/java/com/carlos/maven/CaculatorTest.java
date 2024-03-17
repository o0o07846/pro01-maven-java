package com.carlos.maven;

import org.junit.*;
import com.carlos.maven.Caculator;
import static org.junit.Assert.*;

public class CaculatorTest {
    @Test
    public void testSum(){
        Caculator caculator=new Caculator();
        int actResult = caculator.sum(5,3);

        int expectResult = 8;

        assertEquals(actResult,expectResult);
    }
}
