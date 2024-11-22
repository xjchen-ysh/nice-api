package com.zyr.nice.module.core.service

import com.zyr.nice.module.core.dao.SongRepository
import com.zyr.nice.module.core.model.Song
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service
import java.util.*

@Service
class SongService @Autowired constructor(private val songRepository: SongRepository) {

    fun findPage(page: Int, pageSize: Int): Page<Song> {
        val pageable = PageRequest.of(page, pageSize)
        return songRepository.findAll(pageable)
    }


    fun songDetail(id: Long): Song {
        return songRepository.findById(id).orElse(null)
    }


}