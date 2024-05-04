package database

import androidx.room.Room
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import platform.Foundation.NSHomeDirectory

fun getPeopleDatabase(): PeopleDatabase {
    val dbFile = NSHomeDirectory() + "/people.db"
    return Room.databaseBuilder<PeopleDatabase>(
        name = dbFile,
        factory = { PeopleDatabase::class.instantiateImpl() }
    )
        .setDriver(BundledSQLiteDriver())
        .build()
}