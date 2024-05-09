package br.senai.sp.jandira.repository

import android.content.Context
import br.senai.sp.jandira.dao.ContatoDb
import br.senai.sp.jandira.model.Contato

class ContatoRepository(context: Context) {

    private val db = ContatoDb.getBancoDeDados(context).contatoDao()

    fun salvar (contato: Contato):Long{
        return db.salvar(contato)
    }

    fun listarTodosOsContatos(): List<Contato>{
        return db.listarTodosOsContatos()
    }


}