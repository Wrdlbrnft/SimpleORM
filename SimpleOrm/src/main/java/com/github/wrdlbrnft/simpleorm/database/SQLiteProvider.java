package com.github.wrdlbrnft.simpleorm.database;

/**
 * Created with Android Studio
 * User: Xaver
 * Date: 10/07/16
 */

public interface SQLiteProvider {
    WritableSQLiteWrapper getWritableWrapper();
    ReadableSQLiteWrapper getReadableWrapper();
    void close();
}
