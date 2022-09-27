package com.junior.todo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.junior.todo.databinding.CardLayoutBinding
import com.junior.todo.model.Tarefa

class TarefaAdapter: RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>(){

    private var listTarefa = emptyList<Tarefa>()

    class TarefaViewHolder(val binding: CardLayoutBinding): RecyclerView.ViewHolder(binding.root){

    }
    // Serve para criar o layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
       return  TarefaViewHolder(CardLayoutBinding.inflate(
           LayoutInflater.from(parent.context),
           parent,
           false
       )
       )
    }

    // Coloca as informações dentro de cada componente
    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val tarefa = listTarefa[position]

        holder.binding.textNome.text = tarefa.nome
        holder.binding.textDescricao.text = tarefa.descricao
        holder.binding.textResponsavel.text = tarefa.responsavel
        holder.binding.textData.text = tarefa.data
        holder.binding.switchAtivo.isChecked = tarefa.status
        holder.binding.textCategoria.text = tarefa.categoria
    }

    // Conta quantas vezes o metodo rodou
    override fun getItemCount(): Int {
        return listTarefa.size
    }

    fun setList(list: List<Tarefa>){
        listTarefa = list
        notifyDataSetChanged()
    }
}