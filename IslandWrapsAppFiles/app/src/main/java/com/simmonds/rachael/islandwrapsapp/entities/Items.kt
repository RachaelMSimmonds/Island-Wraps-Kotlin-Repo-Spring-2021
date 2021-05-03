package com.simmonds.rachael.islandwrapsapp.entities

import androidx.room.*

@Entity(tableName = "itemData",
    indices = [Index("name",unique = true)])
data class Customer(@PrimaryKey(autoGenerate = true) var itemName: String?,
                    @ColumnInfo(name = "description") var disc: String


){
    constructor():this(null,"")
}