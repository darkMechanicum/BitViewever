package com.bitviewever.core

/**
 * Adapter for IDEA plugin API for manipulating
 * logical file comments for open file.
 */
object IdeaCommentsAdapter {

    /**
     * Add plugin BitBucket comments update handler.
     */
    fun addCommentChangeListener(handler: () -> Unit) {

    }

    /**
     * Add line comment that is connected to file only logical.
     */
    fun addPluginComment(commentText: String,
                         line: Long,
                         path: String
    ) {

    }
}