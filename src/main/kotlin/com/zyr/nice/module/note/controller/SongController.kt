package com.zyr.nice.module.note.controller

import com.zyr.nice.module.core.model.PageDTO
import com.zyr.nice.module.core.model.ResponseDTO
import com.zyr.nice.module.core.model.Song
import com.zyr.nice.module.core.model.succ
import com.zyr.nice.module.core.service.SongService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController @Autowired constructor(private val songService: SongService) {

    @GetMapping("song/page")
    fun songPage(@RequestParam page: Int, @RequestParam pageSize: Int): ResponseDTO<PageDTO<List<Song>>> {

        val findPage = songService.findPage(page, pageSize)

        val songs = findPage.toList().toList()
        val total = findPage.totalElements
        val totalPages = findPage.totalPages

        val pageDTO = PageDTO<List<Song>>(
            data = songs,
            total = total,
            totalPages,
            page, pageSize
        )

        return ResponseDTO(pageDTO, "", true)
    }

    @GetMapping("song/{id}")
    fun songPage(@PathVariable id: Long): ResponseDTO<Song> {
        return succ(songService.songDetail(id))
    }

}