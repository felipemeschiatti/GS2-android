package felipemeschiatti.com.github.gs2_android.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EquipeScreen(onNavigate: (String) -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "EQUIPE", fontSize = 24.sp, modifier = Modifier.padding(bottom = 32.dp))

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Integrantes:", fontSize = 20.sp, modifier = Modifier.padding(bottom = 8.dp))

                Text(text = "Aluno 1: Felipe Pereira Meschiatti - RM: 551978 ", fontSize = 16.sp)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Aluno 2: Caua Fernandes - RM: 551765", fontSize = 16.sp)
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        OutlinedButton(
            onClick = { onNavigate("menu") },
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
        ) {
            Text("Voltar")
        }
    }
}
