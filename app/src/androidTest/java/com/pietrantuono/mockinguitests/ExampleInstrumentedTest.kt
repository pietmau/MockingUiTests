package com.pietrantuono.mockinguitests

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.pietrantuono.mockinguitests.ui.theme.MockingUiTestsTheme
import io.mockk.every
import io.mockk.mockk

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

class ExampleInstrumentedTest {

    @get:Rule
    val composeTestRule = createComposeRule()
    @Test
    fun useAppContext() {
        val foo = mockk<Foo> {
            every { bar() } returns "mocked"
        }
        foo.bar()
        composeTestRule.setContent {
            MockingUiTestsTheme {
                Greeting("Hello!")
            }
        }
    }
}