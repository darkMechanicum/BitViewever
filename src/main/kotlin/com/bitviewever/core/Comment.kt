package com.bitviewever.core

/**
 * Kotlin representation of BitBucket comment.
 */
data class Comment (
    val id: Long,
    val line: Long,
    val text: String,
    val parent: Comment? = null,
    val children: List<Comment> = emptyList()
)