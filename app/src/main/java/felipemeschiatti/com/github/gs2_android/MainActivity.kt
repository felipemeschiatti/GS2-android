package felipemeschiatti.com.github.gs2_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

// Importando as telas do seu pacote screens
import felipemeschiatti.com.github.gs2_android.screens.LoginScreen
import felipemeschiatti.com.github.gs2_android.screens.MenuScreen
import felipemeschiatti.com.github.gs2_android.screens.ImcScreen
import felipemeschiatti.com.github.gs2_android.screens.EquipeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    // Chama a nossa navegação manual
                    AppNavigationManual()
                }
            }
        }
    }
}

@Composable
fun AppNavigationManual() {
    // Variável que controla qual tela está aparecendo
    // Começa no "login"
    var telaAtual by remember { mutableStateOf("login") }

    // Verifica qual é a telaAtual e mostra a tela correspondente
    when (telaAtual) {
        "login" -> LoginScreen(onNavigate = { novaTela -> telaAtual = novaTela })
        "menu" -> MenuScreen(onNavigate = { novaTela -> telaAtual = novaTela })
        "imc" -> ImcScreen(onNavigate = { novaTela -> telaAtual = novaTela })
        "equipe" -> EquipeScreen(onNavigate = { novaTela -> telaAtual = novaTela })
    }
}