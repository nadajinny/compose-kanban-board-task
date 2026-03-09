package woowacourse.kanban.board.model

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertIs

class DescriptionTest {
    @Test
    fun `텍스트로 Description 객체를 생성할 수 있다`() {
        val description = Description("Description text")
        assertIs<Description>(description)
        val content = description as Description
        assert(content.text == "Description text")
    }
    @Test
    fun `빈 공란으로도 Description 객체를 생성할 수 있다`() {
        val description = Description("")
        assertIs<Description>(description)
        val content = description as Description
        assert(content.text == "Description text")
    }
}
