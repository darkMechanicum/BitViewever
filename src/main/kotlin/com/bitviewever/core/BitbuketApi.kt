package com.bitviewever.core

/**
 * Bibucket REST API.
 */
object BitBuketApi {

    /**
     * Create comment for selected code line with optional parent.
     */
    fun createComment(auth: BitbucketAuth,
                      text: String,
                      line: Long,
                      path: String,
                      parent: Comment? = null
    ) {
        TODO()
    }

    /**
     * Get root comment for selected code line.
     */
    fun getComment(auth: BitbucketAuth,
                   text: String,
                   line: Long,
                   path: String
    ) {
        TODO()
    }

    /**
     * Update selected comment text.
     */
    fun updateComment(auth: BitbucketAuth,
                      commentId: Long,
                      path: String,
                      newText: String
    ) {
        TODO()
    }

}