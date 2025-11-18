package felipemeschiatti.com.github.gs2_android


fun calcularImc(peso: Double, altura: Double): Double {
    if (altura <= 0.0) return 0.0
    return peso / (altura * altura)
}

fun formatarResultadoImc(nome: String, imc: Double): String {
    return "Olá $nome,\nSeu IMC é: %.2f".format(imc)
}
