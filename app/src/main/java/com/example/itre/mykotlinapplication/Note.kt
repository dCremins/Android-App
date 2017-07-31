package com.example.itre.mykotlinapplication
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id
import java.util.*

/**
 * Created by itre on 7/28/17.
 */
@Entity
data class Note(
        @Id var id: Long = 0,
        var text: String? = null,
        var comment: String? = null,
        var dat: Date? = null
)