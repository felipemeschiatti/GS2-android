package felipemeschiatti.com.github.gs2_android.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
// Agora recebe 'onNavigate' em vez de 'navController'
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

                Text(text = "Aluno 1: [Seu Nome] - RM: [Seu RM]", fontSize = 16.sp)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Aluno 2: [Nome Dupla] - RM: [RM Dupla]", fontSize = 16.sp)
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