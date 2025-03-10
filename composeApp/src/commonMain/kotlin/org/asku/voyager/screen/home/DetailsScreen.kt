package org.asku.voyager.screen.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator

data class DetailsScreen(val number: Int) : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current
       Scaffold(
           topBar = {
               TopAppBar(
                   title = { Text("Details") },
                   navigationIcon = {
                       IconButton(onClick = {navigator?.pop()}) {
                           Icon(
                               imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                               contentDescription = "Back Arrow Icon"
                           )
                       }
                   }
               )
           }
       ) {

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Button(onClick = {}) {
                Text("Details Screen ($number)")
            }
        }
       }
    }
}