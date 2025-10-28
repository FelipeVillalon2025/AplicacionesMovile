package com.example.myapplication.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class EmergencyContact(val name: String, val number: String)

val emergencyContacts = listOf(
    EmergencyContact("Ambulancia", "131"),
    EmergencyContact("Bomberos", "132"),
    EmergencyContact("Policía", "133"),
    EmergencyContact("Emergencias", "911"),
)

val personalContacts = listOf(
    EmergencyContact("Papá", ""),
    EmergencyContact("Mamá", ""),
)

@Composable
fun EmergencyContactsScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Contactos de Emergencia", style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold)
        emergencyContacts.forEach {
            ContactCard(contact = it)
        }

        Text("Contactos Personales", style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 16.dp))
        personalContacts.forEach {
            ContactCard(contact = it)
        }
    }
}

@Composable
fun ContactCard(contact: EmergencyContact) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = contact.name, fontWeight = FontWeight.Bold)
            Text(text = contact.number)
        }
    }
}
