package Memory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private Stack stack;
    @BeforeEach
    void setUp() {
        stack = new Stack();
    }
    @Test
    void stackIsEmptyAtCreation(){
        assertTrue(stack.isStackEmpty());
    }
    @Test
    void stackIsEmptyAtCreation_WhenIPush10_ThePushReturn10(){
        assertTrue(stack.isStackEmpty());
        assertEquals(10,stack.push(10));
    }
    @Test
    void stackContains10_20_WhenIPush30_ItShouldReturn30AtTheTop(){
        assertEquals(10, stack.push(10));
        assertEquals(20,stack.push(20));
        assertEquals(30,stack.push(30));

    }
    @Test
    void stackContains10_20_30_WhenIPop_TheElementAtTheTopShouldReturn30(){
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(30,stack.pop());

    }
    @Test
    void stackIsEmpty_WhenIPop_ItShouldThrowException(){
        assertTrue(stack.isStackEmpty());
        assertThrows(EmptyStackException.class,()->stack.pop());
    }
    @Test
    void stackContains10_20_30_WhenIPeek_TheElementAtTheTopReturn30(){
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(30,stack.peek());
    }
    @Test
    void stackContains10_20_30_WhenIPeek_StackSizeRemainTheSame30IsNotRemoved(){
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(30,stack.peek());
        assertEquals(3,stack.getSize() );
    }
    @Test
    void stackIsEmpty_WhenPeekIsCalled_ExceptionIsThrowed(){
        assertTrue(stack.isStackEmpty());
        assertThrows(EmptyStackException.class,()->stack.peek());
    }
    @Test
    void stackHasJustBeenCreatedWithNoElement_WhenEmptyIsCalledOn_ItShouldReturnTrue(){
        assertTrue(stack.empty());
    }
    @Test
    void stackContain10_20_WhenEmptyIsCalledOn_ItShouldReturnFalse(){
        stack.push(10);
        stack.push(20);
        assertFalse(stack.empty());
    }
    @Test
    void stackContains10_20_30_WhenISearchFor30_ItShouldReturnOne(){
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(1,stack.search(30));
    }
    @Test
    void stackContains10_20_30_WhenISearchFor20_ItShouldReturnTwo(){
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(2,stack.search(20));
    }
    @Test
    void stackContains10_20_30_WhenISearchFor10_ItShouldReturnThree(){
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(3,stack.search(10));

    }
    @Test
    void stackContains10_20_30_WhenISearchFor10_ItShouldReturnMinusOne(){
        stack.push(10);
        stack.push(20);
        stack.push(10);
        assertEquals(-1,stack.search(99));
    }
    @Test
    void stackContainsDuplicateNumber10_20_10_WhenISearchFor10_ItShouldReturnMinusOne() {
        stack.push(10);
        stack.push(20);
        stack.push(10);
        assertEquals(1, stack.search(10));
    }

}