package DiarySystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DiaryTest {
    private Diary diary;

    @BeforeEach
    void setUp() {
        diary = new Diary("wisdom", "wis2345");
    }

    @Test
    void testThatDiaryIsCreatedWithNewName_UsernameIsLocked() {
        assertEquals("wisdom", diary.getUserName());
        assertTrue(diary.isLocked());
    }

    @Test
    void testThatDiaryExists_IsLockedIsTrue_DiaryIsUnLocked_isLockedRemainsTrue() {
        assertTrue(diary.isLocked());
        assertFalse(diary.unLockDiary("wis2345"));
    }

    @Test
    void testThatDiaryExists_IsLockedIsTrue_DiaryIsUnLockedButWrongPassword_IsLockedIsTrue() {
        assertTrue(diary.isLocked());
        diary.unLockDiary("weee");
        assertTrue(diary.isLocked());
    }

    @Test
    void testThatDiaryExists_isLockedIsFalse_diaryShouldBeLocked() {
        assertTrue(diary.isLocked());
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    void createEntry_WhenDiaryIsUnlocked_entriesSizeIncreasesByOne() {
        diary.unLock();
        int diarySize = diary.getEntries().size();
        diary.createEntry(1,"the game", "Chelsea is good");
        assertEquals(1 , diary.getEntries().size());
    }

    @Test
    void diaryIsUnLocked_WhenEntryIsCreated_EntryBodyAndTitleAreCorrect(){
        diary.unLock();
        diary.createEntry(1,"House Project", "Cement , Plank , Sand");
        Entry entry = diary.getEntries().get(0);
        assertEquals("House Project", entry.getTitle());
        assertEquals("Cement , Plank , Sand", entry.getBody());
    }

    @Test
    void diaryIsLocked_WhenEntryIsCalled_EntryIsNotAdded(){
        diary.lockDiary();
        assertThrows(IllegalStateException.class,()-> diary.createEntry(1,"School", "Semicolon is good"));
    }
    @Test
    void diaryHasAnEntryWithIdOne_FindEntryByIdOne(){
        diary.unLock();
        diary.createEntry(1,"project", "the boy is good");
        Entry entry = diary.findEntryById(1);
        assertNotNull(entry);
        assertEquals(1,entry.getId());
    }

    @Test
    void createTwoDiaryEntry_DiaryHasNoEntryWith99_WhenFindingId_ThenReturnNull(){
        diary.unLock();
        diary.createEntry(1,"Book", "This boy love girls");
        diary.createEntry(2,"School Project", "Test, Assignment, Phase Gate");
        Entry entry = diary.findEntryById(99);
        assertNull(entry);
    }

    @Test
    void diaryIsUnLocked_DiaryHasAnEntryWithIdOne_AfterEntryHasBeenCreated_DeleteEntry(){
        diary.unLock();
        diary.createEntry(1,"School Project", "Test, Assignment");
        diary.deleteEntry(1);
        assertEquals(0, diary.getEntries().size());
    }

    @Test
    void unLockDiary_DiaryHasAnEntryWithIdOne_WhenUpdatedItShouldHaveNewTitleAndBody(){
        diary.unLock();
        diary.createEntry(1,"School Project", "Test, Assignment");
        diary.updateEntry(1 , " Building Project", " Cement, Block");
        assertEquals(1,diary.getEntries().size());

    }

    @Test
    void unLockDiary_DiaryHasAnEntryWithId99_NoChangeOccur(){
        diary.unLock();
        diary.createEntry(1,"Building Project","Cement , Block");
        assertThrows(IllegalStateException.class,()-> diary.updateEntry(99,"Building", "Window Fittings"));
    }

}
