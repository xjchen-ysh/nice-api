package com.zyr.nice.module.core.dao

import com.zyr.nice.module.core.model.Song
import com.zyr.nice.module.core.model.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query

interface SongRepository : JpaRepository<Song, Long> {

}