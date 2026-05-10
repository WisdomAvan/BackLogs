package Memory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {

    private Set mySet;

    @BeforeEach
    void setUp() {
        mySet = new Set();
    }

    @Test
    void testThatANewSetIsEmpty() {
        assertTrue(mySet.isEmpty());
    }

    @Test
    void testAddOneElementSetIsNotEmpty() {
        mySet.add(23);
        assertFalse(mySet.isEmpty());
    }

    @Test
    void testSetDoesNotAddDuplicateElement() {
        mySet.add(23);
        mySet.add(23);

        assertEquals(1, mySet.size());
    }

    @Test
    void testRemoveSetElementSetLengthIsReducedWhenElementIsRemoved() {
        mySet.add(23);
        mySet.add(24);

        mySet.remove(24);

        assertEquals(1, mySet.size());
    }

    @Test
    void testRemoveElementRaiseErrorWhenElementNotInSet() {
        mySet.add(23);

        assertThrows(IllegalArgumentException.class, () -> {
            mySet.remove(24);
        });
    }

    @Test
    void testUnionOfTwoSetGivesOneSetOfAllElementsContained() {
        mySet.add(23);
        mySet.add(24);

        Set anotherSet = new Set();
        anotherSet.add(25);
        anotherSet.add(56);

        int expected = mySet.union(anotherSet);

        assertEquals(4, expected);
    }

    @Test
    void testIntersectionOfTwoSetGivesOneSetOfCommonElement() {
        mySet.add(23);
        mySet.add(24);

        Set anotherSet = new Set();
        anotherSet.add(23);
        anotherSet.add(56);

        int expected = mySet.intersection(anotherSet);

        assertEquals(1, expected);
    }
}