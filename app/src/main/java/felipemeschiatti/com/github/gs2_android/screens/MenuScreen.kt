package felipemeschiatti.com.github.gs2_android.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MenuScreen(onNavigate: (String) -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "MENU", fontSize = 24.sp, modifier = Modifier.padding(bottom = 32.dp))

        Button(
            onClick = { onNavigate("imc") },
            modifier = Modifier.fillMaxWidth().height(50.dp)
        ) {
            Text("Cálculo de IMC")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { onNavigate("equipe") },
            modifier = Modifier.fillMaxWidth().height(50.dp)
        ) {
            Text("Equipe")
        }

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedButton(
            onClick = { onNavigate("login") },
            modifier = Modifier.fillMaxWidth().height(50.dp)
        ) {
            Text("Voltar")
        }
    }
}
