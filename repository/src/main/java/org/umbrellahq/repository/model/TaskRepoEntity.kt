package org.umbrellahq.repository.model

import org.threeten.bp.OffsetDateTime
import org.umbrellahq.database.model.TaskDatabaseEntity

data class TaskRepoEntity(
        var id: Long? = null,
        var name: String,
        var date: OffsetDateTime = OffsetDateTime.now(),
        var status: Int = 0) {

    constructor(): this(null, "")

    constructor(databaseEntity: TaskDatabaseEntity) : this(
            databaseEntity.id,
            databaseEntity.name,
            databaseEntity.date,
            databaseEntity.status
    )

    fun mapToDatabase(): TaskDatabaseEntity {
        return TaskDatabaseEntity(
                id,
                name,
                date,
                status
        )
    }
}