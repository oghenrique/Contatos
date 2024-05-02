package br.senai.sp.jandira.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddAPhoto
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.QuestionMark
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import br.senai.sp.jandira.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TelaCadastro() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF10238D)
    ) {
        Card(
            modifier = Modifier.padding(8.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Card(
                        modifier = Modifier
                            .size(width = 32.dp, height = 32.dp),
                        shape = CircleShape,
                        colors =    CardDefaults.cardColors(containerColor = Color.Black)
                    ) {
                        Box(modifier = Modifier
                            .fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ){
                            Icon(imageVector = Icons.Default.ArrowBack,
                                contentDescription = "Seta voltar",
                                tint = Color.White
                            )
                        }
                    }
                    Box(
                        contentAlignment = Alignment.BottomEnd,
                        modifier = Modifier.size(width = 150.dp, height = 140.dp)
                    ){
                        Card(
                            modifier = Modifier
                                .size(width = 130.dp, height = 130.dp)
                                .align(alignment = Alignment.Center),
                            colors = CardDefaults.cardColors(containerColor = Color.Gray),
                            shape = CircleShape
                        ) {
                            Icon(imageVector = Icons.Default.AccountCircle,
                                contentDescription = "")
                        }
                        Card(
                            modifier = Modifier.size(width = 50.dp, height = 50.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.Magenta),
                            shape = CircleShape
                        ){
                            Box(modifier = Modifier
                                .fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ){
                                Icon(imageVector = Icons.Default.AddAPhoto,
                                    contentDescription = "Trocar foto",
                                    tint = Color.White
                                )
                            }
                        }
                    }
                    Card(
                            modifier = Modifier
                                .size(width = 32.dp, height = 32.dp),
                    shape = CircleShape,
                    colors =    CardDefaults.cardColors(containerColor = Color.Black)
                    ) {
                        Box(modifier = Modifier
                            .fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ){
                            Icon(imageVector = Icons.Default.QuestionMark,
                                contentDescription = "Mais informações",
                                tint = Color.White
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(24.dp))
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp),
                    label = {
                        Text(text = stringResource(id = R.string.contact_name))
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Person,
                            contentDescription = "" )
                    }
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp),
                    label = {
                        Text(text = stringResource(id = R.string.contact_phone))
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Phone,
                            contentDescription = "" )
                    }
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp),
                    label = {
                        Text(text = stringResource(id = R.string.contact_email))
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Email,
                            contentDescription = "" )
                    }
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp),
                    label = {
                        Text(text = stringResource(id = R.string.contact_birth))
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.CalendarMonth,
                            contentDescription = "" )
                    }
                )
                Row(
                    modifier = Modifier
                        .padding(24.dp),
                    verticalAlignment =     Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = false,
                        onCheckedChange = {}
                    )
                    Text(
                        text = stringResource(id = R.string.contact_friend)
                    )
                }
                Spacer(modifier = Modifier.height(24.dp))
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp),
                    shape = RoundedCornerShape(8.dp),
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = stringResource(id = R.string.save_contact))
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun TelaCadastroPreview() {
    TelaCadastro()
}