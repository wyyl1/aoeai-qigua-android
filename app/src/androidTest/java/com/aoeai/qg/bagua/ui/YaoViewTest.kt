package com.aoeai.qg.bagua.ui

import androidx.compose.ui.test.junit4.createComposeRule
import com.aoeai.qg.common.ui.ControlPanelTest
import org.junit.Rule
import org.junit.Test


class YaoViewTest {
    @get:Rule
    val rule = createComposeRule()

    @Test
    fun should_show_text_with_same_number_when_number_button_is_clicked() {
        rule.setContent { YaoView() }

        ControlPanelTest.verifyNumberTextAfterClick(rule, listOf("1", "2", "3", "6"))
    }
}
