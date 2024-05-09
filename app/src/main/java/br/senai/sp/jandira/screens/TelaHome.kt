package br.senai.sp.jandira.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.repository.ContatoRepository

@Composable
fun TelaHome() {
    val cr = ContatoRepository(LocalContext.current)
    
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(32.dp)
    ) {
        LazyColumn{
            items(cr.listarTodosOsContatos()){
                Card(
                    modifier = Modifier.fillMaxWidth()
                        .padding(bottom = 4.dp)
                ) {
                    Text(text = it.nome)
                    Text(text = it.email)
                }
            }
        } 
    }
}