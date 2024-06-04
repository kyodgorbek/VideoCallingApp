package com.example.videocallingapp.connect

import android.app.Application
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.videocallingapp.VideoCallingApp
import io.mockk.mockk
import io.mockk.verify
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule

class ConnectViewModelTest {

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    private lateinit var viewModel: ConnectViewModel
    private lateinit var application: Application

    @Before
    fun setUp() {
        application = mockk<VideoCallingApp>(relaxed = true)
        viewModel = ConnectViewModel(application)
    }

    @Test
    fun `when name changes, state is updated`() {
        val name = "John Doe"
        viewModel.onAction(ConnectAction.OnNameChange(name))
        assertEquals(name, viewModel.state.name)
    }

    @Test
    fun `when connect is clicked with blank name, error is shown`() {
        viewModel.onAction(ConnectAction.OnConnectClick)
        assertEquals("The username can't black.", viewModel.state.errorMessage)
    }

    @Test
    fun `when connect is clicked with valid name, isConnected is true`() {
        val name = "John Doe"
        viewModel.onAction(ConnectAction.OnNameChange(name))
        viewModel.onAction(ConnectAction.OnConnectClick)
        assertEquals(true, viewModel.state.isConnected)
        assertEquals(null, viewModel.state.errorMessage)

        verify { (application as VideoCallingApp).initVideoClient(name) }
    }
}