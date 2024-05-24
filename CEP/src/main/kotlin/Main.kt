import br.unisanta.model.Endereco
import com.google.gson.Gson
import br.unisanta.services.ConsomeAPI


fun main() {
    print("Digite seu CEP: ")
    val cep = readln()

    val consome = ConsomeAPI()
    val json = consome.ObterDados("https://viacep.com.br/ws/$cep/json")

    val gson = Gson()
    val meuEndereco = gson.fromJson(json, Endereco::class.java)
    println(meuEndereco)
}