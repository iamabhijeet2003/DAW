<script>
import PrioritatVisor from './PrioritatVisor.vue';

    export default{
        props:{
            tasques:Array
        },
        methods:{
            clickEliminar(tasca){
               
               
               if(confirm("Esta segur")){
                this.$emit("EliminarTasca",tasca)
               }
            },
            actualizarPrioridad(tasca, novaPrioritat) {
                tasca.prioritat = novaPrioritat;
            },
        },
        components:{
    PrioritatVisor,
    
}
       
    }
</script>

<template>
        <table class="table">
            <thead>
                <th>Id</th>
                <th>Text</th>
                <th>Insercio</th>
                <th>Completada</th>
                <th>Data Completada</th>
                
                <th>Prioridad</th>
                <th>Estat</th>
            </thead>
       
        <tbody>
            <tr v-for="tasca in tasques" :key="tasca.id">
                <th>{{ tasca.id }}</th>
                <td>{{ tasca.text }}</td>
                <td>{{ tasca.insercion }}</td>
                <td>{{ tasca.completada}}</td>
                <td>{{ tasca.dataCompletada}}</td>
                <td>
                    {{ tasca.prioritat }}
                    <PrioritatVisor :PrioritatInicial="tasca.prioritat" @actualizar-prioridad="actualizarPrioridad(tasca, $event)"/>
                </td>
                <td>
                    <button v-if="tasca.completada" class="btn btn-success">Completada</button>
                    <button v-else class="btn btn-warning">Incompletada</button>
                </td>

                
                <td>
                    <button class="btn btn-info" >✏️ Editar</button>
                </td>
                
                <td>
                    <button @click="clickEliminar(tasca)" class="btn btn-danger ms-2">🗑️ Eliminar</button>
                </td>
            </tr>
            
        </tbody>
         </table>
</template>