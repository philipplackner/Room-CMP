package database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Person::class],
    version = 1
)
abstract class PeopleDatabase: RoomDatabase() {

    abstract fun peopleDao(): PeopleDao

}