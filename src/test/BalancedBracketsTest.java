package test;

import org.junit.Test;
import static org.junit.Assert.*;
import main.BalancedBrackets;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //Test for improper brackets
    @Test
    public void incorrectBracketFail() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("[TEST["));
    }

    @Test
    public void oneOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void oneClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void incorrectOrderOfBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testTenNestedPairs() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[[[[[[[]]]]]]]]]]"));
    }

    @Test
    public void testTenUnorderedPairs() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][[[[]][]]]]"));
    }

    @Test
    public void testForEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testForEmptyBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testForBouncingBackPastZero() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]["));
    }
}
