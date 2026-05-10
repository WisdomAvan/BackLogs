package DiarySystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiariesTest {
    private Diaries diaries;
    @BeforeEach
    void setUp(){
        diaries = new Diaries();
    }

    @Test
    void diariesListIsEmptyAtCreation(){
        assertTrue(diaries.getDiaries().isEmpty());
    }
    @Test
    void diariesListIsEmptyAtCreation_WhenUserNameAndPasswordIsAdded(){
        assertTrue(diaries.getDiaries().isEmpty());
        diaries.add("codedplanet", "w2222");
        assertEquals(1,diaries.getDiaries().size());
    }
    @Test
    void whenUserNameAndPasswordAlreadyExists_DariesListSizeStaysTheSame(){
        diaries.add("codedplanet" , "w2222");
        assertEquals(1, diaries.getDiaries().size());
        assertThrows(IllegalArgumentException.class,() ->{ diaries.add("codedplanet" , "w2222");
                });
        assertEquals(1,diaries.getDiaries().size());
    }
    @Test
    void diariesHasADiaryWithTwoUsernames_ReturnsDiaryObjectWithUsername(){
        diaries.add("codedplanet" , "w2222");
        diaries.add("gwadd", "34e56t");
        assertEquals(2, diaries.getDiaries().size());
        Diary diary = diaries.findByUsername("gwadd");
        assertEquals("gwadd",diary.getUserName());
    }
    @Test
    void addDiaryWithUsername_DiariesHasNoDiaryWithUsername_ReturnNull(){
        diaries.add("codedplanet", "w2222");
        assertNull(diaries.findByUsername("coded"));
    }
    @Test
    void diariesHasADiaryWithUsername_DiaryListSizeDecreasedBy1(){
        diaries.add("codedplanet", "w2222");
        diaries.add("gwadd", "12345lk");
        diaries.delete("codedplanet","w2222");
        assertEquals(1,diaries.getDiaries().size());
    }
    @Test
    void diariesHasADiaryWithTwoUsername_DiaryIsNotRemoved(){
        diaries.add("codedplanet", "w2222");
        diaries.add("gwadd", "12345lk");
        diaries.delete("codedplanet","w22");
        assertEquals(1,diaries.getDiaries().size());



    }

}