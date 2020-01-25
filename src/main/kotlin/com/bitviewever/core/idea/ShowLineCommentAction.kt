package com.bitviewever.core.idea

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.editor.EditorCustomElementRenderer
import com.intellij.openapi.editor.Inlay
import com.intellij.openapi.editor.markup.TextAttributes
import java.awt.Graphics
import java.awt.Rectangle

/**
 * Represents intellij action that show
 * inline comments for active editor.
 */
class ShowLineCommentAction : AnAction() {
    override fun actionPerformed(event: AnActionEvent) {
        val editor = event.getData(CommonDataKeys.EDITOR)
        val inlayModel = editor?.inlayModel
        val currentCaret = editor?.caretModel?.currentCaret
        if (currentCaret != null) {
            inlayModel?.addBlockElement(currentCaret.offset, false, true, 1, CommentRenderer);
        }
    }
}

object CommentRenderer : EditorCustomElementRenderer {

    override fun calcWidthInPixels(inlay: Inlay<*>) = 30
    override fun calcHeightInPixels(inlay: Inlay<*>) = 30

    override fun paint(inlay: Inlay<*>, g: Graphics, r: Rectangle, textAttributes: TextAttributes) {
        val backgroundColor = textAttributes.backgroundColor
        g.color = backgroundColor
        g.fillRoundRect(r.x + 2, r.y + 1, r.width - 4, r.height - 5 * 2, 8, 8)
    }
}