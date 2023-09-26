package org.setu.models

import java.util.Date

/**
 * A task
 *
 * This class represents a task created by a certain user.
 *
 * @property id the unique identifier of the task
 * @property title the name of the task
 * @property description the information about the task
 * @property date the finishing day of the task
 * @property topic the group to which the task belongs (if any)
 * @property priority the importance of the task
 * @constructor Creates an empty task.
 */
data class Task(
    val id: Int,
    var title : String,
    var description: String,
    var date: Date,
    var topic: String?,
    var priority: Int)

