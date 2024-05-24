package br.unisanta.model

import com.google.gson.annotations.SerializedName

class Endereco (@SerializedName("cep") val cep:String,
                @SerializedName("logradouro") val rua:String,
                @SerializedName("complemento") val numero:String,
                @SerializedName("bairro") val bairro:String,
                @SerializedName("localidade") val cidade:String,
                @SerializedName("uf") val estado:String){
    override fun toString(): String {
        return "Endereco(" +
                " cep='$cep'," +
                " rua='$rua'," +
                " numero='$numero'," +
                " bairro='$bairro'," +
                " cidade='$cidade'," +
                " UF ='$estado)"
    }
}