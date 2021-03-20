package com.derek.doesnthavetobeflashcard;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {com.derek.doesnthavetobeflashcard.Flashcard.class}, version = 3)
public abstract class AppDatabase extends RoomDatabase {
    public abstract com.derek.doesnthavetobeflashcard.FlashcardDao flashcardDao();
}
