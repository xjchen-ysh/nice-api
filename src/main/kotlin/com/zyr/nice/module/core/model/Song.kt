package com.zyr.nice.module.core.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Song(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long? = null,
    val title: String,
    val uri: String, // 歌曲链接
    val icon: String = "", // 网络封面
    val album: String, // 专辑
    val artist: String, // 艺术家
    val genre: String, // 流派
    val lyricStyle: Int = 0,
    val lyric: String = "",
    val trackNumber: Int = 1, // 歌曲轨道号
    val totalTrackCount: Int = 1, // 专辑中歌曲数量
    val duration: Int = 0, // 歌曲时长
)